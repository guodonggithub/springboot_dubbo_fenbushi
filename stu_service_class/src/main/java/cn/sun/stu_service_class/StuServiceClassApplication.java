package cn.sun.stu_service_class;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.sun")
@MapperScan("cn.sun.dao")
@DubboComponentScan("cn.sun.serviceimpl")
public class StuServiceClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuServiceClassApplication.class, args);
	}

}
