package com.example.wicodeReg1.Controller;

import java.rmi.RemoteException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wicodeReg1.Business.concrete.UserManager;
import com.example.wicodeReg1.Entity.concrete.Users;



@RestController
@RequestMapping("/user")
public class UserController {
	
	private final UserManager userManager;
	
	@Autowired
	public UserController(UserManager userManager) {
		this.userManager=userManager;
	}
	
	@PostMapping("/add")
	public Users addSiir(@Valid @RequestBody Users user)  {
		
		return this.userManager.addUser(user);
	}
	
	@GetMapping("/getall")
	public List<Users> getall(){
		return this.userManager.getAll();
	}
	
	
	
	

}
