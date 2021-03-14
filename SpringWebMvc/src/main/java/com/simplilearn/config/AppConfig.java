package com.simplilearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//with xml configuration this is your applicationContext.xml

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.simplilearn.controller")
public class AppConfig 
{
	@Bean(name="viewResolver")
	public ViewResolver getViewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	
			viewResolver.setPrefix("/WEB-INF/views/");
			viewResolver.setSuffix(".jsp");
			
			return viewResolver;
	}
	
}
