/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class ReadTemplate {

    private String content;
    private String username;
    private String code;

    public ReadTemplate(String username, String code) {
        this.username = username;
        this.code = code;
    }

    public void setContent(File file) {
        try ( BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), "UTF8"))) {
            String str;

            while (true) {
                str = in.readLine();
                if (str == null) {
                    break;
                } else {
                    if (str.contains("~")) {
                        str = str.replace("~", (username == null ? code : username));
                        username = null;
                    }
                    content += (str.contains("null")) ? "" : str + "\n";
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getContent() {
        return content;
    }

}
