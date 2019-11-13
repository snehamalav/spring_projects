package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyDaoIntf;
import com.model.Contact;
import com.model.Users;
@Service("myService")
public class MyServiceImpl implements MyServiceIntf {
@Autowired
	MyDaoIntf myDao;
	public boolean insertContact(Contact contact) {
		System.out.println("service is called");
		boolean flag=myDao.insertContact(contact);
        return flag;
	}

	public boolean registerUser(Users user)
	{
		System.out.println("register service is called");
		boolean flag=myDao.registerUser(user);
		return flag;
	}
	
	public boolean loginUser(Users user)
	{
		System.out.println("login");
		boolean flag=myDao.loginUser(user);
		return flag;
	}
}
