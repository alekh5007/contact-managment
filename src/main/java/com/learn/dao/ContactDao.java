package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learn.entities.Contact;
import com.learn.entities.User;

public class ContactDao {

	Connection con;
	public ContactDao(Connection con)throws SQLException {
		this.con=con;
	}
	
	public int addContact(Contact u1)  {
		
		try {
		String query="insert into contact(first_name,last_name,email,favorite,user_id) values(?,?,?,?,?)";
		PreparedStatement pstmt=this.con.prepareStatement(query,PreparedStatement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, u1.getFirst_name());
		pstmt.setString(2, u1.getLast_name());
		pstmt.setString(3, u1.getEmail());
		pstmt.setBoolean(4, u1.isFavorite());
		pstmt.setString(5, u1.getUser_id());
		
		int row=pstmt.executeUpdate();
		System.out.println("Contact added");
		ResultSet generatedKeys = pstmt.getGeneratedKeys();
		if(generatedKeys.next()) {
			
			return Integer.parseInt(generatedKeys.getString(1));
		}
		
		return 0;
		
		
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		
		
	}
	

//	public int  displaymyAllContact() {
//		try {
//			String ym="ak@gmail.com";
//			String query="Select contact.first_name,contact.last_name,contact.email,contact.favorite ,phone.country_code,phone.phone,contact.contact_id from contact,phone where contact.contact_id=phone.cid AND contact.user_id  values(?) and ";
//			PreparedStatement stm=this.con.prepareStatement(query);
//			stm.setString(1, ym);
//			ResultSet data =stm.executeQuery();
//			while(data.next()) {
//				System.out.println(data.getString("first_name"));
//				System.out.println(data.getString("last_name"));
//				System.out.println(data.getString("email"));
//				System.out.println(data.getString("phone"));
//				
//				
//				
//			}
//			return 1;
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return 1;
//	}

}
