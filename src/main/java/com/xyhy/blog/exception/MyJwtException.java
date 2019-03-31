package com.xyhy.blog.exception;


public class MyJwtException extends io.jsonwebtoken.JwtException{
	public MyJwtException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	private int status;
	
	
	public MyJwtException(int status , String msg) {
		super(msg);
		this.status=status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatu(int status) {
		this.status = status;
	}
}
