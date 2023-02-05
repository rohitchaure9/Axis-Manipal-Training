package com.axis.exception;

public class InValidCategoryException extends RuntimeException{
	String msg; 
	
	public InValidCategoryException(String msg) {
		super();
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
