package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper接口
@MapperScan("com.accp.mapper")
public class Java2Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Java2Springboot1Application.class, args);
	}

}
