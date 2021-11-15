package com.example.Application.demoApplication.mvc3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages ={ "com.example.Application.demoApplication.API.API","com.example.Application.demoApplication.mvc3"})
public class AppConfig2 implements WebMvcConfigurer {
}
