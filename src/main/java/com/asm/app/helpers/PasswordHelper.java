/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Lenovo
 */
public class PasswordHelper {

    public static String hashPassword(String password) {
        return DigestUtils.md5Hex(password).toUpperCase();
    }

    public static boolean verifyPassword(String password, String hash) {
        return hash.equals(hashPassword(password));
    }

    private static void showPass(JPasswordField field, JComponent button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                char key = field.getEchoChar();
                if (key == '*') {
                    field.setEchoChar((char) 0);
                } else {
                    field.setEchoChar('*');
                }
            }
        });
    }

    public static void showPassword(JPasswordField field, JLabel button) {
        showPass(field, button);
    }

    public static void showPassword(JPasswordField field, JButton button) {
        showPass(field, button);
    }

}
