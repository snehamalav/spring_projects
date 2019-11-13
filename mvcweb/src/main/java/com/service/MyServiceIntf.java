package com.service;

import com.model.Contact;
import com.model.Users;

public interface MyServiceIntf {

	public boolean insertContact(Contact contact);
	public boolean registerUser(Users user);
	public boolean loginUser(Users user);
}
