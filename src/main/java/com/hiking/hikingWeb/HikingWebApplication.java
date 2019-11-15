package com.hiking.hikingWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.hiking.rest.caminatasRestController;

@SpringBootApplication
@ComponentScan(basePackageClasses = caminatasRestController.class)
public class HikingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikingWebApplication.class, args);
	}

}
