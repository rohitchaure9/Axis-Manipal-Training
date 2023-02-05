package com.axis.exception;

public class InValidCategoryException extends RuntimeException{
	String msg; 
	
	public InValidPriceException(String msg) {
		super();
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
