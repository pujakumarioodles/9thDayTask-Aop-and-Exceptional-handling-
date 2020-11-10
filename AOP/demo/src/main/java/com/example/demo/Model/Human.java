package com.example.demo.Model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
class Human {
	
	
	/*
	@Before("execution(public * Study*())")
	public void wakeUp()
	{
		System.out.println("Good Morning CoderSS");
	}
	@After("execution(public * Study*())")
	public void sleep()
	{
		System.out.println("Good night");
	}
*/
	/*@Before("myPointcuts()")
	public void wakeUp(JoinPoint j)
	{
		//System.out.println("Good Morning CoderSS"+j.
			//	getArgs()[0]);
		

		System.out.println("Good Morning CoderSS"+j.getSignature().getName());
		System.out.println("Good Morning CoderSS"+j.getTarget().getClass());
		System.out.println("Good Morning CoderSS"+j.getThis().getClass().getName());
	}
	@After("myPointcuts()")
	public void sleep()
	{
		System.out.println("Good night");
	}
	@Pointcut("execution(public * Study*(..))")
	public void myPointcuts()
	{
		
	}
	*/
	
	/*@AfterReturning(pointcut= "execution(public * studyAnything(..))"
			,returning=
			"numvalue")
	public void afterReturn(int numvalue)
	{
		System.out.println("after returning"+numvalue);
	
	}
	
	
	
	@AfterThrowing(pointcut= "execution(public String doOperation() throws MyException)"
	,throwing=
	"ex")
public void afterReturn(MyException ex)
{
System.out.println("after"+ex);*/
	
	@Around("execution(public int returnMultiplication(int, int))")
	public Object arroundAnnotation(ProceedingJoinPoint j)
	{
		Object []args=j.getArgs();
		
		args[0]=9;
		args[1]=6;
		
		Object res=null;
		 try {
			res=j.proceed(args);
		} catch (Throwable e) {
		
			e.printStackTrace();
		}
		 
		 System.out.println(res);
		return 80;
		
	}

}
	
	
	
	

