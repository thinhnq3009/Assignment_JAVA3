/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.asm.app.helpers;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Lenovo
 */
public class ImageHelper {

    public static void getDefaultImage() {
        ImageIcon icon = new ImageIcon();
        Image image = ImageHelper.resize(icon.getImage(), 206, 223);
        ImageIcon resizeIcon = new ImageIcon(image);
    }

    public static Image resize(Image image, int width, int height) {
        return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public static byte[] toBytes(Image image, String type) throws IOException {
        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bimage.createGraphics();
        graphics2D.drawImage(image, 0, 0, null);
        graphics2D.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bimage, type, baos);
        return baos.toByteArray();
    }

    public static Image createImageFromBytes(byte[] data, String type) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        BufferedImage bufferedImage = ImageIO.read(bais);
        return bufferedImage.getScaledInstance(bufferedImage.getWidth(), bufferedImage.getHeight(), Image.SCALE_SMOOTH);
    }
}
