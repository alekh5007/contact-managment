package com.learn.entities;

public class User {

	private String name;
	private String email;
	private String password;
	private String address;
	private String status;
	private String image;
	
	public User() 
	{
		
	}
	
	public User(String name, String email, String password, String address, String status, String image) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.status = status;
		this.image = image;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
