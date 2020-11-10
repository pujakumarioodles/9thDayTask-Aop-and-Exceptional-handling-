package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UserError {
	
	public UserError(int value, String message2) {
		errorcode=value;
		message=message2;
	}
	private int errorcode;
	private String message;
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getMessage() {
		return message;
	}
	public UserError() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
