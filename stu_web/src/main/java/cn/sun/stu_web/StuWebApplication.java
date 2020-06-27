package cn.sun.stu_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.sun")
public class StuWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuWebApplication.class, args);
	}

}
