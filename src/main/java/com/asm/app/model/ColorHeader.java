/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Lenovo
 */
public class ColorHeader extends DefaultTableCellRenderer {
//    you have to add this method :
//    public class HeaderColor extends DefaultTableCellRenderer {

    private Color backgroud;
    private Color foreground;
    private Font font;

    public ColorHeader(Color backgroud, Color foreground, Font font) {
        this.backgroud = backgroud;
        this.foreground = foreground;
        this.font = font;
        setOpaque(true);
    }

  
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setBackground(this.backgroud);
        setForeground(foreground);
        setFont(font);
        setBorder(new EmptyBorder(5, 1, 5, 1));
        return this;
    }
//<table_name>.getTableHeader().setDefaultRenderer(new HeaderColor());
}
