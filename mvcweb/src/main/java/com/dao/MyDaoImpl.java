package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.model.Contact;
import com.model.Users;
@Repository("myDao")
public class MyDaoImpl implements MyDaoIntf {

	public boolean insertContact(Contact contact) {
		System.out.println("dao called");
		return true;
	}

	public boolean registerUser(Users user)
	{

		boolean result=false;
		try{
		
		//code for jpa
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		 result=true;
		
	}
		catch(Exception e)
		{
			System.out.println("error:"+e);
		}
		return result;
	}


public boolean loginUser(Users user)
{

	boolean result=false;
	try{
	
	//code for jpa
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
	EntityManager em=emf.createEntityManager();
	Users u=em.find(Users.class,user.getEid());
	if(u!=null)
	{
		if(u.getPassword().equals(user.getPassword()))
			result=true;
	}

	em.close();
}
	catch(Exception e)
	{
		System.out.println("error:"+e);
	}
	return result;
}
}

