package com.example.Application.demoApplication.mvc3;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class AppInitializer3 {

    @Bean
    public ServletRegistrationBean application3() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig2.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app3/*");
        servletRegistrationBean.setName("app3/*");
        servletRegistrationBean.setLoadOnStartup(2);
        return servletRegistrationBean;
    }
}
