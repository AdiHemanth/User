package com.ex.userapp.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.ex.userapp.entity.User;
import com.ex.userapp.exceptions.InvalidUserCredentialException;
import com.ex.userapp.utility.DBUtility;

@Repository
public class UserDAOImpl implements UserDAO {

	@Override
	public void authenticate(String un, String pwd) {
		SessionFactory sf=DBUtility.getSF();
		Session session =sf.openSession();
		Query query=session.createQuery("from User Where u.un=:userName and u.pwd=:password");
		query.setParameter("userName",un);
		query.setParameter("password",pwd);
		
		List<User>list=query.list();
		if(list.isEmpty()) 
			throw new InvalidUserCredentialException("UserName Or Password is Invalid");
			
		}
	}


