package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveProduct {
	public static boolean removeProduct(int productId) {
		String quary="delete from products where id=?";
		 
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
			PreparedStatement pStatement = conn.prepareStatement(quary);
		
		pStatement.setInt(1, productId);
		pStatement.executeUpdate();
		return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	static boolean removeProduct(String productName) {
		String quary="delete from products where name=?";
		 
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
			PreparedStatement pStatement = conn.prepareStatement(quary);
		
		pStatement.setString(1, productName);
		pStatement.executeUpdate();
		return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
