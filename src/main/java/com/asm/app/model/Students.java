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
public class Students {

    protected String ID;
    protected String fullname;
    protected String email;
    protected String phoneNumber;
    protected int gender;
    protected String address;
    protected byte[] avata;

    public Students() {
    }

    public Students(String ID, String fullname, String email, String phoneNumber, int gender, String address, byte[] avata) {
        this.ID = ID;
        this.fullname = fullname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.avata = avata;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public byte[] getAvata() {
        return avata;
    }

    public void setAvata(byte[] avata) {
        this.avata = avata;
    }

    public String getStringGender() {
        return (this.gender == 1) ? "Male" : "Female";
    }

    public String getUsername() {
        String value = "";
        String[] parts = this.getFullname().split(" ");
        value += parts[parts.length-1];
        for (int i = 0; i < parts.length - 1; i++) {
            value += parts[i].substring(0, 1);
        }
        value += this.getID();
        value = Converter.removeSign(value);
        return value.toLowerCase();
    }

}
