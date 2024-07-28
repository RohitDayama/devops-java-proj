package com.example.demo.devops.java.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.devops.java.repository.repo;

@org.springframework.stereotype.Service
public class ServImpl implements serv {
	@Autowired
	repo repo;

	@Override
	public void saveUser() {
	
		
	}

}
