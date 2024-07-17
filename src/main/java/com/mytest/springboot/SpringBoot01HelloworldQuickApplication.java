package com.mytest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SpringBoot01HelloworldQuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot01HelloworldQuickApplication.class, args);
	}

}
