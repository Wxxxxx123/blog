package com.xyhy.blog.exception;


public class BlogException extends Exception {
	private int status;
	
	
	public BlogException(int status , String msg) {
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
