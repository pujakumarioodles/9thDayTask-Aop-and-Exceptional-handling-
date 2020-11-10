package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TryWithMultipleCatch {
	
	@GetMapping("/")
	public void mycode()
	{
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
    finally
	{
    	System.out.println("In My catch Block");
	}
		
	}

}
