package com.example.demo.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Student {
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private AfterReturning1 afterReturning1;
	
	@Autowired
	private AfterThrowingClass afterThrowingClass;
	
	@Autowired
	private ArroundClass arroundClass;
	
	
	
	@Autowired
	private SequenceClass sequenceClass;
	@GetMapping("/")
	public String Study() throws MyException
	{
		//employee.StudySomething(45,46);
		//int val=afterReturning1.studyAnything(4,7);
		
		
		//String a=afterThrowingClass.doOperation();
		
		int b=arroundClass.returnMultiplication(5, 8);
		System.out.println(b+"originalMultiplication");
		System.out.println("dont disturb me I am "
				+ "studying right now");
		
		sequenceClass.sum(4, 7);
		
		return "hello World";
	}

}
