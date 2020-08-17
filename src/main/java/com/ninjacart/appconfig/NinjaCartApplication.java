package com.ninjacart.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ninjacart")

public class NinjaCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaCartApplication.class, args);
	}

}
