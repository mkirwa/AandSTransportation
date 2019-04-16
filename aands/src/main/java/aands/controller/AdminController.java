package aands.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aands.model.Admin;
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
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="/list",method= RequestMethod.GET)
	//ModelAndView is an object that holds both the model and view
	//The handler returns the ModelAndView object and DispatcherServlet 
	//Resolves the view using View resolvers and View
	//The view is the object which contains view name in the form of the spring 
	//and model is a mapp to add multiple objects 
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("admin/admin_page");
		
		List list = adminService.listAllAdmins();
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
	
	@RequestMapping(value="/update/{idAdmin}",method= RequestMethod.GET)
	public ModelAndView update(@PathVariable("idAdmin")int idAdmin) {
		
		ModelAndView model = new ModelAndView("admin/admin_form");
		
		Admin admin = adminService.findAdminbyId(idAdmin);
		
		model.addObject("adminForm",admin);
		return model;
		
	}
	
	@RequestMapping(value="/save",method= RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("adminForm")Admin admin) {
				
		if(admin !=null && admin.getIdAdmin() !=null) {
			//update
			adminService.updateAdmin(admin);
		}else {
			//add new
			adminService.addAdmin(admin);
		}
		return new ModelAndView("redirect:/admin/list");
		
	}
	
	@RequestMapping(value="/delete/{idAdmin}",method= RequestMethod.GET)
	public ModelAndView delete(@PathVariable("idAdmin")int idAdmin) {
				
		adminService.deleteAdmin(idAdmin);
		return new ModelAndView("redirect:/admin/list");
	}
	
}
