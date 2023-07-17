/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystemui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danica
 */
public class EditClass {
    
//    CREATE TABLE products (
//	product_id INT PRIMARY KEY ,
//	product_name VARCHAR(50),
//	product_category VARCHAR(50),
//	product_quantity INT,
//	total_price VARCHAR(50),
//	id INT,
//	FOREIGN KEY (id) REFERENCES accounts(id)
//);
    
//    ALTER TABLE e_table 
//			ADD CONSTRAINT accounts 
//			FOREIGN KEY (id) REFERENCES accounts(id);
    
   // INSERT INTO e_table (product_name, product_category, product_quantity, total_price,id) VALUES ('Surf', 'Powder', 33, 100,11)
    

//      
//            String insertQuery1 = "INSERT INTO e_table(id) SELECT id FROM accounts WHERE username = ?";
//            PreparedStatement insertStmt1 = conn.prepareStatement(insertQuery1);
//            insertStmt1.setInt(1, id);
    
    
    
    
    //ADD PRODUCT METHOD
//    try (Connection conn = DatabaseConnector.getConnection()) {
//            
//            // Check if username exists
//            
//            String checkQuery = "SELECT * FROM accounts WHERE firstname = ? ";
//            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
//            checkStmt.setString(1, FirstName);
//            ResultSet rs = checkStmt.executeQuery();
//
//            if (rs.next()) {
//                return true;
//            } else {
//                // Insert new user
//                String insertQuery = "INSERT INTO accounts (firstname, lastname,email,username,password) VALUES (?,?,?,?,?)";
//                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
//                //insertStmt.setString(1, fname);
//                insertStmt.setString(1, FirstName);
//                insertStmt.setString(2, LastName);
//                insertStmt.setString(3, Email);
//                insertStmt.setString(4, Username);
//                insertStmt.setString(5, Password);
//                insertStmt.executeUpdate();
//                return false;   
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
      //  }
    
    
    //USE TP JOIN THE TABLE
    
    
    
    
    
    
    //Tool in add value fk
//    INSERT INTO e_table (product_name, product_category, product_quantity, total_price, id, product_price)
//VALUES ('Surf', 'powder', 5, 25, 11, 5);
    
    
    
