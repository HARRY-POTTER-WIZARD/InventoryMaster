package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Products;

public class InsertProduct {
	 
	

	

	public static void insert(Products products) {
		String quary="insert into products(id,name,category,price,quantity) values(?,?,?,?,?)";
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
		PreparedStatement pStatement=conn.prepareStatement(quary);
		
			pStatement.setInt(1, products.getId());
			pStatement.setString(2, products.getName());
			pStatement.setString(3, products.getCategory());
			pStatement.setDouble(4, products.getPrice());
			pStatement.setInt(5, products.getQuantity());
			pStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
