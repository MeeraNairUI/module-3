package com.ust.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="helloBean")
	public Helloworld getBean() {
		return new HelloWorldImp();
	}

}
