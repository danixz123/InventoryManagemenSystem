/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystemui;

/**
 *
 * @author Danica
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TestConnection {
public static void main(String[] args) {
     try (Connection conn = DatabaseConnector.getConnection()) {
        String sql = "SELECT * FROM public.accounts ORDER BY id ASC";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
        // Process the results
        String id = String.valueOf(rs.getInt("id"));
        String firstname = rs.getString("firstname");
        String lastname = rs.getString("lastname");
        String email = rs.getString("email");
        String username = rs.getString("username");
        String password = rs.getString("password");
        // Do something with the data
        System.out.println(firstname);
        }
        }
    } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database connection error: " +
    e.getMessage());
    }
     
     
}
//try (Connection conn = DatabaseConnector.getConnection()) {
//String sql = "SELECT * FROM users";
//try (PreparedStatement stmt = conn.prepareStatement(sql);
//ResultSet rs = stmt.executeQuery()) {
//while (rs.next()) {
//// Process the results
//String columnName = rs.getString("username");
//// Do something with the data
//System.out.println(columnName);
//}
//}
//} catch (SQLException e) {
//JOptionPane.showMessageDialog(null, "Database connection error: " +
//e.getMessage());
//}
//}
//public static void DataToTable(){
//   
//
//}
}