package com.springboot.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entity.Feedback;
import com.springboot.web.service.AppService;

@RestController

public class MyRestApp {
 
	@Autowired
	private AppService service;  
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String userRegister(@RequestParam ("uname")String uname, @RequestParam ("pass") String pass, @RequestParam("uemail") String uemail, @RequestParam ("uadd") String uadd, @RequestParam ("feed") String feed, @RequestParam ("comments") String comments){
		
		Feedback f = new Feedback(uname, pass,uemail,uadd, feed, comments);
			
		boolean data = service.addUser(f);
			
			if(data)
			{
			return "Thank you! Feedback Submitted Successfully.";
			}
			
			else
			{
			return "Sorry, Feedback could not be Submitted, try again later";
			}
	}
}
