package com.accp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.People;

@RestController
public class FileController {
	//读取application.properties中的路径
	@Value("${fileupload-url}")
	private String fileuploadUrl;//c://images/
	
	@PostMapping("/fileUpload")
	public String fileUpload(MultipartFile [] file,People p){
		try {
			//循环提取文件
			for(MultipartFile f : file) {
				//解决文件名重复，进行随机文件名称
				String fileName = UUID.randomUUID().toString();
				//获取传输过来文件后缀
				String suffix = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."), f.getOriginalFilename().length());
				//构建文件传输对象
				File toFile = new File(fileuploadUrl+fileName+suffix);
				//开始传输文件
				f.transferTo(toFile);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return "00001";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "00002";
		}
		return "00000";
	}
	
	@GetMapping("/download")
	public ResponseEntity<byte []> download(String fileName){
		try {
			//从磁盘中提取文件
			FileInputStream fis = new FileInputStream(fileuploadUrl+fileName);
			byte [] bytes = new byte[fis.available()];
			//将文件保存字节数组中
			fis.read(bytes);
			//定义http请求头
			HttpHeaders headers = new HttpHeaders();
			//第一个参数固定，第二个参数是下载后的文件名称，并转码
			headers.setContentDispositionFormData("attachment",new String(fileName.getBytes("utf-8"),"iso-8859-1"));
			//传输类型为流
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			//返回结果
			return new ResponseEntity<byte[]>(bytes,headers,HttpStatus.OK);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}
