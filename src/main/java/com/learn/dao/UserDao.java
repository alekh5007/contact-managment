package com.learn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.learn.entities.User;

public class UserDao {

	Connection con;
	public UserDao(Connection con)throws SQLException {
		this.con=con;
	}
	
	
	public boolean addUser(User u1)  {
		boolean flag=false;
		try {
		String query="insert into user(name,email,password,address,status,image) values(?,?,?,?,?,?)";
		PreparedStatement pstmt=this.con.prepareStatement(query);
		pstmt.setString(1, u1.getName());
		pstmt.setString(2, u1.getEmail());
		pstmt.setString(3, u1.getPassword());
		pstmt.setString(4, u1.getAddress());
		pstmt.setString(5, u1.getStatus());
		pstmt.setString(6, u1.getImage());
		int row=pstmt.executeUpdate();
		System.out.println("Contact added");
		flag =true;
		
		} catch (Exception e) {
			
		}
		
		return flag;
		
	}
	
	//get User by email and password
	public User getEmailAndPassword(String email,String password) {
		User user=null;
		
		try {
			
			String query="select * from user where email =? and password =?";
			PreparedStatement pstmt=this.con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet set =pstmt.executeQuery();
			if(set.next()) {
				user=new User();
				user.setName(set.getString("name"));
				user.setEmail(set.getString("email"));
				user.setPassword(set.getString("password"));
				user.setAddress(set.getString("address"));
				user.setStatus(set.getString("status"));
				user.setImage(set.getString("image"));
				
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return user;
	}
	
	//get single row by email
	public User getSingle(String email) {
		
		User cd=null;
		try {
			
			 cd=new User();
			String query="Select * from user where email=?";
			PreparedStatement stm=this.con.prepareStatement(query);
			stm.setString(1, email);
			ResultSet data =stm.executeQuery();
			while(data.next()) {
				cd.setName(data.getString("name"));
				cd.setEmail(data.getString("email"));
				cd.setPassword(data.getString("password"));
				cd.setAddress(data.getString("address"));
				cd.setStatus(data.getString("status"));
				cd.setImage(data.getString("image"));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cd;
	}
	
	//update
public void updateUser(User c3) {
        
		try {
			
			String query="update user set name=?,password=?,address=?,status=? ,image=? where email=?";

			PreparedStatement pass=this.con.prepareStatement(query);
			System.out.println(c3.getEmail()+":"+c3.getName()+" "+c3.getPassword()+" "+c3.getAddress()+" "+c3.getStatus()+" "+c3.getImage());
			pass.setString(1, c3.getName());
			pass.setString(2, c3.getPassword());
			pass.setString(3, c3.getAddress());
			pass.setString(4, c3.getStatus());
			pass.setString(5, c3.getImage());
			pass.setString(6, c3.getEmail());
			
			System.out.println("======================");
			int ind=pass.executeUpdate();
			
			System.out.println("data updated sucessfully"+ind);
			
		} catch (Exception e) {
			
		}
}

//delete user by email
public boolean deleteContact(String  email) {
	boolean flag=false;
	try {
		
		String query="delete from user where email=?";
		PreparedStatement pstm=this.con.prepareStatement(query);
		pstm.setString(1, email);
		pstm.executeUpdate();
		System.out.println("Data deleted sucessfully");
		flag=true;
		
	} catch (Exception e) {
	e.printStackTrace();
	}
	return flag;
}


}