    //Feeling ko to tama na to
//     try {
//            // Establish the database connection
//            connection = DatabaseConnection.getConnection();
//
//            // Query the foreign key value
//            String query = "SELECT customer_id FROM Customers WHERE customer_name = ?";
//            preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1, "John Doe");
//            resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                int customerId = resultSet.getInt("customer_id");
//
//                // Add the foreign key value to another table
//                String insertQuery = "INSERT INTO Orders (order_id, customer_id, other_columns) VALUES (?, ?, ?)";
//                preparedStatement = connection.prepareStatement(insertQuery);
//                preparedStatement.setInt(1, 1); // Order ID
//                preparedStatement.setInt(2, customerId); // Foreign key value
//                preparedStatement.setString(3, "Other values");
//                preparedStatement.executeUpdate();
//
//                System.out.println("Foreign key value added successfully.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // Close the database resources
//            try {
//                if (resultSet != null) resultSet.close();
//                if (preparedStatement != null) preparedStatement.close();
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    
    
    
    
    
    
    
    //ADD PRODUCT
//    public static boolean addProduct( String product_name,String product_category,Integer product_quantity,Integer product_price,String total_price) {
//        try (Connection conn = DatabaseConnector.getConnection()) {
//            String qry = "SELECT * FROM e_table WHERE product_name = ?";
//            PreparedStatement pstmt1 = conn.prepareStatement(qry);
//         //   String loggedInUser = "1";
//           // pstmt1.setString(1, loggedInUser);
//            pstmt1.setString(1, product_name);
//            ResultSet rs = pstmt1.executeQuery();
//            if (rs.next()) {
//                return true;
//            } else {
//                // Insert new product in e_table
//             //   int user_id = rs.getInt("id");
//                String insertQuery = "INSERT INTO e_table (product_name, product_category,product_quantity,product_price,total_price) VALUES ( ?,?,?,?,?)";
//                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
//                //insertStmt.setString(1, fname);
//                insertStmt.setString(1, product_name);
//                insertStmt.setString(2, product_category);
//                insertStmt.setInt(3, product_quantity);
//                insertStmt.setInt(4, product_price);
//                insertStmt.setString(5, total_price);
//               // insertStmt.setInt(5, user_id);
//                insertStmt.executeUpdate();
//                return false;   
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//}
//     
//     }
//     //To insert new user information
//     public static boolean newRegisterUser( String FirstName,String LastName,String Email,String Username,String Password) {
//        try (Connection conn = DatabaseConnector.getConnection()) {
//            
//            // Check if username exists
//            
//            String checkQuery = "SELECT * FROM accounts WHERE firstname = ? ";
//            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
//            checkStmt.setString(1, FirstName);
//            
//            //Trial id
////            String query = "SELECT id FROM accounts WHERE username = ?";
////            PreparedStatement pstmt1 = conn.prepareStatement(query);
////            pstmt1.setString(1,id);
//            ResultSet rs = checkStmt.executeQuery();
//
//            if (rs.next()) {
//                return true;
//            } else {
//                // Insert new user
//                String insertQuery = "INSERT INTO accounts (firstname, lastname,email,username,password) VALUES (?,?,?,?,?)";
//                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
//                //insertStmt.setString(1, fname);
//                insertStmt.setString(1, FirstName);
//                insertStmt.setString(2, LastName);
//                insertStmt.setString(3, Email);
//                insertStmt.setString(4, Username);
//                insertStmt.setString(5, Password);
//                insertStmt.executeUpdate();
//                return false;   
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        }
//        
//     }
    
    
//    }
//}
    
    
    
    //LAMAN NG ELSE SA TABLE FORM
//     AccountHandler.addProduct(proname,proCgy,proQty1,totalprice,null,price1);               
//                String data[]={proname,proCgy,proQty,price,totalprice};
//                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
//                tblModel.addRow(data);
//                txtProName.setText("");
//                txtCategory.setText("");
//                txtQty.setText("");
//                txtPrice.setText("");
//                JOptionPane.showMessageDialog(this, "Add data successfully!");



//new table in usertableform
//    try (Connection conn = DatabaseConnector.getConnection()) {
//            String sql = "SELECT * FROM public.products_inventory where user_acc = ?";
//            PreparedStatement stmt = conn.prepareStatement(sql);  
//                String name = name123.getText();
//                stmt.setString(1,name);
//                ResultSet rs = stmt.executeQuery(); {
//                while (rs.next()) {
//                    
//                    // Process the results
//                  //  String id = String.valueOf(rs.getInt("id"));
//                    String customer = rs.getString("user_acc");
//                    String product = rs.getString("product_name");
//                    String category = rs.getString("product_category");
//                    String quantity =  String.valueOf(rs.getString("product_quantity"));
//                    String price =  String.valueOf(rs.getString("product_price"));
//                    String total =  String.valueOf(rs.getString("total_price"));
//                    // Do something with the data
//                    
//                    String dataProducts[] = {null,customer,product,category,quantity,price,total};
//                    DefaultTableModel tblModel = (DefaultTableModel)proTable.getModel();
//                    tblModel.addRow(dataProducts);
//                }
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Database connection error: " +
//                e.getMessage());
//        }


//Electronics:

