package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.MyQuery;
import com.model.Users;
import com.service.UserServiceIntf;
@Controller("mycontroller")
public class MyController1 {
	@RequestMapping(path="/hello1", method=RequestMethod.GET)
	
	public void show1()
	{
		System.out.println( "I am fine");
	}
	@RequestMapping(path="/hello2", method=RequestMethod.GET)
	public String show2()
	{
		System.out.println( "I am fine from show2");
		return "show2";
	}
	@RequestMapping(path="/hello3", method=RequestMethod.GET)
	public ModelAndView show3()
	{
		ModelAndView mav= new ModelAndView("show3");
		mav.addObject("var1","Akanksha");
		mav.addObject("var2","J And K");
		return mav;
		
	}
	@RequestMapping(value="/query", method=RequestMethod.GET)
	public String getQueryForm()
	{
		return "query";
	}
	
	@RequestMapping(value="/makequery", method=RequestMethod.POST)
	public ModelAndView sendQueryForm(@ModelAttribute MyQuery myQuery)
	{
		System.out.println(myQuery.getName());
		ModelAndView mav=new ModelAndView("query1");
		mav.addObject("obj",myQuery);
		return mav;
	}
	
}
