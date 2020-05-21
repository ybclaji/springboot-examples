package org.yanse.springbootmybatis01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.yanse.springbootmybatis01.mapper")
public class SpringbootMybatis01Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatis01Application.class, args);
	}
}