//Computers and Laptops
//Smartphones and Tablets
//TVs and Home Theater Systems
//Cameras and Photography Equipment
//Audio and Headphones
//Gaming Consoles and Accessories
//Home Appliances (e.g., refrigerators, washing machines)
//Home and Kitchen:
//
//Furniture
//Home Decor
//Kitchen Appliances (e.g., blenders, toasters, coffee makers)
//Cookware and Bakeware
//Bedding and Bath
//Cleaning Supplies
//Home Improvement Tools
//Fashion and Apparel:
//
//Men's Clothing
//Women's Clothing
//Shoes and Footwear
//Accessories (e.g., bags, belts, hats)
//Jewelry and Watches
//Activewear and Sports Clothing
//Beauty and Personal Care:
//
//Skincare Products
//Makeup and Cosmetics
//Haircare Products
//Fragrances
//Personal Care Appliances (e.g., hair dryers, electric toothbrushes)
//Bath and Body Products
//Health and Wellness:
//
//Vitamins and Supplements
//Fitness Equipment
//Sports and Outdoor Gear
//Medical Equipment and Supplies
//Wellness and Relaxation Products (e.g., massagers, essential oils)
//Personal Care Products (e.g., first aid kits, thermometers)
//Baby and Kids:
//
//Baby Care Products
//Diapers and Wipes
//Kids' Clothing and Accessories
//Toys and Games
//Baby Gear (e.g., strollers, car seats)
//Nursery and Furniture
//Automotive and Tools:
//
//Car Accessories and Parts
//Tools and Equipment
//Motorcycle Accessories
//Garage and Storage Solutions
//Car Care and Maintenance Products
//Sports and Fitness:
//
//Exercise Equipment
//Sports Clothing and Shoes
//Outdoor Gear
//Fitness Trackers and Accessories
//Team Sports Equipment
//Books, Movies, and Music:
//
//Fiction and Non-fiction Books
//Movies and TV Shows (DVDs, Blu-rays)
//Music Albums and Singles
//E-books and Audiobooks
//Office and Stationery:
//
//Office Supplies (e.g., pens, paper, folders)
//Desk Accessories
//Printers and Scanners
//Notebooks and Journals
//Writing Instruments
//Pet Supplies:
//
//Dog and Cat Food
//Pet Toys and Accessories
//Beds and Furniture
//Grooming Products
//Pet Health and Wellness
//Home Improvement and Garden:
//
//Power Tools
//Gardening Tools and Equipment
//Outdoor Furniture and Decor
//Lighting and Electrical
//Plumbing and Fixtures
//Food and Groceries:
//
//Fresh Produce
//Dairy and Eggs
//Canned and Packaged Foods
//Snacks and Beverages
//Baking Ingredients
//Condiments and Sauces
//Travel and Luggage:
//
//Luggage and Suitcases
//Travel Accessories
//Backpacks and Daypacks
//Travel Electronics
//Travel-sized Toiletries
//Arts and Crafts:
//
//Art Supplies
//Craft Kits
//Scrapbooking and Paper Crafts
//Sewing and Knitting Supplies
//DIY and Home Crafts

//
//    
//    Electronics:
//
//Computers and Laptops
//Smartphones and Tablets
//TVs and Home Theater Systems
//Cameras
//Audio Equipment
//Home and Kitchen:
//
//Furniture
//Home Decor
//Kitchen Appliances
//Cookware and Bakeware
//Bedding and Bath Products
//Fashion and Apparel:
//
//Clothing (Men's, Women's, and Children's)
//Shoes and Footwear
//Accessories (Bags, Jewelry, Hats, etc.)
//Health and Beauty:
//
//Skincare Products
//Makeup and Cosmetics
//Haircare Products
//Personal Care Appliances
//Health Supplements
//Sports and Outdoors:
//
//Fitness Equipment
//Sports Clothing and Shoes
//Outdoor Gear
//Team Sports Equipment
//Camping and Hiking Gear
    
    
    
    //SELECT p.*
//FROM e_products p
//WHERE p.id IN (
//    SELECT u.id
//    FROM accounts u
//    WHERE u.username = 'kyle1234'
//);
    
    
    
    //delete with relationship
//    DELETE FROM e_products
//WHERE id IN (
//    SELECT id
//    FROM accounts
//    WHERE username = 'danica123'

}
