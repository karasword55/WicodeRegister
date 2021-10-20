package com.example.wicodeReg1.Entity.concrete;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name="users")
public class Users implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id",nullable = false,updatable = false)
	private int id;
	
	@Column(name="email",nullable = false)
	@Email
	
	private String email;
	
	@Column(name="isim",nullable = false)
	
	private String isim;
	
	@Column(name="soyisim",nullable = false)
	
	private String soyisim;
	
	@Column(name="sifre",nullable = false)
	@Size(min=6,message="şifreniz en az 6 karakterli olmalı")
	
	private String password;
	
	@Column(name="tc",nullable = false)
	
	private long tc;
	
	@Column(name="dogumyili",nullable = false)
	
	private int dogumYili;
	
	

	public Users(int id, String email, String password,long tc,String isim,String soyisim,int dogumYili) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.tc=tc;
		this.isim=isim;
		this.soyisim=soyisim;
	}

	public Users() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getTc() {
		return tc;
	}

	public void setTc(long tc) {
		this.tc = tc;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", isim=" + isim + ", soyisim=" + soyisim + ", password="
				+ password + ", tc=" + tc + ", dogumYili=" + dogumYili + "]";
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	
	
	
	
	
	

}
