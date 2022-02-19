package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learn.entities.Contact;
import com.learn.entities.Phone;

public class PhoneDao {

	Connection con;
	public PhoneDao(Connection con)throws SQLException {
		this.con=con;
	}
	
	public boolean addPhone(Phone p1)  {
		boolean flag=false;
		try {
		String query="insert into phone(country_code,phone,cid) values(?,?,?)";
		PreparedStatement pstmtt=this.con.prepareStatement(query);
		pstmtt.setString(1, p1.getCountry_code());
		pstmtt.setString(2, p1.getPhone_no());
		pstmtt.setInt(3, p1.getCid());

		
		int row=pstmtt.executeUpdate();
//		System.out.println("Contact added");
		flag =true;
		
		} catch (Exception e) {
			
		}
		
		return flag;
		
	}
	
}
