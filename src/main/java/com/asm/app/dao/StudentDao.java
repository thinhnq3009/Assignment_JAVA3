/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.dao;

import com.asm.app.helpers.DatabaseHelper;
import com.asm.app.helpers.PasswordHelper;
import com.asm.app.helpers.ImageHelper;
import com.asm.app.model.Students;
import com.asm.app.model.User;
import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author Lenovo
 */
public class StudentDao {

    public ArrayList<Students> getStudentsDontHaveScore() throws Exception {
        String sql = "SELECT Student.* \n"
                + "FROM Student\n"
                + "WHERE Student.studentId NOT IN (SELECT Score.studentId FROM Score)";
        ArrayList<Students> list = new ArrayList<>();
        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            try (
                     ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {
                    String studentId = resultSet.getString("studentId");
                    String fullname = resultSet.getString("fullname");
                    int gender = resultSet.getInt("gender");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phoneNumber");
                    String studentAddress = resultSet.getString("studentAddress");
                    byte[] avata = resultSet.getBytes("avata");

                    list.add(new Students(studentId, fullname, email, phoneNumber, gender, studentAddress, avata));

                }
                return list;
            }
        }
    }

    public ArrayList<Students> getStudents(String key) throws Exception {
        String sql = "EXEC findStudent ?";
        ArrayList<Students> list = new ArrayList<>();
        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {

            pstmt.setNString(1, "%" + key + "%");
            try (
                     ResultSet resultSet = pstmt.executeQuery();) {
                while (resultSet.next()) {

                    String studentId = resultSet.getString("studentId");
                    String fullname = resultSet.getString("fullname");
                    int gender = resultSet.getInt("gender");
                    String email = resultSet.getString("email");
                    String phoneNumber = resultSet.getString("phoneNumber");
                    String studentAddress = resultSet.getString("studentAddress");

                    Blob blod = resultSet.getBlob("avata");
                    byte[] avata;
                    if (blod != null) {
                        avata = blod.getBytes(1, (int) blod.length());
                    } else {
                        avata = null;
                    }

                    list.add(new Students(studentId, fullname, email, phoneNumber, gender, studentAddress, avata));

                }
                return list;
            }
        }
    }

    public ArrayList<Students> getStudents() throws Exception {
        return getStudents("");
    }

    public boolean insert(Students student) throws Exception {

        String sql = "INSERT INTO dbo.Student"
                + "( studentId, fullname, gender, email, phoneNumber, studentAddress, avata) "
                + "VALUES ( ?, ?, ?, ?, ?, ?, ?);";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, student.getID());
            pstmt.setString(2, student.getFullname());
            pstmt.setInt(3, student.getGender());
            pstmt.setString(4, student.getEmail());
            pstmt.setString(5, student.getPhoneNumber());
            pstmt.setString(6, student.getAddress());
            if (student.getAvata() == null) {
                Blob blob = null;
                pstmt.setBlob(7, blob);
            } else {
                Blob blob = new SerialBlob(student.getAvata());
                pstmt.setBlob(7, blob);
            }
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean update(Students student) throws Exception {
        String sql = "EXEC updateStudent ?, ?, ?, ?, ?, ?, ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, student.getID());
            pstmt.setString(2, student.getFullname());
            pstmt.setInt(3, student.getGender());
            pstmt.setString(4, student.getEmail());
            pstmt.setString(5, student.getPhoneNumber());
            pstmt.setString(6, student.getAddress());
            if (student.getAvata() == null) {
                Blob blob = null;
                pstmt.setBlob(7, blob);
            } else {
                Blob blob = new SerialBlob(student.getAvata());
                pstmt.setBlob(7, blob);
            }
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean delete(Students student) throws Exception {
        String sql = "EXEC deleteStudent ?";

        try (
                 Connection conn = DatabaseHelper.openConnect();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setNString(1, student.getID());
            return pstmt.executeUpdate() > 0;
        }
    }
}
