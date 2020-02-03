package com.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginDAO {
	
	public boolean validateUser(String user, String pass) {
	boolean st =false;
	try {

	//loading drivers for mysql
	Class.forName("com.mysql.jdbc.Driver");

	//creating connection with the database
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	PreparedStatement ps = con.prepareStatement("select * from admin where user=? and pass=?");
	ps.setString(1, user);
	ps.setString(2, pass);
	ResultSet rs =ps.executeQuery();
	st = rs.next();

	}
	catch(Exception e) {

	}
	return st;
	}

	}
