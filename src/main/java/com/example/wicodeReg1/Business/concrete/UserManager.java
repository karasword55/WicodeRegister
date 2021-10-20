package com.example.wicodeReg1.Business.concrete;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wicodeReg1.Business.abstracts.UserService;
import com.example.wicodeReg1.Entity.concrete.Users;

import com.example.wicodeReg1.Repository.abstracts.UserRepository;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import com.example.wicodeReg1.Mernis.*;

@Service
public class UserManager implements UserService{

	private final UserRepository userRepo;
	
	
	
	
	@Autowired
	public UserManager (UserRepository userRepo) {
		this.userRepo=userRepo;
		
	}
	
	public Users addUser(Users user) {
	   
	    //SorgulamaMain m1=new SorgulamaMain();
	    //boolean sonuc=m1.TcSorgulamaMain(user.getTc(), user.getIsim().toLowerCase(), user.getSoyisim().toLowerCase(),user.getDogumYili());
	    	
	    
	    	this.userRepo.save(user);
	    
	    
	    
		
		

		return user;
	}

	
	public List<Users> getAll() {
		
		return this.userRepo.findAll();
	}
	
	

}
