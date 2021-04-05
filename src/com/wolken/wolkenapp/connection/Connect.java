package com.wolken.wolkenapp.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
//singleton pattern
public class Connect {
	private static Connection connection=null;
	
	public static Connection getConnect() {
		return connection;
	}
	
	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Msk@9620507639");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void closeConnection() {
		try {
			connection.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
