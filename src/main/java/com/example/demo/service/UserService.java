package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers(){
		System.out.println("service1");
		User u = new User();
		u.setId("1");
		u.setName("ankita");
		u.setAge(27);
		userRepo.save(u);
		List<User> allUsers = userRepo.findAll();
		System.out.println("service2");
		return allUsers;
	}

}
