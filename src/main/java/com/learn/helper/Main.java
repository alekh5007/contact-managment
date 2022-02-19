package com.learn.helper;

import java.sql.Connection;
import java.sql.SQLException;

import com.learn.dao.UserDao;
import com.learn.entities.User;

public class Main {

	public static void main(String args[])  {
		try {
			
			Connection connection = ConnectionProvider.getConnection();
			System.out.println(connection);
			UserDao userdao = new UserDao(connection);
			
//			User u=new User();
//			
//			u.setName("alekh");
//			u.setEmail("ak@gmail.com");
//			u.setPassword("hgf");
//			u.setAddress("lalpania");
//			u.setStatus("Amazing app");
//		u.setImage("default.png");
//			
//			System.out.println(userdao.addUser(u)?"added":"eror");
			
//			           User user=userdao.getEmailAndPassword("ak@gmail.com", "hgf");
//			           System.out.println(user.getEmail());
//			           System.out.println(user.getPassword());
//			           System.out.println(user.getName());
//			           System.out.println(user.getAddress());
//			           System.out.println(user.getStatus());
//			           System.out.println(user.getImage());
			
			  User user=userdao.getSingle("ak@gmail.com");
	           System.out.println(user.getEmail());
	           System.out.println(user.getPassword());
	           System.out.println(user.getName());
	           System.out.println(user.getAddress());
	           System.out.println(user.getStatus());
	           System.out.println(user.getImage());
	           
	           user.setName("test");
	           user.setEmail("test@gmail.com");
	           user.setPassword("test123");
	           user.setAddress("test");
	           user.setStatus("test");
	           user.setImage("test.png");
	           userdao.updateUser(user);
	           
	          // boolean h=userdao.deleteContact("ak@gmail.com");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
