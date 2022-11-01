/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.model;

import com.asm.app.helpers.Converter;

/**
 *
 * @author Lenovo
 */
public class Score {
    private String idStudent;
    private String fullname;
    private double enligsh;
    private double java;
    private double sqlServer;

    public Score() {
    }

    public Score(String idStudent, String fullname, double enligsh, double java, double sqlServer) {
        this.idStudent = idStudent;
        this.fullname = fullname;
        this.enligsh = enligsh;
        this.java = java;
        this.sqlServer = sqlServer;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getEnligsh() {
        return enligsh;
    }

    public void setEnligsh(double enligsh) {
        this.enligsh = enligsh;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getSqlServer() {
        return sqlServer;
    }

    public void setSqlServer(double sqlServer) {
        this.sqlServer = sqlServer;
    }
    
    public double getAvegare() {
        return Converter.round((java + enligsh + sqlServer) / 3, 2);
    }
}
