package com.example.Application.demoApplication.mvc1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.example.Application.demoApplication.API.API","com.example.Application.demoApplication.mvc1"})
public class AppConfig implements WebMvcConfigurer {
}

//registering app config so dispatcher servlet will read this config file and create web app context out of this file .
