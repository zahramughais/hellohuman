package com.zahra.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("")
	public String hello(@RequestParam(value="name", required = false) String name,
			@RequestParam(value="last_name", required = false) String lastName,
			@RequestParam(value="times", defaultValue = "0") Integer times) {
		String greeting ="";
		if(name != null && lastName != null) {
			if(times != 0) {
				for (int i= 0 ; i < times; i++) {
					greeting += "Hello " + name + " " + lastName + " ";
				}
				return greeting;				
			} else {
				times = 0;
				return  "Hello " + name + " " + lastName;
			}
		} else if (name != null){
			if (times != 0) {				
				for (int i= 0 ; i < times; i++) {
					greeting += "Hello " + name + " ";
				}
				return greeting;	
			} else {
				return  "Hello " + name;
			}
		} else {
			if(times !=0) {				
				for (int i= 0 ; i < times; i++) {
					greeting += "Hello Human ";
				}
				return greeting;			
			} else {
				return "Hello Human";
			}
		}
	}
	
}
