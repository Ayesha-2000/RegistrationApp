package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepo;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepo repo;
	@Override
	public void registerUsers(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

}
