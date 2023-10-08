package com.connection_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
	private static Connection con = null;

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/crud_db";
		String user = "root";
		String pass = "Ashutosh@123";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
}
