/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.model;

/**
 *
 * @author Lenovo
 */
public class User {

    public static final int STUDENT = 0;
    public static final int LECTURERS = 1;
    public static final int TRANNING_STAFF = 2;

    String username;
    String password;
    int role;

    public User() {
        this.username = null;
        this.role = -1;
    }

    public User(String username,String password, int role) {
        this.username = username;
        this.role = role;
        this.password = password;
    }
    
    public int getRole() {
        return role;
    }

    public String getRoleString() {
        return switch (role) {
            case STUDENT -> "Student";
            case LECTURERS -> "Lecturer";
            case TRANNING_STAFF -> "Tranning Staff";
            default -> null;
        };
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    


    @Override
    public String toString() {
        return  "Username: " + this.username + "\nRole: " + this.getRoleString();
    }
}
