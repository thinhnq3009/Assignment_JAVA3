/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import com.asm.app.model.Score;
import com.asm.app.model.Students;

import com.asm.app.model.User;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ShareData {
    
    /**
    *<code>User Login Successfully will save here</code>
    */
    public static User userLogin/* = new User(null, null, 2)*/
            ;
    
    
    /**
     * <code>List students's score</code>
     */
    public static ArrayList<Score> listScore;
    
    /**
     * Student been selected in SelectStudent Dialog will save here
     */
    public static Students selectNewStudent;
    
}
