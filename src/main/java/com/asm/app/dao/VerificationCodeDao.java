/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.dao;

import com.asm.app.helpers.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class VerificationCodeDao {

    public String getCode() {
        int number = (int) (Math.random() * 999999);

        String code = String.valueOf(number);

        for (int i = 0; i < 6 - code.length(); i++) {
            code = "0" + code;
        }
        System.out.println(code);
        return code;
    }

    public String createCode(String username) throws Exception {
        String code = getCode();

        String sql = "EXEC sp_insertNewCode ?, ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setNString(1, username);
            pstmt.setString(2, code);
            return pstmt.executeUpdate() > 0 ? code : null;
        }
    }

    public boolean deleteCode(String username) throws Exception {
        String code = getCode();

        String sql = "DELETE FROM Verification_Code WHERE account = ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setNString(1, username);
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean compareCode(String username, String code) throws Exception {
        String sql = "EXEC sp_compareCode ?, ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setNString(1, username);
            pstmt.setNString(2, code);

            try (
                     ResultSet resultSet = pstmt.executeQuery();) {
                if (resultSet.next()) {
                    return resultSet.getBoolean("result");
                } else {
                    return false;
                }
            }
        }
    }



}
