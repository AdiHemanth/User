package com.ex.userapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.userapp.dao.UserDAO;

@Service
public class UserService {
@Autowired
	UserDAO userDao;

public void authenticate(String un, String pwd) {
	userDao.authenticate(un,pwd);
	
}

}
