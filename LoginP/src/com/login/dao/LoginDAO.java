package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.login.model.LoginPojo;

public class LoginDAO {

	public LoginPojo validateUser(LoginPojo loginPojo) {
		try {
			// loading drivers for mysql
			Class.forName("com.mysql.jdbc.Driver");

			// creating connection with the database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from login");

			while (resultSet.next()) {
				// System.out.println(resultSet.getString(1) + resultSet.getString(2));
				if (loginPojo.getUserName().equals(resultSet.getString(1))
						&& loginPojo.getPassword().equals(resultSet.getString(2))) {
					// result="success";
					loginPojo.setRole(resultSet.getString(3));
					break;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginPojo;
	}
}
