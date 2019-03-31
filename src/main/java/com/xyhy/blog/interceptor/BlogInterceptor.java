package com.xyhy.blog.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.xyhy.blog.commons.JwtUtil;

import io.jsonwebtoken.Claims;

public  class BlogInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		try {
		String token =request.getHeader("token");
		Claims claims= JwtUtil.parseToken(token);
		request.setAttribute("userId", claims.get("id"));
		request.setAttribute("userName", claims.get("username"));
		return true;
		}catch (RuntimeException e) {
			throw e;
		}
	}
	
}
