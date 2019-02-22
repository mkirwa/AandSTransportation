package aands.config;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "aands")

public class WebConfig implements WebMvcConfigurer{
		@Autowired
		DataSource dataSource;
		@Bean
		public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
			return new NamedParameterJdbcTemplate(dataSource);
		}
		
		@Bean
		public DataSource getDataSource() throws NamingException{
			JndiTemplate jndiTemplate = new JndiTemplate();
			DataSource dataSource = (DataSource) jndiTemplate.lookup("java:comp/env/jdbc/springmvc");
			
			return dataSource;
			
		}
		
		//this method handles static resources...
		//spring won't allow any resources to be accessed on the JSP page
		//if it's not configured!
		//so to access static resources like style CSS files
		//JavaScript files or some other static resources
		//they must be added here
		public void addResourceHandlers(ResourceHandlerRegistry registry){
			//TODO: add the static resources here
			
		}
			
		@Bean
		public ViewResolver viewResolver() {
			//internal resource refer to the resources available inside the 
			//private location.
			//the private directory is your web information folder. 
			//because no one can access the contents from the browser directly

			InternalResourceViewResolver vr = new InternalResourceViewResolver();
			vr.setViewClass(JstlView.class);
			//prefix defines the location where JSPs are available
			vr.setPrefix("WEB-INF/view/");
			//suffix is the extension of your view
			vr.setSuffix(".jsp");
			return vr;
		}

}
