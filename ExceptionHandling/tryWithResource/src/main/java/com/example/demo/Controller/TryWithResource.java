package com.example.demo.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TryWithResource {
	
	
	@GetMapping("/")
	public void tryWithResource()
	{
		
		try (PrintWriter writer = new PrintWriter(new File("puja.txt"))) {
		    writer.println("Hello World");
		    System.out.println("implementing try with Resource");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
