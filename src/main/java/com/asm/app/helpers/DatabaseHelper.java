/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lenovo
 */
public class DatabaseHelper {
    public static Connection openConnect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=Students_Management;";
        String usernameDB = "sa";
        String passwordB = "songlong";
        Connection conn = DriverManager.getConnection(connectionUrl, usernameDB, passwordB);

        return conn;
    }
}
