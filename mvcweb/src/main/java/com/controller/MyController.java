package com.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Contact;
import com.model.Users;
import com.service.MyServiceIntf;

@Controller("myController")
public class MyController {
@Autowired
MyServiceIntf myService;

@RequestMapping(value="/contact",method=RequestMethod.POST)
public ModelAndView insertContact(HttpServletRequest request,HttpServletResponse response)
{
	String name=request.getParameter("name");

	String info=request.getParameter("info");
	Contact contact=new Contact();
	contact.setInfo(info);
	contact.setName(name);
	boolean flag=myService.insertContact(contact);
	ModelAndView mav=new ModelAndView();
	mav.addObject("name",name);
	if(flag)
	    mav.addObject("status","thanks message is accepted");
	else
		  mav.addObject("status","sorry message is not accepted");
	mav.setViewName("contactreport");
	return mav;
	
}
@RequestMapping(value="/register",method=RequestMethod.POST)
public ModelAndView registerUser(HttpServletRequest request,HttpServletResponse response)
{
   int eid=Integer.parseInt(request.getParameter("eid"));
   String emailid=request.getParameter("emailid");
   String name=request.getParameter("name");
   String password=request.getParameter("pwd");
   Users user=new Users();
   user.setEid(eid);
   user.setEmailid(emailid);
   user.setName(name);
   user.setPassword(password);
   boolean flag=myService.registerUser(user);
   ModelAndView mav=new ModelAndView();
   mav.addObject("eid",eid);
   mav.addObject("name",name);
   if(flag)
   {
	   mav.addObject("status","you are successfully registered");
   }
   else
   {
	   mav.addObject("status","sorry.....try again");
   }
   mav.setViewName("registerreport");
   return mav;   
}
@RequestMapping(value="/login",method=RequestMethod.POST)
public ModelAndView loginUser(HttpServletRequest request,HttpServletResponse response) throws IOException
{
   
   int eid=Integer.parseInt(request.getParameter("eid"));
   String password=request.getParameter("pwd");
   Users user=new Users();
   user.setEid(eid);
   user.setPassword(password);
   boolean flag=myService.loginUser(user);
   ModelAndView mav=new ModelAndView();
   mav.addObject("eid",eid);
   mav.addObject("pwd",password);
   if(flag)
   {
	   
	   mav.addObject("status","login successfull");
   }
   else
   {
	   mav.addObject("status","sorry.....try again");
	  
   }
   mav.setViewName("loginreport");
   return mav;   
}

}
