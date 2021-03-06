package com.mahlon.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.mahlon" })
//This is the class that is creating error 404
//Error creating bean with name 'webConfig' unsatisfied dependency expressed
//Through field 'dataSource'; 
//nested exception is 
//Error creating bean with getDataSource defined in com.mahlon.config.WebConfig
//Bean instantiation via factory method failed
public class WebConfig implements WebMvcConfigurer{

	@Autowired
	 DataSource dataSource;
	 
	 @Bean
	 public NamedParameterJdbcTemplate geNamedParameterJdbcTemplate(){
	  return new NamedParameterJdbcTemplate(dataSource);
	 }
	 
	 @Bean
	 public DataSource getDataSource() throws NamingException{
	  JndiTemplate jndiTemplate = new JndiTemplate();
	  DataSource dataSource = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/springmvc");
	  
	  return dataSource;
	 }
	 //check this out if what does resource handles do. See if it affects anything
	 //missing @override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	 }
	 
	 @Bean
	 public InternalResourceViewResolver viewResolver(){
	  InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	  viewResolver.setViewClass(JstlView.class);
	  viewResolver.setPrefix("/WEB-INF/jsp/");
	  viewResolver.setSuffix(".jsp");
	  
	  return viewResolver;
	 }
	
}