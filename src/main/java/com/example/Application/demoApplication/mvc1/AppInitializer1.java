package com.example.Application.demoApplication.mvc1;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class AppInitializer1  {

    @Bean
    public ServletRegistrationBean appliation1() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app1/*");
        servletRegistrationBean.setName("app1");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

    /*@Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        registerServlet(servletContext);

    }
       *//* @Bean*//*
        public void registerServlet(ServletContext servletContext){
            AnnotationConfigWebApplicationContext webApp = new AnnotationConfigWebApplicationContext();
            webApp.register(AppConfig.class);

            DispatcherServlet dispatcherServlet1 = new DispatcherServlet(webApp);
            ServletRegistration.Dynamic customDispatcherServlet = servletContext.addServlet("dispatcherservlet1", dispatcherServlet1);
            customDispatcherServlet.setLoadOnStartup(1);
            customDispatcherServlet.addMapping("/apps1/*");

        }
*/

  /*  @Bean
    public ServletRegistrationBean appliation1() {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(AppInitializer1.class);
        dispatcherServlet.setApplicationContext(applicationContext);
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app1/*");
        servletRegistrationBean.setName("app1");
        servletRegistrationBean.setLoadOnStartup(1);
        System.out.println("from initializer1");
        return servletRegistrationBean;
    }*/
}
