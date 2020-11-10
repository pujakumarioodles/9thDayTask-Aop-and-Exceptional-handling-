package com.example.demo.Model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect1 {
	
	
	
	@Before("execution(public void sum(int ,int ))")
	public void myAspect1()
	{
		
		System.out.println("myAspect1");
		
	}
	
	
	

}
