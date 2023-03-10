package com.javatechie.spring.graph.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/*
* Name : Bibhuti Bhusan Sahoo
* Github: Bibhuti5
* Linked In: https://www.linkedin.com/in/bibhutibhusansahoo97/
* */
@SpringBootApplication
public class SpringHighchartApplication extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHighchartApplication.class, args);
	}
}
