package com.akelio.speed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.akelio.speed.dao.UserDAO;
import com.akelio.speed.entity.User;


@Service("userService")
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public User  findUserById(String id)  {
		return userDAO.findUserById(id);
	}
}
