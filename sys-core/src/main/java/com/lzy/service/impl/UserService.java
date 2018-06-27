package com.lzy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.lzy.dao.UserDao;
import com.lzy.domain.User;
import com.lzy.service.IUserService;

@Service
@ComponentScan
public class UserService implements IUserService  {

	@Autowired
	UserDao  userDao;
	
	
	@Override
	public User findByEmail(String email) {

		
		return null;
	}


	@Override
	public User save(User user) {
		userDao.save(user);
		return user;
	}

}
