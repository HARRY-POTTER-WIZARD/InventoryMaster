package com.contorller;

import java.util.List;
import java.util.Scanner;

import com.entity.Products;
import com.model.GetProducts;
import com.model.InsertProduct;
import com.model.RemoveProduct;
import com.model.UpdateProduct;

public class InventorySystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Inventory Master");
		int i=0;
		while(i!=5) {
			System.out.println("1] Add new products.");
			System.out.println("2] Update product details.");
			System.out.println("3] Delete products.");
			System.out.println("4] View all products.");
			System.out.println("5] Exit");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				Products ip=new Products();
				System.out.println("Enter Name of Product: ");
				ip.setName(sc.nextLine());
				System.out.println("Enter category of Product: ");
				ip.setCategory(sc.nextLine());
				System.out.println("Enter price of Product: ");
				ip.setPrice(sc.nextDouble());
				System.out.println("Enter quantity of Product: ");
				ip.setQuantity(sc.nextInt());
				InsertProduct.insert(ip);
				
				System.out.println("Product Insert Sucessfully");
				break;
			case 2:
				Products up=new Products();
				System.out.println("Enter Name of Product: ");
				up.setName(sc.nextLine());
				System.out.println("Enter category of Product: ");
				up.setCategory(sc.nextLine());
				System.out.println("Enter price of Product: ");
				up.setPrice(sc.nextDouble());
				System.out.println("Enter quantity of Product: ");
				up.setQuantity(sc.nextInt());
				UpdateProduct.updateProducts(up);
				System.out.println("Product updated Sucessfully");
				break;
			case 3:
				System.out.println("Enter Id of Product: ");
				System.out.println("product deleted: "+RemoveProduct.removeProduct(sc.nextInt()));
				break;
			case 4:
				List<Products>product=GetProducts.getProduct();
				System.out.println(" Id | Name | category | price | quantity");
				for (Products p:product) {
					System.out.println(p.getId()+" | "+p.getName()+" | "+p.getCategory()+" | "+p.getPrice()+" | "+p.getQuantity());
				}
				break;
			case 5:
				sc.close();
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
	}
}
