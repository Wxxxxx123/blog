package com.xyhy.blog.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyhy.blog.commons.JwtUtil;
import com.xyhy.blog.exception.BlogException;
import com.xyhy.blog.items.User;
import com.xyhy.blog.service.UserService;


@RestController

public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String,Object> login(@RequestBody User user) throws BlogException{
		System.out.println("1111");
		try {
			userService.login(user);
			String token = JwtUtil.createJwt(user);
			Map<String,Object> map = new HashMap<String, Object>();
			
			map.put("token", token);
			return map;
		} catch (BlogException e) {
			throw e;
		}
	}
	
	
	
	

}
