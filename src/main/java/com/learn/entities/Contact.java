package com.learn.entities;

public class Contact {
	private int contact_id;
	private String first_name;
	private String last_name;
	private String email;
	private boolean favorite;
	private String added_date;
	private String user_id;
	
	public Contact() {
		
	}
	
	public Contact(int contact_id, String first_name, String last_name, String email, boolean favorite,
			String added_date, String user_id) {
		super();
		this.contact_id = contact_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.favorite = favorite;
		this.added_date = added_date;
		this.user_id = user_id;
	}
	
	

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public String getAdded_date() {
		return added_date;
	}

	public void setAdded_date(String added_date) {
		this.added_date = added_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
	

}
