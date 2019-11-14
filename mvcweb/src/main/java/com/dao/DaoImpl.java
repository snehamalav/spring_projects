package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.model.Users;
@Repository("userDao")
public class DaoImpl implements DaoIntf{

	public List<Users> getUsers() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Users> users=em.createQuery("Select u from Users u").getResultList();
		return users;
	}

}
