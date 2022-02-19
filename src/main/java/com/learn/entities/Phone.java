package com.learn.entities;

public class Phone {
	
	private int phone_id;
	private String country_code;
	private String phone_no;
	private int cid;
	
	public Phone() {
		super();
	}

	public Phone(int phone_id, String country_code, String phone_no, int cid) {
		super();
		this.phone_id = phone_id;
		this.country_code = country_code;
		this.phone_no = phone_no;
		this.cid = cid;
	}

	public int getPhone_id() {
		return phone_id;
	}

	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	
	

}
