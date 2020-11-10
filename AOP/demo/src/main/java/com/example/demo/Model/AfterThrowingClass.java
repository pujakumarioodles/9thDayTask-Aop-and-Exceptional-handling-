package com.example.demo.Model;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowingClass {
	
	
	
	public String doOperation() throws MyException
	{
		throw new MyException("this my exception class");
	}

}
