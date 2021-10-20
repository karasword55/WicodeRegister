package com.example.wicodeReg1.Repository.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.wicodeReg1.Entity.concrete.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
	

}
