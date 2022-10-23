package com.guilhermemori.mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermemori.mongodb.domain.User;
import com.guilhermemori.mongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public List<User> findall(){
		return repo.findAll();
	}
}
