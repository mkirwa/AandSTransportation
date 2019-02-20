package aands.controller;

import java.util.List;


import aands.model.Admin;
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
	
	@RequestMapping(value="/list",method= RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("admin/admin_page");
		
		List<Admin> list = adminService.listAllAdmins();
		model.addObject("listAdmin",list);
		return model;
		
	}
	
	@RequestMapping(value="/add",method= RequestMethod.GET)
	public ModelAndView add() {
		
		ModelAndView model = new ModelAndView("admin/admin_form");
		Admin admin = new Admin();
		model.addObject("adminForm",admin);
		return model;
		
	}
	
}
