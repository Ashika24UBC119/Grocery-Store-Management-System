package com.mycompany.grocerystore;

import java.sql.Connection;
import java.sql.DriverManager;

public class GroceryStore {

    public static void main(String[] args) {

        try {
            // Database connection details
            String url = "jdbc:mysql://localhost:3306/grocery";
            String user = "root";
            String password = "root";   // use the password you set in MySQL

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to MySQL successfully!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
