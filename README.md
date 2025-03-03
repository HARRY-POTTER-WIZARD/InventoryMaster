

# **InventoryMaster**

A simple, menu-driven Inventory Management System that allows users to manage products, track stock levels, record sales, and generate reports using Java, JDBC, and PostgreSQL.

## **Table of Contents**
1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [Usage](#usage)
5. [Database Schema](#database-schema)
6. [Project Creator](#project-creator)

---

## **Project Overview**
The **InventoryMaster** system is designed to manage a store's inventory effectively. It allows the user to:
- Add, Update, View, and Delete products.
- Track stock levels for each product.
- Record sales transactions and update inventory levels accordingly.
- Generate low stock and sales reports.

This application is built using **Core Java**, **JDBC**, and **PostgreSQL**.

---

## **Features**
1. **Product Management**:
   - Add new products.
   - Update product details.
   - Delete products.
   - View all products.

2. **Stock Management**:
   - Track stock levels.
   - Increase/decrease stock based on sales.

3. **Sales Management**:
   - Record sales transactions.
   - Automatically update product stock when a sale is made.

4. **Reporting**:
   - Generate a report of products with low stock.
   - View total sales for a specific time period.

---

## **Prerequisites**
Before you begin, ensure you have the following installed:

- **JDK 8 or higher**: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)
- **PostgreSQL**: [Download PostgreSQL](https://www.postgresql.org/download/)
- **Maven** (Optional, for building the project with dependencies): [Download Maven](https://maven.apache.org/download.cgi)

---

## **Usage**
To run the program, follow these steps:

1. **Run the `InventorySystem` class**:
   - This will launch the menu-driven interface in the console.
   
   ```bash
   java InventorySystem
   ```

2. **Menu Options**:
   You will be presented with the following options:
   - **1**: Add Product
   - **2**: View Products
   - **3**: Update Product Stock
   - **4**: Record Sale
   - **5**: Generate Report
   - **6**: Exit

   Select an option by entering the corresponding number.

---

## **Database Schema**

The system uses two tables in PostgreSQL:

### **1. `products` Table**
Stores details about products in the inventory.

| Column     | Type        | Description                |
|------------|-------------|----------------------------|
| `id`       | SERIAL      | Unique identifier for each product |
| `name`     | VARCHAR(255)| Name of the product        |
| `category` | VARCHAR(100)| Category of the product    |
| `price`    | DECIMAL(10,2)| Price of the product       |
| `quantity` | INT         | Quantity available in stock|

### **2. `sales` Table**
Records each sale made in the system.

| Column        | Type        | Description                    |
|---------------|-------------|--------------------------------|
| `id`          | SERIAL      | Unique identifier for each sale|
| `product_id`  | INT         | Foreign key referencing `products(id)` |
| `quantity_sold` | INT       | Quantity of the product sold  |
| `total_price` | DECIMAL(10,2)| Total sale price (quantity * price) |
| `sale_date`   | TIMESTAMP   | Date and time of the sale     |

---

## **Project Creator**

This project was created by **Swapnil Pradip Dande**, a software developer with a passion for building efficient and effective systems. The goal of this project was to implement an inventory management system to gain hands-on experience with **Java**, **JDBC**, and **PostgreSQL**. 

If you have any questions or suggestions, feel free to reach out!

---
