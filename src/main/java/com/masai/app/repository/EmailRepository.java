package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.entities.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,Integer>{

}
