package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// TODO Auto-generated constructor stub
public static Connection provideConnection()
{
	Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	String urlString = "jdbc:mysql://localhost:3306/sb101c";
	try {
		conn = DriverManager.getConnection(urlString, "root", "Jaimatadi1@");
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return conn;
}
}
