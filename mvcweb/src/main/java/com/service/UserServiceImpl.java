package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DaoIntf;
import com.model.Users;
@Service("userService")
public class UserServiceImpl implements UserServiceIntf {
@Autowired
public DaoIntf userDao;
	public List<Users> getUsers() {
		List<Users> list=userDao.getUsers();
		return list;
	}

}
