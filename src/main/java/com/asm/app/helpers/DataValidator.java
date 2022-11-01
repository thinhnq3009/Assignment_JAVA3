/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class DataValidator {

    public static boolean valiDateEmpty(JTextField filed, StringBuilder sb, String error, Color color) {
        if (filed.getText().isBlank()) {
            sb.append(error).append("\n");
            filed.setBackground(StyleHelper.ERROR_COLOR);
            filed.requestFocus();
            return false;
        } else {
            filed.setBackground(color);
            return true;
        }

    }
    
    public static boolean valiDateEmpty(JTextField filed, StringBuilder sb, String error) {
        return valiDateEmpty(filed, sb, error, StyleHelper.DEFAULT_COLOR);
    }
    
    

    public static boolean valiDateEmpty(JPasswordField filed, StringBuilder sb, String error, Color color) {
        if (String.valueOf(filed.getPassword()).isBlank()) {
            sb.append(error).append("\n");
            filed.setBackground(StyleHelper.ERROR_COLOR);
            filed.requestFocus();
            return false;
        } else {
            filed.setBackground(color);
            return true;
        }
    }
    
     public static boolean valiDateEmpty(JPasswordField filed, StringBuilder sb, String error) {
         return valiDateEmpty(filed, sb, error, StyleHelper.DEFAULT_COLOR);
     }

    public static boolean validateIsDouble(JTextField filed, StringBuilder sb, String error) {
        try {
            String text = filed.getText();
            Double.parseDouble(text);
            filed.setBackground(StyleHelper.DEFAULT_COLOR);
            return true;
        } catch (NumberFormatException e) {
            sb.append(error).append("\n");
            filed.setBackground(StyleHelper.ERROR_COLOR);
            filed.requestFocus();
            return false;
        }
    }
    
    
    public static boolean validateScore(JTextField field, StringBuilder sb, String error) {
        String content = field.getText();
        if (content.matches("[0-9][.,][0-9]{1,2}|10|0|[0-9]|10.0|0.0")) {
            field.setBackground(StyleHelper.DEFAULT_COLOR_SCORE);
            return true;
        } else {
            sb.append(error).append("\n");
            field.setBackground(StyleHelper.ERROR_COLOR);
            field.requestFocus();
            return false;
        }
    }

}
