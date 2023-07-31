/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystemui.querymethods;

/**
 *
 * @author Danica
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnector {
    
        private static final String DB_URL = "jdbc:postgresql://localhost:5432/inventorysystem-db";
        private static final String USER = "postgres";
        private static final String PASS = "admin123";
        public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
        }
}

    
    

