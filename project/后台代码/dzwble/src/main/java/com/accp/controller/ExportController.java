package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Staff;
import com.accp.service.CustomerAndCarService;

@RestController
@RequestMapping("/exportexcel")
public class ExportController {

	@Autowired
	private CustomerAndCarService ser;
	
	@GetMapping("/export")
	public ResponseEntity<byte []> exportExcel(Integer mid) throws IOException{
		List<Staff> list = ser.queryPeopleByMid("", mid);
		
		Workbook wb = new XSSFWorkbook();//构建新的excel
		Sheet sheet = wb.createSheet("组织机构数据");//创建页签
		
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("部门编号");
		titleRow.createCell(1).setCellValue("部门名称");
		titleRow.createCell(2).setCellValue("员工编号");
		titleRow.createCell(3).setCellValue("员工姓名");
		titleRow.createCell(4).setCellValue("员工性别");
		titleRow.createCell(5).setCellValue("岗位名称");
		titleRow.createCell(6).setCellValue("专业名称");
		titleRow.createCell(7).setCellValue("专业资格");
		titleRow.createCell(8).setCellValue("身份证号");
		titleRow.createCell(9).setCellValue("户口地址");
		titleRow.createCell(10).setCellValue("邮箱");
		titleRow.createCell(11).setCellValue("现住地址");
		titleRow.createCell(12).setCellValue("手机");
		titleRow.createCell(13).setCellValue("电话");
		titleRow.createCell(14).setCellValue("邮编");
		
		for(int i = 0; i < list.size(); i++) {
			Row row = sheet.createRow(i+1);//创建行
			 Cell mid1 = row.createCell(0);
			 Cell mname = row.createCell(1); 
			 Cell pno  = row.createCell(2);
			 Cell pname = row.createCell(3);
			 Cell psex = row.createCell(4);
			 Cell jname = row.createCell(5);
//			 Cell shealth = row.createCell(6);
//			 Cell sheight = row.createCell(7);
//			 Cell splace = row.createCell(8);
//			 Cell snation = row.createCell(9);
//			 Cell smarry = row.createCell(10);
//			 Cell seducation = row.createCell(11);
//			 Cell sschool = row.createCell(12);
			 Cell smajor = row.createCell(6);
			 Cell smajorlevel = row.createCell(7);
			 Cell pidcard = row.createCell(8);
			 Cell presidenceaddress = row.createCell(9);
			 Cell pemail = row.createCell(10);
			 Cell paddress = row.createCell(11);
			 Cell pphone = row.createCell(12);
			 Cell ptellphone = row.createCell(13);
			 Cell pemails = row.createCell(14);
//			 Cell speople = row.createCell(22);
//			 Cell speoplephone = row.createCell(23);
//			 Cell sinterniship = row.createCell(24);
//			 Cell sindate = row.createCell(25);
//			 Cell sbirthday = row.createCell(26);
//			 Cell sstarttime = row.createCell(27);
//			 Cell sendtime = row.createCell(28);
			 
			  mid1.setCellValue(list.get(i).getMid());
			  mname.setCellValue(list.get(i).getMname());
			  pno.setCellValue(list.get(i).getPno());
			  pname.setCellValue(list.get(i).getPname());
			  psex.setCellValue(list.get(i).getPsex());
			  jname.setCellValue(list.get(i).getJname());
//			  shealth.setCellValue(list.get(i).getShealth());
//			  sheight.setCellValue(list.get(i).getSheight());
//			  splace.setCellValue(list.get(i).getSplace());
//			  snation.setCellValue(list.get(i).getSnation());
//			  smarry.setCellValue(list.get(i).getSmarry());
//			  seducation.setCellValue(list.get(i).getSeducation());
//			  sschool.setCellValue(list.get(i).getSschool());
			  smajor.setCellValue(list.get(i).getSmajor());
			  smajorlevel.setCellValue(list.get(i).getSmajorlevel());
			  pidcard.setCellValue(list.get(i).getPidcard());
			  presidenceaddress.setCellValue(list.get(i).getPresidenceaddress());
			  pemail.setCellValue(list.get(i).getPemail());
			  paddress.setCellValue(list.get(i).getPaddress());
			  pphone.setCellValue(list.get(i).getPphone());
			  ptellphone.setCellValue(list.get(i).getPtellphone());
			  pemails.setCellValue(list.get(i).getPemail());
//			  speople.setCellValue(list.get(i).getSpeople());
//			  speoplephone.setCellValue(list.get(i).getSpeoplephone());
//			  sinterniship.setCellValue(list.get(i).getSinterniship());
//			  sindate.setCellValue(list.get(i).getSindate());
//			  sbirthday.setCellValue(list.get(i).getSbirthday());
//			  sstarttime.setCellValue(list.get(i).getSstarttime());
//			  sendtime.setCellValue(list.get(i).getSendtime());
		}
		//讲excel写入bytearray...中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		wb.write(baos);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentDispositionFormData("attachment",new String("组织机构导出数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
}
