package com.spring.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.spring.entity.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage(){
		return "HomePage";
	}
	
	/*@RequestMapping(value="emp", method=RequestMethod.GET)
	public Employee emp()
	{
		return new Employee();
	}*/
	
	@RequestMapping(value="/employeeForm",method=RequestMethod.GET)
	public ModelAndView getEmployeeForm(){
	ModelAndView mv=new ModelAndView("EmployeeForm");
		mv.addObject("employee",new Employee());
		return mv;
	}
	
	@RequestMapping(value="/submitEmployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") @Valid Employee employee,BindingResult result,ModelMap model) {
	        if(result.hasErrors()) {
	    	    return new ModelAndView("EmployeeForm");
	        }
		model.addAttribute("employeeId",employee.getEmployeeId());
		model.addAttribute("employeeName",employee.getEmployeeName());
		model.addAttribute("email",employee.getEmail());
		model.addAttribute("contact",employee.getContact());
		return new ModelAndView("ViewEmployee");
	}
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String getTestPage(){
		return "Test";
	}
	

}
