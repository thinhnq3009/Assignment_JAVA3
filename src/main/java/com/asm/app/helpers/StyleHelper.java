
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import com.asm.app.model.ColorHeader;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Lenovo
 */
public class StyleHelper {

    public static final Color ERROR_COLOR = Color.RED;
    public static final Color SUCCESS_COLOR = Color.GREEN;
    public static final Color DEFAULT_COLOR = new Color(254, 254, 213);
    public static final Color DEFAULT_COLOR_SCORE = new Color(204, 255, 204);

    private static final int B = 25;
    private static final int L = 45;

    private static void createButton(JLabel lbl) {
        lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Color colorBackgroundDefault = lbl.getBackground();

        int r = colorBackgroundDefault.getRed();
        int g = colorBackgroundDefault.getGreen();
        int b = colorBackgroundDefault.getBlue();

        int rh = (r - B < 0) ? (r + B) : (r - B);
        int gh = (g - B < 0) ? (g + B) : (g - B);
        int bh = (b - B < 0) ? (b + B) : (b - B);

        Color colorBackgroundHover = new Color(rh, gh, bh);

        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl.setBackground(colorBackgroundHover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl.setBackground(colorBackgroundDefault);
            }
        });
    }

    public static void createButton(JLabel... lbls) {
        for (JLabel lbl : lbls) {
            createButton(lbl);
        }
    }

    private static void createLink(JLabel lbl) {
        lbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Color colorDefault = lbl.getForeground();

        int r = colorDefault.getRed();
        int g = colorDefault.getGreen();
        int b = colorDefault.getBlue();

        int rh = (r - L < 0) ? (r + L) : (r - L);
        int gh = (g - L < 0) ? (g + L) : (g - L);
        int bh = (b - L < 0) ? (b + L) : (b - L);

        Color colorHover = new Color(rh, gh, bh);

        lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl.setForeground(colorHover);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl.setForeground(colorDefault);
            }
        });
    }

    public static void createLink(JLabel... lbls) {
        for (JLabel lbl : lbls) {
            createLink(lbl);
        }
    }

    public static void designTable(JTable table) {

        table.setFocusable(false);

        table.setRowHeight(25);

        table.setSelectionBackground(new java.awt.Color(255, 153, 153));

        table.setSelectionForeground(new java.awt.Color(51, 51, 51));

        table.getTableHeader().setReorderingAllowed(false);
        
        table.setFont(new java.awt.Font("Arial", 2, 14));

        Color backgroud = new Color(248, 170, 39);
        Color foreground = new Color(32, 101, 95);
        Font font = new Font("Arial", Font.BOLD, 20);

        ColorHeader ch = new ColorHeader(backgroud, foreground, font);

        table.getTableHeader().setDefaultRenderer(ch);
        
        table.setRowHeight(25);
    }
}
