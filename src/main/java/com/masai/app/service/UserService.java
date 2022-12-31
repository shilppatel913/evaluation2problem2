package com.masai.app.service;

import java.util.List;

import com.masai.app.entities.Email;
import com.masai.app.entities.User;

public interface UserService {
	public User createUser(User user);
	public User getOneUser(int user_id);
	public List<User> getAllUsers();
	public void deleteUser(int user_id);
	public Email createEmail(Email email);
	public Email getEmail(int user_id);
	

}
