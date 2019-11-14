package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Users;
import com.service.UserServiceIntf;
@Controller("myController2")
public class MyController2 {
	@Autowired
	public UserServiceIntf userService;
	@RequestMapping(value="/viewusers", method=RequestMethod.GET)
	public ModelAndView viewusers()
	{
		List<Users> userlist=userService.getUsers();
		ModelAndView mav=new ModelAndView("viewusers");
		mav.addObject("userslist",userlist);
		return mav;
	}
}
