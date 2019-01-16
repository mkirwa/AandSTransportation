package com.prapamab.AandSTransportation.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//configuration is imported from context annotation configuration
@Configuration
//telling spring to search classes from component scanner and 
//we will specify the basepackages(used to set the classes, controllers and all)
//spring scans classes from com.prapamab packages
@ComponentScan(basePackages= {"com.prapamab.AandSTransportation"})
public class SpringRootConfig {
	
	//TODO: add services, DAO, DataSource, Email sender or other business
	//layer beans
	

}
