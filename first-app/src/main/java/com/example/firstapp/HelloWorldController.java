/**
 * 
 */
package com.example.firstapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Isha
 *
 */
@Controller
@EnableAutoConfiguration
public class HelloWorldController {
	@RequestMapping("/home")
	@ResponseBody
	public String sayHello() {
		return "index";
				
	}
	
	
}
