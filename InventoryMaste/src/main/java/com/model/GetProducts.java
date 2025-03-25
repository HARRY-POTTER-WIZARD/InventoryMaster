package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Products;

public class GetProducts {
	
	
	public static List<Products> getProduct(){
		List< Products>products=new ArrayList<Products>();
		String quary="Select * from products";
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/inventory", "postgres", "2004");
			Statement st=conn.createStatement();
			ResultSet rSet=st.executeQuery(quary);
			while(rSet.next()) {
				Products product=new Products();
				product.setId(rSet.getInt(1));
				product.setName(rSet.getString(2));
				product.setCategory(rSet.getString(3));
				product.setPrice(rSet.getDouble(4));
				product.setQuantity(rSet.getInt(5));
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}
}
