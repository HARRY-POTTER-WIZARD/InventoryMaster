package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Products;

public class UpdateProduct {
	public static void updateProducts(Products p)   {
		String query="update  products set name=?,category=?, price=?,quantity=? where id=?";
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
			PreparedStatement pstm=conn.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getCategory());
			pstm.setDouble(3, p.getPrice());
			pstm.setInt(4, p.getQuantity());
			pstm.setInt(5, p.getId());
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
		
	}
}
