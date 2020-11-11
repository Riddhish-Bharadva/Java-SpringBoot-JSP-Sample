package com.rab.Java_JB_JSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
	DataController DC = new DataController();
	@RequestMapping(value="/ViewController")
	public ModelAndView LandingPage() throws Exception
	{
		System.out.println("Inside View Controller.");
		ModelAndView MAV = new ModelAndView();
		MAV.setViewName("ViewData");
		MAV.addObject("Data", DC.GetData());
		return MAV;
	}
}
