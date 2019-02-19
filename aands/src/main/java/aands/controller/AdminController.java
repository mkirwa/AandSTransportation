package aands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import aandsspring.service.AdminService;

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
