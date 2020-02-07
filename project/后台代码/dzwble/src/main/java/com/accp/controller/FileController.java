package com.accp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Customer;

@RestController
public class FileController {

	//读取application.properties中的路径
	@Value("${fileupload-url}")
	private String fileuploadUrl;//d://Y2/images/
	
	//文件上传
	@PostMapping("/fileUpload")
	public String fileUpload(MultipartFile [] file,Customer cus) {
		//传入的参数名称要和前台form表单中文件上传的name一样
		try {
			for(MultipartFile f : file) {
				//产生随机名称
				String fileName = UUID.randomUUID().toString();
				//获取文件后缀
				String suffix = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."),f.getOriginalFilename().length());
				//构建传输对象
				File toFile = new File(fileuploadUrl+fileName+suffix);
				//开始传输文件
				f.transferTo(toFile);
			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//文件下载
	@GetMapping("/download")
	public ResponseEntity<byte []> download(String fileName) {
		try {
			//从磁盘中提取文件
			FileInputStream fis = new FileInputStream(fileuploadUrl+fileName);
			byte [] bytes = new byte[fis.available()];
			//将文件保存在字节数组中
			fis.read(bytes);
			//定义http请求头
			HttpHeaders headers = new HttpHeaders();
			//如果下载的文件名是有中文 new String("".getBytes("utf-8"),"iso-8859-1");
			//第一个参数固定"attachment",第二个参数是下载后的文件名称并转码
			headers.setContentDispositionFormData("attachment", new String(fileName.getBytes("utf-8"),"iso-8859-1"));
			//传输类型为流
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			//返回结果
			return new ResponseEntity<byte []>(bytes,headers,HttpStatus.OK);
											  //响应内容，请求头，状态
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
}
