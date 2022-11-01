/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class MessageDialogHelper {

    public static void showMessageDialog(Component parent, String message, String title) {
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
//        ShowMessage.showMessageDialog(parent, message, title);
    }

    public static void showErrorDialog(Component parent, String message, String title) {
        title = (title == null) ? "Error" : title;
        JOptionPane.showMessageDialog(parent, message, title, JOptionPane.ERROR_MESSAGE);
//        ShowMessage.showErrorDialog(parent, message, title);
    }

    public static int showConfimDialog(Component parent, String message, String title) {
        return JOptionPane.showConfirmDialog(parent, message, title, JOptionPane.YES_NO_OPTION);
//        return ShowMessage.showConfirmDialog(parent, message, title);
    }
}
