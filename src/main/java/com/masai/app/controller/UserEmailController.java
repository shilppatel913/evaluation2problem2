package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.entities.Email;
import com.masai.app.entities.User;
import com.masai.app.service.UserServiceImpl;

@RestController
public class UserEmailController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@PostMapping("/users")
	public ResponseEntity<?> createUser(@RequestBody User user){
		User u=this.userServiceImpl.createUser(user);
		return ResponseEntity.ok(u);
	}
	
	@PostMapping("/user/{id}/mail")
	public ResponseEntity<?> createEmail(@RequestBody Email email){
		Email e=this.userServiceImpl.createEmail(email);
		return ResponseEntity.ok(e);
	}

	@GetMapping("/users")
	public ResponseEntity<?> getAllUsers(){
		List<User> users=this.userServiceImpl.getAllUsers();
		return ResponseEntity.ok(users);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") int userId){
		User user=this.userServiceImpl.getOneUser(userId);
		return ResponseEntity.ok(user);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") int userId){
		this.userServiceImpl.deleteUser(userId);
		return ResponseEntity.ok("User has been successfully deleted");
	}
	
	@GetMapping("/users/{id}/mail/{mail_id}")
	public ResponseEntity<?> getEmailForUser(@PathVariable("id") int userId){
		Email email=this.userServiceImpl.getEmail(userId);
		return ResponseEntity.ok(email);
	}
}
