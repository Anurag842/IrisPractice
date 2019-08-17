package com.spring.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Department;


@Controller
public class DepartmentController {
	
	@RequestMapping(value="/departmentForm",method=RequestMethod.GET)
	public ModelAndView getDepartmentForm(){
	ModelAndView mv=new ModelAndView("DepartmentForm");
		mv.addObject("department",new Department());
		return mv;
	}
	
	@RequestMapping(value="/submitDepartment", method = RequestMethod.POST)
	public ModelAndView addDepartment(@ModelAttribute("department") @Valid Department department,BindingResult result,ModelMap model) {
	        if(result.hasErrors()) {
	    	    return new ModelAndView("DepartmentForm");
	        }
		model.addAttribute("departmentId",department.getDepartmentId());
		model.addAttribute("departmentName",department.getDepartmentName());
		return new ModelAndView("ViewDepartment");
	}

}
