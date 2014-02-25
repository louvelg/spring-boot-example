package com.akelio.speed.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.akelio.speed.entity.User;
import com.akelio.speed.service.UserService;

@Controller
public class UserWS {

	@Autowired
	private UserService	userService;

	@RequestMapping("/user")
	public @ResponseBody
	User getUser() {
		User user = userService.findUserById("2");
		return user;
	}
	
	@RequestMapping("/user/{id}")
	public @ResponseBody
	User getUser(@PathVariable String id) {
		User user = userService.findUserById(id);
		return user;
	}
}