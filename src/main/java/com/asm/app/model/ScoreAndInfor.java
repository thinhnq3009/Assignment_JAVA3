/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.model;

/**
 *
 * @author Lenovo
 */
public class ScoreAndInfor extends Students {

    private double english;
    private double java;
    private double SqlSever;

    public ScoreAndInfor() {
    }

    public ScoreAndInfor(double english, double java, double SqlSever) {
        this.english = english;
        this.java = java;
        this.SqlSever = SqlSever;
    }

    public ScoreAndInfor(double english, double java, double SqlSever, String ID, String fullname, String email, String phoneNumber, int gender, String address, byte[] avata) {
        super(ID, fullname, email, phoneNumber, gender, address, avata);
        this.english = english;
        this.java = java;
        this.SqlSever = SqlSever;
    }
    
    

    public ScoreAndInfor(Students student, double english, double java, double SqlSever) {
        super(student.ID,
                student.fullname,
                student.email,
                student.phoneNumber,
                student.gender,
                student.address,
                student.avata);
        this.english = english;
        this.java = java;
        this.SqlSever = SqlSever;
    }

    public ScoreAndInfor(Students student, Score score){
        super(student.ID,
                student.fullname,
                student.email,
                student.phoneNumber,
                student.gender,
                student.address,
                student.avata);
        this.english = score.getEnligsh();
        this.java = score.getJava();
        this.SqlSever = score.getSqlServer();
    }

    public ScoreAndInfor(Students student) {
        super(student.ID,
                student.fullname,
                student.email,
                student.phoneNumber,
                student.gender,
                student.address,
                student.avata);
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getSqlSever() {
        return SqlSever;
    }

    public void setSqlSever(double SqlSever) {
        this.SqlSever = SqlSever;
    }
    
    public double getAvegare() {
        return (english + java + SqlSever) / 3;
    }
}
