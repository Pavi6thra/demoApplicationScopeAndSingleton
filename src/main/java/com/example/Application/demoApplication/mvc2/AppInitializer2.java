package com.example.Application.demoApplication.mvc2;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/*@WebServlet*/
@Configuration
public class AppInitializer2  {

    @Bean
    public ServletRegistrationBean application2() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig1.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app2/*");
        servletRegistrationBean.setName("app2/*");
        servletRegistrationBean.setLoadOnStartup(2);
        return servletRegistrationBean;
    }



   /* @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        register(servletContext);
    }
       *//* @Bean*//*
        public void register(ServletContext servletContext){
        AnnotationConfigWebApplicationContext webApp1=new AnnotationConfigWebApplicationContext();
        webApp1.register(AppConfig1.class);
        DispatcherServlet dispatcherServlet2=new DispatcherServlet(webApp1);
        ServletRegistration.Dynamic customServlet2=servletContext.addServlet("dispatcherservlet2",dispatcherServlet2);
        customServlet2.setLoadOnStartup(2);
        customServlet2.addMapping("/apps2/*");

    }*/
/*
    @Bean
    public ServletRegistrationBean application2() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppInitializer2.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app2/*");
        servletRegistrationBean.setName("app2/*");
        servletRegistrationBean.setLoadOnStartup(2);
        System.out.println("from initializer2");
        return servletRegistrationBean;
    }*/
}
