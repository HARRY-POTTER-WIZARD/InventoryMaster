package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStatements {
	public  void createDb(String DBName) {
		
		try {
			String query="create database "+DBName;
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "2004");
			Statement st=conn.createStatement();
			st.executeLargeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public  void createTable(String TableName,String DBName) {
		try {
			String query = "CREATE TABLE "+ TableName+"(ID Int,Name varchar(255),category varchar(255),price  DECIMAL(10,2),quantity int)";
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
			Statement st = conn.createStatement();
			st.executeLargeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
