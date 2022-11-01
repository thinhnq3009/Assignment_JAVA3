/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.dao;

import com.asm.app.helpers.DatabaseHelper;
import com.asm.app.model.Score;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ScoreDao {

    public ArrayList<Score> getScores() throws Exception {

        ArrayList<Score> list = new ArrayList<>();
        String sql = "EXEC getScores";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try ( ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    String idStudent = resultSet.getNString("studentId");
                    String fullname = resultSet.getNString("fullname");
                    double english = resultSet.getDouble("english");
                    double java = resultSet.getDouble("java");
                    double sqlServer = resultSet.getDouble("sqlServer");

                    list.add(new Score(idStudent, fullname, english, java, sqlServer));

                }

                return list;
            }
        }
    }

    public ArrayList<Score> getScores(String key) throws Exception {

        ArrayList<Score> list = new ArrayList<>();
        String sql = "EXEC findScore ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setNString(1, "%" + key + "%");

            try ( ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    String idStudent = resultSet.getNString("studentId");
                    String fullname = resultSet.getNString("fullname");
                    double english = resultSet.getDouble("english");
                    double java = resultSet.getDouble("java");
                    double sqlServer = resultSet.getDouble("sqlServer");

                    list.add(new Score(idStudent, fullname, english, java, sqlServer));
                }

                return list;
            }
        }
    }

    public boolean insert(Score score) throws Exception {
        String sql = "EXEC insertScore ?, ?, ?, ?;";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, score.getIdStudent());
            pstmt.setDouble(2, score.getEnligsh());
            pstmt.setDouble(3, score.getJava());
            pstmt.setDouble(4, score.getSqlServer());

            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(Score score) throws Exception {
        String sql = "EXEC updateScore ?, ?, ?, ?;";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, score.getIdStudent());
            pstmt.setDouble(2, score.getEnligsh());
            pstmt.setDouble(3, score.getJava());
            pstmt.setDouble(4, score.getSqlServer());
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean delete(Score score) throws Exception {
        String sql = "EXEC deleteScore ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, score.getIdStudent());
            return pstmt.executeUpdate() > 0;
        }
    }

}
