package com.prapamab.AandSTransportation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//when you request from the browser using /test/hello
		//the method helloWorld will be called
		//and that will in turn return the view name which is "hello"
		//so basically this view will be the JSP
		//it is resolved using view resolver 
		//WEB-INF is the prefix.....
		//hello.jsp...the .jsp is the suffix
		@RequestMapping("/test/hello")
		public String helloWorld(){
			//hello is the view name
			return "hello";//
		}
}
