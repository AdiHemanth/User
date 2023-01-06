package com.ex.userapp.utility;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {
	static SessionFactory sf =null;
	
	public static SessionFactory getSF() {
		if(sf==null)
			sf=new Configuration().configure().buildSessionFactory();
		return sf;
	}

}
