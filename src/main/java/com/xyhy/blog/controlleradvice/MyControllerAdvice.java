package com.xyhy.blog.controlleradvice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xyhy.blog.exception.BlogException;
import com.xyhy.blog.exception.MyJwtException;

import io.jsonwebtoken.JwtException;

@ControllerAdvice
public class MyControllerAdvice  {
	 	@ExceptionHandler(value = BlogException.class)
	    @ResponseBody
	    public Map<String, Object> defaultHandle(BlogException e) {
	 		Map<String, Object> map = new HashMap<String, Object>();
	        if (e instanceof BlogException) {
	            map.put("status", e.getStatus());
	            map.put("error", e.getMessage());
	            return map;
	        }else {
	            
	            map.put("error", "未知错误");
	            
	            return map;
	        }
	    }
	 	
	 	@ExceptionHandler(value = MyJwtException.class)
	    @ResponseBody
	    public Map<String, Object> verifyHandle(MyJwtException e) {
	 		Map<String, Object> map = new HashMap<String, Object>();
	        if (e instanceof MyJwtException) {
	            map.put("error", e.getMessage());
	            return map;
	        }else {
	            map.put("error", "未知错误");
	            return map;
	        }
	    }
	

	
	
}
