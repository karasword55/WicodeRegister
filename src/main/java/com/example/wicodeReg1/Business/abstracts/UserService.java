package com.example.wicodeReg1.Business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import com.example.wicodeReg1.Entity.concrete.Users;


public interface UserService {

	public Users addUser(Users user) ;
	
	public List<Users> getAll();
	
}
