package com.prapamab.AandSTransportation.config;
//Defines a set of methods that a servlet uses to communicate 
//with its servlet container, for example, to get the MIME type of a file,
//dispatch requests, or write to a log file.
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//the front initializer will be initialized by this particular class

public class AdminDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
		@Override
		//here, you have to return the root configuration
		//there could be multiple root configurations
		//it's for this reason that it is returning class
		//array. ---Class<?>[] ----
		protected Class<?>[] getRootConfigClasses() {
			// TODO Auto-generated method stub
			//this is actually the business layer
			return new Class[]{SpringRootConfig.class};
		
		}
		@Override
		//this is web specific beans
		protected Class<?>[] getServletConfigClasses() {
			// TODO Auto-generated method stub
			return new Class[]{SpringWebConfig.class};
			
		}	
		@Override
		//dispatcher servlet is a front controller
		//it will receive a specific pattern of the url
		//there can be multiple patterns here since
		//servlets can allow multiple mappings
		//hence the front controller will receive all 
		//the requests for example /admin/blah....
		protected String[] getServletMappings() {
			// TODO Auto-generated method stub
			return new String[]{"/"};
		}
		
		//You can add this method here if required in future
		//sometimes when you write a complex web application or
		//you are upgrading your old application to the new application
		//don't ignore this....must be present. If this is missed, 
		//then the application might not work
		//ServletContext is the object for the whole application
		@Override
		public void onStartup(ServletContext servletContext) throws ServletException{
			super.onStartup(servletContext);//don't miss this line....if you do the framework won't start
			//configure global objects/tasks here if required...
		}
}
