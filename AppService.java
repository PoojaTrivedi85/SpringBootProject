package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.entity.Feedback;

@Service
public class AppService {

	@Autowired
	private MyRepo myRepo;
	
	public boolean addUser(Feedback f){
		myRepo.save(f);
		return true;
	}	
}
