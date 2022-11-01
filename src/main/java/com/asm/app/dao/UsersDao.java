/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.dao;

import com.asm.app.helpers.DatabaseHelper;
import com.asm.app.helpers.PasswordHelper;
import com.asm.app.model.Students;
import com.asm.app.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class UsersDao {

    private final String DEFAULT_PASSWORD = PasswordHelper.hashPassword("poly123");

    public User login(String username, String password, StringBuilder stringBuilder) throws Exception {

        if (stringBuilder == null) {
            stringBuilder = new StringBuilder();
        }

        String sql = "SELECT * FROM Users WHERE account = ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, username);
            try ( ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    String passworDB = resultSet.getString("password");

                    if (PasswordHelper.verifyPassword(password, passworDB)) {
                        return new User(username, password, resultSet.getInt("role"));
                    } else {
                        stringBuilder.append("Password is incorrect !!!");
                    }
                } else {
                    stringBuilder.append("Username is incorrect !!!");
                }
            }
        }
        return null;
    }

    public User login(String username, char[] password, StringBuilder stringBuilder) throws Exception {
        return login(username, String.valueOf(password), stringBuilder);
    }

    public String getEmailByUsername(String username) throws Exception {
        String sql = "EXEC sp_getEmailByAccount ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setNString(1, username);

            try (
                     ResultSet resultSet = pstmt.executeQuery();) {
                if (resultSet.next()) {
                    String studentEmail = resultSet.getNString(1);
                    String teacherEmail = resultSet.getNString(2);
                    return studentEmail == null ? teacherEmail : studentEmail;
                } else {
                    return null;
                }

            }
        }
    }

    public boolean changePassword(String username, String newPassword) throws Exception {
        String sql = "UPDATE users SET [password] = ? WHERE account = ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            String hashPass = PasswordHelper.hashPassword(newPassword);
            pstmt.setString(1, hashPass);
            pstmt.setString(2, username);
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean changePassword(User user) throws Exception {
        return changePassword(user.getUsername(), user.getPassword());
    }

    public boolean createUsers(Students student) throws Exception {

        String username = student.getUsername();
        String password = DEFAULT_PASSWORD;
        String idStudent = student.getID();

        String sql = "INSERT INTO users VALUES (?, ?, 0, ?, NULL )";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, idStudent);

            return pstmt.executeUpdate() > 0;
        }
    }

}
