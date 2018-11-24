package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.demo.beans.Course;
import com.cg.demo.service.ICourseService;

@Controller
public class CourseController {
	
	@Autowired
	ICourseService serv;
	
	@RequestMapping(value="home")
	public String getAll(Model model){
		
		List<Course> list=serv.getAll();
		model.addAttribute("temp",list); 
		return "table";
		
	}
	
	

	@RequestMapping(value="enroll")
	public String success(){
		
	 
		return "enroll";
		
	}

	
	/*
	@RequestMapping(value="home",method=RequestMethod.GET)
	public ModelAndView showAllEmployee(){
		List<Course> myAllData=serv.getAll();
		return new ModelAndView("table","temp", myAllData);
		}*/
}
