/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.asm.app.ui;

import com.asm.app.helpers.StyleHelper;
import com.asm.app.dao.UsersDao;
import com.asm.app.dao.VerificationCodeDao;
import com.asm.app.helpers.MessageDialogHelper;
import com.asm.app.helpers.PasswordHelper;
import com.asm.app.helpers.ReadTemplate;
import com.asm.app.model.MailSender;
import com.asm.app.model.User;
import java.awt.CardLayout;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class ResetPassworDialog extends javax.swing.JDialog {

    public String username_static = "";

    /**
     * Creates new form ResetPassworDialog
     */
    public ResetPassworDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        StyleHelper.createButton(btnLogin, btnSend, btnCheckVerificationCode, btnShowNewpass, btnShowConfirmPass);
        PasswordHelper.showPassword(txtNewPass, btnShowNewpass);
        PasswordHelper.showPassword(txtConfirmPass, btnShowConfirmPass);
    }

    public void showChangePassContainer() {
        JPanel parent = jpnCardContainer;
        CardLayout cardLayout = (CardLayout) (parent.getLayout());
        cardLayout.last(parent);
    }

    public void setEnabledInputPass(boolean b) {
        txtNewPass.setEnabled(b);
        txtConfirmPass.setEnabled(b);
        lblTiel.setEnabled(b);
        lblNewPass.setEnabled(b);
        btnShowConfirmPass.setEnabled(b);
        btnShowNewpass.setEnabled(b);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnCardContainer = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        ContainerLogInForm12 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        lblDescribe = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        btnSend = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblMessage1 = new javax.swing.JLabel();
        jpnEnterCode = new javax.swing.JPanel();
        ContainerLogInForm13 = new javax.swing.JPanel();
        lblTitle1 = new javax.swing.JLabel();
        jpnInputVerificationCode = new javax.swing.JPanel();
        txtCodeInput = new javax.swing.JTextField();
        lblTitleInput = new javax.swing.JLabel();
        btnCheckVerificationCode = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        btnCancel1 = new javax.swing.JLabel();
        btnChange = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        lblNewPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        btnShowNewpass = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        lblTiel = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        btnShowConfirmPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jpnCardContainer.setLayout(new java.awt.CardLayout());

        jPanel37.setBackground(new java.awt.Color(255, 243, 154));

        ContainerLogInForm12.setBackground(new java.awt.Color(254, 254, 213));
        ContainerLogInForm12.setForeground(new java.awt.Color(102, 255, 102));

        lblTitle.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(32, 101, 95));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Reset Password");

        jPanel35.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        jPanel35.setOpaque(false);
        jPanel35.setLayout(new java.awt.BorderLayout(10, 0));

        txtInput.setBackground(new java.awt.Color(250, 197, 91));
        txtInput.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtInput.setForeground(new java.awt.Color(32, 101, 95));
        txtInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtInput.setMargin(new java.awt.Insets(2, 20, 2, 20));
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername1ActionPerformed(evt);
            }
        });
        jPanel35.add(txtInput, java.awt.BorderLayout.CENTER);

        lblDescribe.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        lblDescribe.setForeground(new java.awt.Color(32, 101, 95));
        lblDescribe.setText("Enter your username");
        lblDescribe.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 1, 2, 1));
        jPanel35.add(lblDescribe, java.awt.BorderLayout.PAGE_START);

        jPanel36.setOpaque(false);

        btnLogin.setBackground(new java.awt.Color(255, 146, 52));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(16, 51, 48));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogin1MouseClicked(evt);
            }
        });

        btnSend.setBackground(new java.awt.Color(255, 146, 52));
        btnSend.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnSend.setForeground(new java.awt.Color(16, 51, 48));
        btnSend.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSend.setText("Send");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.setOpaque(true);
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblMessage.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(51, 51, 51));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("Enter your username to resset password");
        lblMessage.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));

        lblMessage1.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblMessage1.setForeground(new java.awt.Color(51, 51, 51));
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("We will send code to your email");
        lblMessage1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));

        javax.swing.GroupLayout ContainerLogInForm12Layout = new javax.swing.GroupLayout(ContainerLogInForm12);
        ContainerLogInForm12.setLayout(ContainerLogInForm12Layout);
        ContainerLogInForm12Layout.setHorizontalGroup(
            ContainerLogInForm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLogInForm12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLogInForm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLogInForm12Layout.setVerticalGroup(
            ContainerLogInForm12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLogInForm12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ContainerLogInForm12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel37Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ContainerLogInForm12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jpnCardContainer.add(jPanel37, "card2");

        ContainerLogInForm13.setBackground(new java.awt.Color(254, 254, 213));
        ContainerLogInForm13.setForeground(new java.awt.Color(102, 255, 102));

        lblTitle1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitle1.setForeground(new java.awt.Color(32, 101, 95));
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Reset Password");

        jpnInputVerificationCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        jpnInputVerificationCode.setOpaque(false);
        jpnInputVerificationCode.setLayout(new java.awt.BorderLayout(10, 0));

        txtCodeInput.setBackground(new java.awt.Color(250, 197, 91));
        txtCodeInput.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtCodeInput.setForeground(new java.awt.Color(32, 101, 95));
        txtCodeInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodeInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtCodeInput.setMargin(new java.awt.Insets(2, 20, 2, 20));
        txtCodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeInputtxtUsername1ActionPerformed(evt);
            }
        });
        jpnInputVerificationCode.add(txtCodeInput, java.awt.BorderLayout.CENTER);

        lblTitleInput.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        lblTitleInput.setForeground(new java.awt.Color(32, 101, 95));
        lblTitleInput.setText("Enter your code");
        lblTitleInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 1, 2, 1));
        jpnInputVerificationCode.add(lblTitleInput, java.awt.BorderLayout.PAGE_START);

        btnCheckVerificationCode.setBackground(new java.awt.Color(255, 146, 52));
        btnCheckVerificationCode.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCheckVerificationCode.setForeground(new java.awt.Color(16, 51, 48));
        btnCheckVerificationCode.setText("Check");
        btnCheckVerificationCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        btnCheckVerificationCode.setOpaque(true);
        btnCheckVerificationCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckVerificationCodeMouseClicked(evt);
            }
        });
        jpnInputVerificationCode.add(btnCheckVerificationCode, java.awt.BorderLayout.LINE_END);

        jPanel39.setOpaque(false);

        btnCancel1.setBackground(new java.awt.Color(255, 146, 52));
        btnCancel1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnCancel1.setForeground(new java.awt.Color(16, 51, 48));
        btnCancel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel1.setText("Cancel");
        btnCancel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel1.setOpaque(true);
        btnCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancel1btnLogin1MouseClicked(evt);
            }
        });

        btnChange.setBackground(new java.awt.Color(255, 146, 52));
        btnChange.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnChange.setForeground(new java.awt.Color(16, 51, 48));
        btnChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnChange.setText("Change");
        btnChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChange.setOpaque(true);
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel40.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        jPanel40.setEnabled(false);
        jPanel40.setOpaque(false);
        jPanel40.setLayout(new java.awt.BorderLayout(10, 0));

        lblNewPass.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        lblNewPass.setForeground(new java.awt.Color(32, 101, 95));
        lblNewPass.setText("New password");
        lblNewPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 1, 2, 1));
        lblNewPass.setEnabled(false);
        jPanel40.add(lblNewPass, java.awt.BorderLayout.PAGE_START);

        txtNewPass.setBackground(new java.awt.Color(250, 197, 91));
        txtNewPass.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtNewPass.setForeground(new java.awt.Color(32, 101, 95));
        txtNewPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtNewPass.setEnabled(false);
        jPanel40.add(txtNewPass, java.awt.BorderLayout.CENTER);

        btnShowNewpass.setBackground(new java.awt.Color(255, 146, 52));
        btnShowNewpass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnShowNewpass.setForeground(new java.awt.Color(16, 51, 48));
        btnShowNewpass.setText("Show/Hide");
        btnShowNewpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        btnShowNewpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowNewpass.setOpaque(true);
        jPanel40.add(btnShowNewpass, java.awt.BorderLayout.LINE_END);

        jPanel41.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        jPanel41.setEnabled(false);
        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout(10, 0));

        lblTiel.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        lblTiel.setForeground(new java.awt.Color(32, 101, 95));
        lblTiel.setText("Confirm password");
        lblTiel.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 1, 2, 1));
        lblTiel.setEnabled(false);
        jPanel41.add(lblTiel, java.awt.BorderLayout.PAGE_START);

        txtConfirmPass.setBackground(new java.awt.Color(250, 197, 91));
        txtConfirmPass.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtConfirmPass.setForeground(new java.awt.Color(32, 101, 95));
        txtConfirmPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtConfirmPass.setEnabled(false);
        txtConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassActionPerformed(evt);
            }
        });
        jPanel41.add(txtConfirmPass, java.awt.BorderLayout.CENTER);

        btnShowConfirmPass.setBackground(new java.awt.Color(255, 146, 52));
        btnShowConfirmPass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnShowConfirmPass.setForeground(new java.awt.Color(16, 51, 48));
        btnShowConfirmPass.setText("Show/Hide");
        btnShowConfirmPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        btnShowConfirmPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowConfirmPass.setOpaque(true);
        jPanel41.add(btnShowConfirmPass, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout ContainerLogInForm13Layout = new javax.swing.GroupLayout(ContainerLogInForm13);
        ContainerLogInForm13.setLayout(ContainerLogInForm13Layout);
        ContainerLogInForm13Layout.setHorizontalGroup(
            ContainerLogInForm13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLogInForm13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLogInForm13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnInputVerificationCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLogInForm13Layout.setVerticalGroup(
            ContainerLogInForm13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLogInForm13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnInputVerificationCode, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnEnterCodeLayout = new javax.swing.GroupLayout(jpnEnterCode);
        jpnEnterCode.setLayout(jpnEnterCodeLayout);
        jpnEnterCodeLayout.setHorizontalGroup(
            jpnEnterCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
            .addGroup(jpnEnterCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnEnterCodeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ContainerLogInForm13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnEnterCodeLayout.setVerticalGroup(
            jpnEnterCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(jpnEnterCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnEnterCodeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ContainerLogInForm13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jpnCardContainer.add(jpnEnterCode, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnCardContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnCardContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        try {
           
            String username = txtInput.getText();

            username_static = username;
            UsersDao ud = new UsersDao();
            String email = ud.getEmailByUsername(username);

            if ((email == null) || (email.isBlank())) {
                MessageDialogHelper.showErrorDialog(this, "Can't found email with this username", null);
                return;
            }

            String hideEmail = email.substring(0, 3) + "***" + email.substring(email.indexOf("@"), email.length());

            // Init object send email
            MailSender mailSender = new MailSender("thinhnq3009@gmail.com", "ysxxfxfqvlkjroya");

            // Init object ValidateCode to create, compare, ...
            VerificationCodeDao codeDao = new VerificationCodeDao();

            //Step 1: CREATE code and save code in DB:
            String code = codeDao.createCode(username);

            //Step 3: SEND code to user 
            String subject = "[Reset Password: " + code + "] - Students Management App";

            ReadTemplate rt = new ReadTemplate(username, code);
            rt.setContent(new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\asm\\app\\template\\templateMail.html"));
            String content = rt.getContent();

            mailSender.send(email, subject, content);

            String note = "Code has been sent to " + hideEmail + ". Please check your email !!!";

            JOptionPane.showMessageDialog(this, note);

            // Show enter Verification Code
            showChangePassContainer();
        } catch (Exception ex) {
            ex.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
        }

    }//GEN-LAST:event_btnSendMouseClicked

    private void btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnLogin1MouseClicked

    private void txtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername1ActionPerformed
    }//GEN-LAST:event_txtUsername1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        btnLogin1MouseClicked(null);
    }//GEN-LAST:event_formWindowClosed

    private void txtCodeInputtxtUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeInputtxtUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeInputtxtUsername1ActionPerformed

    private void btnCancel1btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancel1btnLogin1MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCancel1btnLogin1MouseClicked

    private void btnChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseClicked
        UsersDao dao = new UsersDao();

        String newPassword = String.valueOf(txtNewPass.getPassword());
        String confirmPass = String.valueOf(txtConfirmPass.getPassword());

        if (newPassword.equals(confirmPass)) {
            if (newPassword.length() >= 6) {
                try {
                    boolean result = dao.changePassword(username_static, newPassword);

                    if (result) {
                        MessageDialogHelper.showMessageDialog(this, "Password changed ! ! !", null);
                        this.dispose();
                    } else {
                        MessageDialogHelper.showErrorDialog(this, "Password no changed ! ! !", null);
                        this.dispose();
                    }

                } catch (Exception e) {
                    MessageDialogHelper.showErrorDialog(this, e.getMessage(), null);
                }

            }
        } else {
            btnChange.setEnabled(false);
        }


    }//GEN-LAST:event_btnChangeMouseClicked

    private void btnCheckVerificationCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckVerificationCodeMouseClicked
        String code = txtCodeInput.getText();

        if (code.isEmpty()) {
            MessageDialogHelper.showErrorDialog(this, "Please enter code !!!", null);
            return;
        } else {

            try {

                boolean result = false;

                if (this.getParent() instanceof MainForm) {
                    UsersDao dao = new UsersDao();
                    try {
                        User user = dao.login(username_static, code, new StringBuilder());

                        result = user != null;

                        if (!result) {
                            MessageDialogHelper.showErrorDialog(this, "Password is incorect", null);
                        } else {
                            MessageDialogHelper.showMessageDialog(this, "Password is corect", null);
                        }

                    } catch (Exception ex) {
                        MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
                        ex.printStackTrace();
                    }
                } else {
                    VerificationCodeDao dao = new VerificationCodeDao();

                    result = dao.compareCode(username_static, code);

                    if (!result) {
                        MessageDialogHelper.showErrorDialog(this, "Verification code is incorect", null);
                    } else {
                        MessageDialogHelper.showMessageDialog(this, "Verification code is corect", null);
                    }

                }

                setEnabledInputPass(result);
            } catch (Exception ex) {
                MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
            }
        }

    }//GEN-LAST:event_btnCheckVerificationCodeMouseClicked

    private void txtConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResetPassworDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassworDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassworDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassworDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResetPassworDialog dialog = new ResetPassworDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerLogInForm12;
    private javax.swing.JPanel ContainerLogInForm13;
    private javax.swing.JLabel btnCancel1;
    private javax.swing.JLabel btnChange;
    protected javax.swing.JLabel btnCheckVerificationCode;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnSend;
    private javax.swing.JLabel btnShowConfirmPass;
    private javax.swing.JLabel btnShowNewpass;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jpnCardContainer;
    private javax.swing.JPanel jpnEnterCode;
    public javax.swing.JPanel jpnInputVerificationCode;
    private javax.swing.JLabel lblDescribe;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblTiel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    protected javax.swing.JLabel lblTitleInput;
    protected javax.swing.JTextField txtCodeInput;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtInput;
    private javax.swing.JPasswordField txtNewPass;
    // End of variables declaration//GEN-END:variables
}