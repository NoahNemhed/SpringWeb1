package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	



	@RequestMapping("/add/{x},{y}")
		public double add(@PathVariable double x, @PathVariable double y) {
			return x + y;
			
		}
		
	@RequestMapping("/multiply/{x},{y}")
		public double multiply(@PathVariable double x, @PathVariable double y) {
			return x * y;
			
		}
		
	@RequestMapping("/subtract/{x},{y}")
		public double subtract(@PathVariable double x, @PathVariable double y) {
			return x - y;
			
		}
		
		

	
}
