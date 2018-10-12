package com.rockfintech.reas.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@EnableSwagger2
@ImportResource("classpath:applicationContext-rabbitmq.xml")
public class MainApplication {
	public static void main(String[] args) {
	       SpringApplication.run(MainApplication.class, args);
	}
}
