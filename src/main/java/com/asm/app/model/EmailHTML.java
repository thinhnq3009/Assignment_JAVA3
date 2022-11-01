/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class EmailHTML {

    private static final String key = "~";

    private String content;

    public EmailHTML(String content) {
        this.content = (content.endsWith("~")) ? content + " " : content;
//           this.content = content;
    }

    public EmailHTML(File file) {
        this.content = readFile(file);
    }

    public String getContent() {
        String out = content;
        while (out.contains(key)) {
            out = out.replace(key, "");
        }
        return out;
//        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int count() {
        int n = 0;
        int c = 0;
        while (n != -1) {
            n = content.indexOf(key, n);
            n = n == -1 ? -1 : n + 1;
            c += n == -1 ? 0 : 1;
        }
        return c;
    }

    /**
     *
     * Change /?/ at <code>n</code> to <code>text</code> in <code>content</code>
     *
     * @param n Position of |?| in content
     * @param text Text will change at /?/
     */
    public void setText(int n, String text) {

        String[] parts = parts = content.split(key);

        content = "";

        for (int i = 0; i < parts.length; i++) {
            if (i == parts.length - 1) {
                content += parts[i];
                return;
            }
            content += (i == n - 1) ? parts[i] + key + text : parts[i] + key;
        }
    }

    public String readFile(File file) {
        try ( BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF8"))) {
            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }

            return str;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }

    public String readFile(String url) {
        return readFile(new File(url));
    }

}
