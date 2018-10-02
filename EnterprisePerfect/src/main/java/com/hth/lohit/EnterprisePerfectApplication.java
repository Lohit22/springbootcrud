package com.hth.lohit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EnterprisePerfectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnterprisePerfectApplication.class, args);
	}
}
