package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	
}
