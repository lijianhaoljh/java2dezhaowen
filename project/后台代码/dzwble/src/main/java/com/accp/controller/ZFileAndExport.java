package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.xml.ws.spi.http.HttpHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.CommodityInfo;
import com.accp.service.ZCommodityInfoService;

@RestController
@RequestMapping("/ZFileAndExport")
public class ZFileAndExport {
		
		@Autowired
		ZCommodityInfoService service;
	
		@Value("${fileupload-url}")
		private String fileuploadUrl;
		
		@PostMapping
		public String fileUpload(MultipartFile [] file) {
			for (MultipartFile f :file) {
				String fileName = UUID.randomUUID().toString(); 
				String suffix = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."), f.getOriginalFilename().length());
				File toFile = new File(fileuploadUrl+fileName+suffix);
				try {
					f.transferTo(toFile);
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
			}
			return null;
		}
		
		@GetMapping("/exportExcel")
		public ResponseEntity<byte []> exportExcel(){
			List<CommodityInfo> list=service.DataQuery();
			
			Workbook wb = new XSSFWorkbook();
			Sheet sheet= wb.createSheet("数据");
			
			for (int i = 0; i < list.size(); i++) {
				Row row= sheet.createRow(i);
				Cell cell1=row.createCell(0);
				Cell cell2=row.createCell(1);
				Cell cell3=row.createCell(2);
				Cell cell4=row.createCell(3);
				Cell cell5=row.createCell(4);
				Cell cell6=row.createCell(5);
				Cell cell7=row.createCell(6);
				Cell cell8=row.createCell(7);
				Cell cell9=row.createCell(8);
				Cell cell10=row.createCell(9);
				Cell cell11=row.createCell(10);
				Cell cell12=row.createCell(11);
				Cell cell13=row.createCell(12);
				Cell cell14=row.createCell(13);
				Cell cell15=row.createCell(14);
				Cell cell16=row.createCell(15);
				Cell cell17=row.createCell(16);
				Cell cell18=row.createCell(17);
				Cell cell19=row.createCell(18);
				cell1.setCellValue(list.get(i).getCno());
				if(list.get(i).getCname()==null) {
					list.get(i).setCname("");
				}
				cell2.setCellValue(list.get(i).getCname());
				
				if(list.get(i).getZcbname()==null) {
					list.get(i).setZcbname("");
				}			
				cell3.setCellValue(list.get(i).getZcbname());
				
				if(list.get(i).getVehicletype()==null) {
					list.get(i).setVehicletype("");
				}	
				cell4.setCellValue(list.get(i).getVehicletype());
				
				if(list.get(i).getZcuname()==null) {
					list.get(i).setZcuname("");
				}
				cell5.setCellValue(list.get(i).getZcuname());
				
				
				if(list.get(i).getZgame()==null) {
					list.get(i).setZgame("");
				}
				cell6.setCellValue(list.get(i).getZgame());
				
				if(list.get(i).getZtoname()==null) {
					list.get(i).setZtoname("");
				}
				cell7.setCellValue(list.get(i).getZtoname());
				
				if(list.get(i).getZconame()==null) {
					list.get(i).setZconame("");
				}
				cell8.setCellValue(list.get(i).getZconame());
				
				if(list.get(i).getZgcname()==null) {
					list.get(i).setZgcname("");
				}
				cell9.setCellValue(list.get(i).getZgcname());
				
				if(list.get(i).getZpname()==null) {
					list.get(i).setZpname("");
				}
				cell10.setCellValue(list.get(i).getZpname());
				
				if(list.get(i).getZmfname()==null) {
					list.get(i).setZmfname("");
				}
				cell11.setCellValue(list.get(i).getZmfname());
				
				if(list.get(i).getOrigin()==null) {
					list.get(i).setOrigin("");
				}
				cell12.setCellValue(list.get(i).getOrigin());
				
				if(list.get(i).getBarcode()==null) {
					list.get(i).setBarcode("");
				}
				cell13.setCellValue(list.get(i).getBarcode());	
				
				if(list.get(i).getPack()==null) {
					list.get(i).setPack("");
				}
				cell14.setCellValue(list.get(i).getPack());
				
				if(list.get(i).getVolume()==null) {
					list.get(i).setVolume(0.0f);
				}
				cell15.setCellValue(list.get(i).getVolume());
				
				if(list.get(i).getGrossweight()==null) {
					list.get(i).setGrossweight(0.0f);
				}
				cell16.setCellValue(list.get(i).getGrossweight());
				
				if(list.get(i).getNetweight()==null) {
					list.get(i).setNetweight(0.0f);
				}
				cell17.setCellValue(list.get(i).getNetweight());
				
				if(list.get(i).getMarkup()==null) {
					list.get(i).setMarkup(0.0f);
				}
				cell18.setCellValue(list.get(i).getMarkup());
				
				if(list.get(i).getExchangecode()==null) {
					list.get(i).setExchangecode("");
				}
				cell19.setCellValue(list.get(i).getExchangecode());
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();		
			try {
				wb.write(baos);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			HttpHeaders headers = new HttpHeaders();
			try {
				headers.setContentDispositionFormData("attachment", new String("数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
 			return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
		}
}	
