package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.entities.Email;
import com.masai.app.entities.User;
import com.masai.app.repository.EmailRepository;
import com.masai.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private EmailRepository emailRepo;
	
	@Override
	public User createUser(User user) {
	
		return this.userRepo.save(user);
	}

	@Override
	public User getOneUser(int user_id) {
		return this.userRepo.findById(user_id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return this.userRepo.findAll();
	}

	@Override
	public void deleteUser(int user_id) {
		this.userRepo.deleteById(user_id);
		
	}

	@Override
	public Email createEmail(Email email) {
		return this.emailRepo.save(email);
	
	}

	@Override
	public Email getEmail(int user_id) {
		Email email= this.getOneUser(user_id).getEmail();
		return email;
	}

}
