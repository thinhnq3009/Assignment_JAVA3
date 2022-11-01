/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.asm.app.ui;

import com.asm.app.helpers.StyleHelper;
import com.asm.app.dao.UsersDao;
import com.asm.app.helpers.DataValidator;
import com.asm.app.helpers.MessageDialogHelper;
import com.asm.app.helpers.PasswordHelper;
import com.asm.app.helpers.ShareData;
import com.asm.app.model.User;

/**
 *
 * @author Lenovo
 */
public class LoginDialog extends javax.swing.JDialog {

    /**
     * Creates new form LoginDialog
     */
    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        StyleHelper.createButton(btnLogin, btnCancel);
        StyleHelper.createLink(linklForgotPass);
        PasswordHelper.showPassword(txtPassword, btnShowPass);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginFrom = new javax.swing.JPanel();
        ContainerLogInForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        btnShowPass = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JLabel();
        btnCancel = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        linklForgotPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(412, 355));
        setMinimumSize(new java.awt.Dimension(412, 355));

        LoginFrom.setBackground(new java.awt.Color(255, 243, 154));

        ContainerLogInForm.setBackground(new java.awt.Color(254, 254, 213));
        ContainerLogInForm.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 101, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout(10, 0));

        txtUsername.setBackground(new java.awt.Color(250, 197, 91));
        txtUsername.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(32, 101, 95));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtUsername.setMargin(new java.awt.Insets(2, 20, 2, 20));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsername, java.awt.BorderLayout.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_male_user_35px.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel3.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jLabel54.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(32, 101, 95));
        jLabel54.setText("Username");
        jLabel54.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 60, 2, 1));
        jPanel3.add(jLabel54, java.awt.BorderLayout.PAGE_START);

        jPanel4.setMinimumSize(new java.awt.Dimension(131, 63));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(131, 63));
        jPanel4.setLayout(new java.awt.BorderLayout(10, 0));

        txtPassword.setBackground(new java.awt.Color(250, 197, 91));
        txtPassword.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(32, 101, 95));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        txtPassword.setMargin(new java.awt.Insets(2, 6, 2, 10));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(txtPassword, java.awt.BorderLayout.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_password_key_35px.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        jPanel4.add(jLabel5, java.awt.BorderLayout.LINE_START);

        jLabel55.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(32, 101, 95));
        jLabel55.setText("Password");
        jLabel55.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 60, 2, 1));
        jPanel4.add(jLabel55, java.awt.BorderLayout.PAGE_START);

        btnShowPass.setBackground(new java.awt.Color(255, 146, 52));
        btnShowPass.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnShowPass.setForeground(new java.awt.Color(16, 51, 48));
        btnShowPass.setText("Show/Hide");
        btnShowPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        btnShowPass.setOpaque(true);
        btnShowPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnShowPassKeyPressed(evt);
            }
        });
        jPanel4.add(btnShowPass, java.awt.BorderLayout.LINE_END);

        jPanel2.setOpaque(false);

        btnLogin.setBackground(new java.awt.Color(255, 146, 52));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(16, 51, 48));
        btnLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogin.setText("Login");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setOpaque(true);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 146, 52));
        btnCancel.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(16, 51, 48));
        btnCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancel.setText("Exit");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setOpaque(true);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        linklForgotPass.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        linklForgotPass.setForeground(new java.awt.Color(32, 101, 95));
        linklForgotPass.setText("Forgot your password ?");
        linklForgotPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 15));
        linklForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linklForgotPassMouseClicked(evt);
            }
        });
        jPanel41.add(linklForgotPass);

        javax.swing.GroupLayout ContainerLogInFormLayout = new javax.swing.GroupLayout(ContainerLogInForm);
        ContainerLogInForm.setLayout(ContainerLogInFormLayout);
        ContainerLogInFormLayout.setHorizontalGroup(
            ContainerLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLogInFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainerLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ContainerLogInFormLayout.setVerticalGroup(
            ContainerLogInFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLogInFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginFromLayout = new javax.swing.GroupLayout(LoginFrom);
        LoginFrom.setLayout(LoginFromLayout);
        LoginFromLayout.setHorizontalGroup(
            LoginFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFromLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerLogInForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginFromLayout.setVerticalGroup(
            LoginFromLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginFromLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContainerLogInForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        btnLoginMouseClicked(null);
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        StringBuilder stringBuilder = new StringBuilder();
        
        DataValidator.valiDateEmpty(txtUsername, stringBuilder, "Username can't empty", txtUsername.getBackground());
        DataValidator.valiDateEmpty(txtPassword, stringBuilder, "Password can't empty", txtPassword.getBackground());
        
        if (stringBuilder.isEmpty()) {
            UsersDao dao = new UsersDao();
            
            try {
                User userLogin = dao.login(txtUsername.getText(), txtPassword.getPassword(), stringBuilder);
                
                if (userLogin == null) {
                    MessageDialogHelper.showErrorDialog(this, stringBuilder.toString(), "Error Login !!!");
                } else {
                    System.out.println(userLogin.toString());
                    ShareData.userLogin = userLogin;
                    this.dispose();
                    // Login successfully
                }
                
            } catch (Exception ex) {
                ex.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, ex.getMessage(), "Error Login !!!");
            }
        } else {
            MessageDialogHelper.showErrorDialog(this, stringBuilder.toString(), "Error");
        }

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
        btnLoginMouseClicked(null);
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void linklForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linklForgotPassMouseClicked
        ResetPassworDialog dialog = new ResetPassworDialog(null, true);
        this.setVisible(false);
        dialog.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_linklForgotPassMouseClicked

    private void btnShowPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnShowPassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowPassKeyPressed

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
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDialog dialog = new LoginDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel ContainerLogInForm;
    private javax.swing.JPanel LoginFrom;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JLabel linklForgotPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}