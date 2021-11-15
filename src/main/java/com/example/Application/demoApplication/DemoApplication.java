package com.example.Application.demoApplication;

import com.example.Application.demoApplication.mvc1.AppInitializer1;
import com.example.Application.demoApplication.mvc2.AppInitializer2;
import com.example.Application.demoApplication.mvc3.AppInitializer3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{DemoApplication.class,AppInitializer1.class, AppInitializer2.class,AppInitializer3.class} ,args);
	}



	

	/*@Bean
	public ServletRegistrationBean appliation1() {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig.class);
		dispatcherServlet.setApplicationContext(applicationContext);
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app1/*");
		servletRegistrationBean.setName("app1");
		servletRegistrationBean.setLoadOnStartup(1);
		return servletRegistrationBean;
	}*/
	/*@Bean
	public ServletRegistrationBean application2() {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig1.class);
		dispatcherServlet.setApplicationContext(applicationContext);
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app2/*");
		servletRegistrationBean.setName("app2/*");
		servletRegistrationBean.setLoadOnStartup(2);
		return servletRegistrationBean;
	}*/

	/*@Bean
	public ServletRegistrationBean application3() {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(AppConfig2.class);
		dispatcherServlet.setApplicationContext(applicationContext);
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(dispatcherServlet, "/app3/*");
		servletRegistrationBean.setName("app3/*");
		servletRegistrationBean.setLoadOnStartup(2);
		return servletRegistrationBean;
	}*/

}
