/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystemui;

/**
 *
 * @author Danica
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QueryMethodHandler {

   // private static int id;
  
     public static boolean addProduct( String product_name,String product_category,Integer product_quantity,String total_price,String id,Integer product_price) {    

//         try (Connection conn = DatabaseConnector.getConnection()) {
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
//        }
         return false;

//         try (Connection conn = DatabaseConnector.getConnection()) {
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
//        }
     }
     //To insert new user information
     public static boolean newRegisterUser( String FirstName,String LastName,String Email,String Username,String Password, String Role) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            
            // Check if username exists
            
            String checkQuery = "SELECT * FROM accounts WHERE username = ? ";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, Username);
            
           
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
        
                return true;
            } else {
                // Insert new user
                String insertQuery = "INSERT INTO accounts (firstname, lastname,email,username,password,role) VALUES (?,?,?,?,?,?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                //insertStmt.setString(1, fname);
                insertStmt.setString(1, FirstName);
                insertStmt.setString(2, LastName);
                insertStmt.setString(3, Email);
                insertStmt.setString(4, Username);
                insertStmt.setString(5, Password);
                insertStmt.setString(6,Role);
                insertStmt.executeUpdate();
                return false;   
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        
     }
     
     //To check if username is already existing
     public static boolean loginCheckUser(String username, String password) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "SELECT * FROM accounts WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String columnRole = rs.getString("role");
                if(columnRole.equals("admin")){
                    //JOptionPane.showMessageDialog(null,"Welcome "+ columnRole);
                    new WelcomeAdmin().setVisible(true);
                }
                else if(columnRole.equals("user")){
                    int columnID = rs.getInt("id");
                    
//                    UserMainSystem tosystem = new UserMainSystem();                  
//                    tosystem.menuTab.setText(username);
//                    tosystem.lblUsername.setText(username);
//                    tosystem.displayAddProduct();
//                    tosystem.displayTable();
//                    tosystem.setVisible(true);
                    InventoryMainSystemUser tosystem = new InventoryMainSystemUser();                  
                    tosystem.menuTab.setText(username);
                    tosystem.lblGetId.setText(String.valueOf(columnID));
                    tosystem.lblUsername.setText(username);
                    tosystem.displayAddProduct();
                    tosystem.displayTable();
                    tosystem.setVisible(true);
                }
                // User exists with the provided username and password
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // No user found with the provided username and password
        return false;
    }
      public static String welcomeFName(String fname) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "SELECT firstname FROM accounts WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, fname);
        //    pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String fname1 = rs.getString(1);
                return fname1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // No user found with the provided username and password
        return null;
    }
      public static String welcomeLName(String lName) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            String query = "SELECT lastname FROM accounts WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, lName);
        //    pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String lName1 = rs.getString(1);
                return lName1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // No user found with the provided username and password
        return null;
    }
      public static boolean addTableValue11(String user_acc,String product_name,String product_category,Integer product_quantity,Integer product_price,String total_price ) {
//          try (Connection conn = DatabaseConnector.getConnection()) {
//            
//            // Check if username exists
//            
//            String checkQuery = "SELECT * FROM accounts WHERE username = ? ";
//            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
//            checkStmt.setString(1, Username);
//            
//           
//            ResultSet rs = checkStmt.executeQuery();
         try (Connection conn = DatabaseConnector.getConnection()) {
            String qry = "SELECT * FROM products_inventory WHERE product_name = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(qry);
         //   String loggedInUser = "1";
           // pstmt1.setString(1, loggedInUser);
            pstmt1.setString(1, product_name);
            ResultSet rs = pstmt1.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                // Insert new product in e_table
             //   int user_id = rs.getInt("id");
                String insertQuery = "INSERT INTO products_inventory (user_acc,product_name, product_category,product_quantity,product_price,total_price) VALUES ( ?,?,?,?,?,?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
              
                insertStmt.setString(1,user_acc);
                insertStmt.setString(2, product_name);
                insertStmt.setString(3, product_category);
                insertStmt.setInt(4, product_quantity);
                insertStmt.setInt(5, product_price);
                insertStmt.setString(6, total_price);
////                //
//                insertStmt.setString(1, product_name);
//                insertStmt.setString(2, product_category);
//                insertStmt.setInt(3, product_quantity);
//                insertStmt.setInt(4, product_price);
//                insertStmt.setString(5, total_price);
                //
               // insertStmt.setInt(5, user_id);
                insertStmt.executeUpdate();
                return false;   
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      } public static boolean addTry(String user_acc,String product_name,String product_category,Integer product_quantity,Integer product_price,String total_price,Integer id ) {
//          
         try (Connection conn = DatabaseConnector.getConnection()) {
            String qry = "SELECT * FROM e_products WHERE product_name = ?";
            PreparedStatement pstmt1 = conn.prepareStatement(qry);
         
            pstmt1.setString(1, product_name);
            ResultSet rs = pstmt1.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                
                String insertQuery = "INSERT INTO e_products (product_name, product_category,product_quantity,product_price,total_price,id) VALUES ( ?,?,?,?,?,?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
              //int id1 = null;
               
                insertStmt.setString(1, product_name);
                insertStmt.setString(2, product_category);
                insertStmt.setInt(3, product_quantity);
                insertStmt.setInt(4, product_price);
                insertStmt.setString(5, total_price);
                insertStmt.setInt(6, id);
            
                insertStmt.executeUpdate();
                return false;   
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      } 
    }