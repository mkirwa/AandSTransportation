package aands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aandsspring.service.AdminService;
//when a request is made to a spring application, 
//the controller is responsible for returning the response
//to that request.
//the controller action can return different types of action results 
//to a particular request
//the Controller is responsible for controlling the application logic and 
//acts as the coordinator between the View and the Model. 
//The Controller receives an input from the users via the View,
//then processes the user's data with the help of Model and passes the results back to the View.
@Controller
@RequestMapping(value="/Admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="",method= RequestMethod.GET)
	public ModelAndView list() {
		return null;
		
	}
}
