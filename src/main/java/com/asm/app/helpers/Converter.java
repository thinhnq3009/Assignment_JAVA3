/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

/**
 *
 * @author Lenovo
 */
public class Converter {

    public static double round(double f, int w) {
        int a = (int) Math.pow(10, w);
        f = f * a;
        f = (f - (int) f > 0.5) ? f + 1 : f;
        f = (int) f;
        return f / a;
    }

    public static String removeSign(String string) {
        for (String[] item : ARRAY_CHAR) {
            if (string.contains(item[0])) {
                string = string.replace(item[0], item[1]);
            }
        }

        return string;
    }

    final static String[][] ARRAY_CHAR
            = {{"á", "a"},
            {"à", "a"},
            {"ã", "a"},
            {"ả", "a"},
            {"ạ", "a"},
            {"ă", "a"},
            {"ắ", "a"},
            {"ằ", "a"},
            {"ẵ", "a"},
            {"ẳ", "a"},
            {"ặ", "a"},
            {"â", "a"},
            {"ấ", "a"},
            {"ầ", "a"},
            {"ẫ", "a"},
            {"ẩ", "a"},
            {"ậ", "a"},
            {"đ", "d"},
            {"ê", "e"},
            {"ế", "e"},
            {"ề", "e"},
            {"ễ", "e"},
            {"ể", "e"},
            {"ệ", "e"},
            {"í", "i"},
            {"ì", "i"},
            {"ĩ", "i"},
            {"ỉ", "i"},
            {"ị", "i"},
            {"ó", "o"},
            {"ò", "o"},
            {"õ", "o"},
            {"ỏ", "o"},
            {"ọ", "o"},
            {"ô", "o"},
            {"ố", "o"},
            {"ồ", "o"},
            {"ỗ", "o"},
            {"ổ", "o"},
            {"ộ", "o"},
            {"ơ", "o"},
            {"ớ", "o"},
            {"ờ", "o"},
            {"ỡ", "o"},
            {"ở", "o"},
            {"ợ", "o"},
            {"ú", "u"},
            {"ù", "u"},
            {"ũ", "u"},
            {"ủ", "u"},
            {"ụ", "u"},
            {"ư", "u"},
            {"ứ", "u"},
            {"ừ", "u"},
            {"ữ", "u"},
            {"ử", "u"},
            {"ự", "u"},
            {"ý", "y"},
            {"ỳ", "y"},
            {"ỹ", "y"},
            {"ỷ", "y"},
            {"ỵ", "y"},
            {"Á", "A"},
            {"À", "A"},
            {"Ã", "A"},
            {"Ả", "A"},
            {"Ạ", "A"},
            {"Ă", "A"},
            {"Ắ", "A"},
            {"Ằ", "A"},
            {"Ẵ", "A"},
            {"Ẳ", "A"},
            {"Ặ", "A"},
            {"Â", "A"},
            {"Ấ", "A"},
            {"Ầ", "A"},
            {"Ẫ", "A"},
            {"Ẩ", "A"},
            {"Ậ", "A"},
            {"Đ", "D"},
            {"Ê", "E"},
            {"Ế", "E"},
            {"Ề", "E"},
            {"Ễ", "E"},
            {"Ể", "E"},
            {"Ệ", "E"},
            {"Í", "I"},
            {"Ì", "I"},
            {"Ĩ", "I"},
            {"Ỉ", "I"},
            {"Ị", "I"},
            {"Ó", "O"},
            {"Ò", "O"},
            {"Õ", "O"},
            {"Ỏ", "O"},
            {"Ọ", "O"},
            {"Ô", "O"},
            {"Ố", "O"},
            {"Ồ", "O"},
            {"Ỗ", "O"},
            {"Ổ", "O"},
            {"Ộ", "O"},
            {"Ơ", "O"},
            {"Ớ", "O"},
            {"Ờ", "O"},
            {"Ỡ", "O"},
            {"Ở", "O"},
            {"Ợ", "O"},
            {"Ú", "U"},
            {"Ù", "U"},
            {"Ũ", "U"},
            {"Ủ", "U"},
            {"Ụ", "U"},
            {"Ư", "U"},
            {"Ứ", "U"},
            {"Ừ", "U"},
            {"Ữ", "U"},
            {"Ử", "U"},
            {"Ự", "U"},
            {"Ý", "Y"},
            {"Ỳ", "Y"},
            {"Ỹ", "Y"},
            {"Ỷ", "Y"},
            {"Ỵ", "Y"}
            };
}
