package com.dao;

import com.model.Contact;
import com.model.Users;

public interface MyDaoIntf {

	public boolean insertContact(Contact contact);
	public boolean registerUser(Users user);
	public boolean loginUser(Users user);
}
