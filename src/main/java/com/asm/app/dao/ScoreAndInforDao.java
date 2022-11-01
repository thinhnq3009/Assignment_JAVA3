/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.dao;

import com.asm.app.helpers.DatabaseHelper;
import com.asm.app.model.ScoreAndInfor;
import com.asm.app.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class ScoreAndInforDao {

    public ScoreAndInfor getScoreAndInfor(User user) throws Exception {

        String username = user.getUsername();

        String sql = "EXEC getDataForStudentView ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, username);

            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {

                String ID = resultSet.getString("studentId");
                String fullname = resultSet.getString("fullname");
                String email = resultSet.getString("email");
                String phoneNumber = resultSet.getString("phoneNumber");
                int gender = resultSet.getInt("gender");
                String address = resultSet.getString("studentAddress");
                byte[] avata = resultSet.getBytes("avata");
                double english = resultSet.getDouble("english") ;
                double java = resultSet.getDouble("java");
                double sqlServer = resultSet.getDouble("sqlServer");

                return new ScoreAndInfor(english, java, sqlServer, ID, fullname, email, phoneNumber, gender, address, avata);
            }
        }

        return null;
    }
}
