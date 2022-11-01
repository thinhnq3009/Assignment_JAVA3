/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.asm.app.ui;

import com.asm.app.helpers.StyleHelper;
import com.asm.app.dao.StudentDao;
import com.asm.app.dao.UsersDao;
import com.asm.app.helpers.Converter;
import com.asm.app.helpers.DataValidator;
import com.asm.app.helpers.ImageHelper;
import com.asm.app.helpers.MessageDialogHelper;
import com.asm.app.model.Students;
import com.asm.app.model.User;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class StudentInfor extends javax.swing.JPanel {

    static ArrayList<Students> list = new ArrayList<>();

    /**
     * Creates new form StudentInfor
     */
    public MainForm parentForm;
    private byte[] studentImage;
    private static int currentIndex;

    public StudentInfor() {
        initComponents();
        StyleHelper.createButton(btnAutoFillEmail,
                btnFind,
                btnNew,
                btnDelete,
                btnUpdate,
                btnSave,
                btnChangeImage,
                btnFirst,
                btnPrev,
                btnNext,
                btnLast);
        fillTable();
        StyleHelper.designTable(tblStudentInfor);
    }

    private void fillTable() {
        try {
            StudentDao sd = new StudentDao();
            list = sd.getStudents();

            DefaultTableModel dtm = (DefaultTableModel) tblStudentInfor.getModel();

            dtm.setRowCount(0);

            for (Students std : list) {
                dtm.addRow(new Object[]{
                    std.getID(),
                    std.getFullname(),
                    std.getStringGender(),
                    std.getEmail(),
                    std.getPhoneNumber(),
                    std.getAddress()
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Students readForm() {
        String ID = txtID.getText();
        String fullname = txtFullname.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        int gender = rdbMale.isSelected() ? 1 : 0;
        String address = txtAddress.getText();

        ImageIcon imageIcon = (ImageIcon) lblImageContainer.getIcon();

        byte[] avata;

        try {
            avata = ImageHelper.toBytes(imageIcon.getImage(), "png");
        } catch (IOException e) {
            avata = null;
        }
        return new Students(ID, fullname, email, phoneNumber, gender, address, avata);
    }

    private void showStudent(Students student) {
        txtID.setText(student.getID());
        txtFullname.setText(student.getFullname());
        txtEmail.setText(student.getEmail());
        txtPhoneNumber.setText(student.getPhoneNumber());
        txtAddress.setText(student.getAddress());

        if (student.getGender() == 1) {
            rdbMale.setSelected(true);
        } else {
            rdbFemale.setSelected(true);
        }

        if (student.getAvata() != null) {
            try {
                ImageIcon icon = new ImageIcon(ImageHelper.createImageFromBytes(student.getAvata(), "jpg"));
                lblImageContainer.setIcon(icon);
            } catch (IOException ex) {
                ex.printStackTrace();
                MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
            }
        } else {
            if (student.getGender() == 1) {
                lblImageContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_man_student_200px.png")));
            } else {
                lblImageContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_person_student_200px.png")));
            }
        }

    }

    private boolean validate(StringBuilder sb) {
        DataValidator.valiDateEmpty(txtID, sb, "Student's ID can't empty");
        DataValidator.valiDateEmpty(txtFullname, sb, "Student's Fullname can't empty");
        DataValidator.valiDateEmpty(txtEmail, sb, "Student's Email can't empty");
        DataValidator.valiDateEmpty(txtPhoneNumber, sb, "Student's Phone number can't empty");
        DataValidator.valiDateEmpty(txtAddress, sb, "Student's Address can't empty");
        return sb.isEmpty();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngGender = new javax.swing.ButtonGroup();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnChangeImage = new javax.swing.JLabel();
        lblImageContainer = new javax.swing.JLabel();
        jpnContainerInput = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAutoFillEmail = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        btnNew = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentInfor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JLabel();
        btnPrev = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        btnLast = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 243, 154));

        jPanel14.setBackground(new java.awt.Color(254, 254, 213));
        jPanel14.setForeground(new java.awt.Color(254, 254, 213));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(32, 101, 95));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Students's Information");

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout(10, 0));

        txtFind.setBackground(new java.awt.Color(247, 247, 176));
        txtFind.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtFind.setForeground(new java.awt.Color(32, 101, 95));
        txtFind.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel15.add(txtFind, java.awt.BorderLayout.CENTER);

        btnFind.setBackground(new java.awt.Color(255, 146, 52));
        btnFind.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        btnFind.setForeground(new java.awt.Color(16, 51, 48));
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_find_and_replace_30px.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 20, 1, 20));
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind.setOpaque(true);
        btnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindMouseClicked(evt);
            }
        });
        btnFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFindKeyPressed(evt);
            }
        });
        jPanel15.add(btnFind, java.awt.BorderLayout.LINE_END);

        jPanel16.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 189));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnChangeImage.setBackground(new java.awt.Color(245, 245, 154));
        btnChangeImage.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnChangeImage.setForeground(new java.awt.Color(32, 101, 95));
        btnChangeImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnChangeImage.setText("Change Image");
        btnChangeImage.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        btnChangeImage.setOpaque(true);
        btnChangeImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeImageMouseClicked(evt);
            }
        });

        lblImageContainer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImageContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_person_student_200px.png"))); // NOI18N
        lblImageContainer.setMaximumSize(new java.awt.Dimension(206, 223));
        lblImageContainer.setMinimumSize(new java.awt.Dimension(206, 223));
        lblImageContainer.setPreferredSize(new java.awt.Dimension(206, 223));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnChangeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImageContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChangeImage))
        );

        jpnContainerInput.setBackground(new java.awt.Color(247, 247, 176));
        jpnContainerInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 7, 7, 7));
        jpnContainerInput.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(32, 101, 95));
        jLabel25.setText("ID:");
        jLabel25.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jLabel25.setMaximumSize(new java.awt.Dimension(116, 19));
        jLabel25.setMinimumSize(new java.awt.Dimension(116, 19));
        jLabel25.setPreferredSize(new java.awt.Dimension(116, 19));
        jPanel18.add(jLabel25, java.awt.BorderLayout.LINE_START);

        txtID.setBackground(new java.awt.Color(254, 254, 213));
        txtID.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        txtID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel18.add(txtID, java.awt.BorderLayout.CENTER);

        jpnContainerInput.add(jPanel18);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(32, 101, 95));
        jLabel26.setText("Fullname:");
        jLabel26.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jLabel26.setMaximumSize(new java.awt.Dimension(116, 19));
        jLabel26.setMinimumSize(new java.awt.Dimension(116, 19));
        jLabel26.setPreferredSize(new java.awt.Dimension(116, 19));
        jPanel19.add(jLabel26, java.awt.BorderLayout.LINE_START);

        txtFullname.setBackground(new java.awt.Color(254, 254, 213));
        txtFullname.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        txtFullname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel19.add(txtFullname, java.awt.BorderLayout.CENTER);

        jpnContainerInput.add(jPanel19);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel27.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(32, 101, 95));
        jLabel27.setText("Gender:");
        jLabel27.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jLabel27.setMaximumSize(new java.awt.Dimension(116, 19));
        jLabel27.setMinimumSize(new java.awt.Dimension(116, 19));
        jLabel27.setPreferredSize(new java.awt.Dimension(116, 19));
        jPanel20.add(jLabel27, java.awt.BorderLayout.LINE_START);

        jPanel26.setOpaque(false);
        jPanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING, 30, 5));

        btngGender.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rdbMale.setForeground(new java.awt.Color(32, 101, 95));
        rdbMale.setText("Male");
        rdbMale.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 1, 1));
        jPanel26.add(rdbMale);

        btngGender.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        rdbFemale.setForeground(new java.awt.Color(32, 101, 95));
        rdbFemale.setText("Female");
        rdbFemale.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 1, 1));
        jPanel26.add(rdbFemale);

        jPanel20.add(jPanel26, java.awt.BorderLayout.CENTER);

        jpnContainerInput.add(jPanel20);

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(32, 101, 95));
        jLabel28.setText("Email:");
        jLabel28.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jLabel28.setMaximumSize(new java.awt.Dimension(116, 19));
        jLabel28.setMinimumSize(new java.awt.Dimension(116, 19));
        jLabel28.setPreferredSize(new java.awt.Dimension(116, 19));
        jPanel23.add(jLabel28, java.awt.BorderLayout.LINE_START);

        txtEmail.setBackground(new java.awt.Color(254, 254, 213));
        txtEmail.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel23.add(txtEmail, java.awt.BorderLayout.CENTER);

        btnAutoFillEmail.setBackground(new java.awt.Color(255, 146, 52));
        btnAutoFillEmail.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnAutoFillEmail.setForeground(new java.awt.Color(16, 51, 48));
        btnAutoFillEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_reply_20px.png"))); // NOI18N
        btnAutoFillEmail.setText("Auto fill");
        btnAutoFillEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        btnAutoFillEmail.setOpaque(true);
        btnAutoFillEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAutoFillEmailMouseClicked(evt);
            }
        });
        jPanel23.add(btnAutoFillEmail, java.awt.BorderLayout.LINE_END);

        jpnContainerInput.add(jPanel23);

        jPanel24.setOpaque(false);
        jPanel24.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(32, 101, 95));
        jLabel29.setText("Phone number:");
        jLabel29.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jPanel24.add(jLabel29, java.awt.BorderLayout.LINE_START);

        txtPhoneNumber.setBackground(new java.awt.Color(254, 254, 213));
        txtPhoneNumber.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel24.add(txtPhoneNumber, java.awt.BorderLayout.CENTER);

        jpnContainerInput.add(jPanel24);

        jPanel25.setOpaque(false);
        jPanel25.setLayout(new java.awt.BorderLayout(15, 0));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(32, 101, 95));
        jLabel30.setText("Address:");
        jLabel30.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        jLabel30.setMaximumSize(new java.awt.Dimension(116, 19));
        jLabel30.setMinimumSize(new java.awt.Dimension(116, 19));
        jLabel30.setPreferredSize(new java.awt.Dimension(116, 19));
        jPanel25.add(jLabel30, java.awt.BorderLayout.LINE_START);

        txtAddress.setBackground(new java.awt.Color(254, 254, 213));
        txtAddress.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAddressMouseEntered(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });
        jPanel25.add(txtAddress, java.awt.BorderLayout.CENTER);

        jpnContainerInput.add(jPanel25);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnContainerInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnContainerInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.GridLayout(4, 1, 20, 20));

        btnNew.setBackground(new java.awt.Color(255, 146, 52));
        btnNew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(16, 51, 48));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_add_new_30px.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setOpaque(true);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });
        jPanel21.add(btnNew);

        btnSave.setBackground(new java.awt.Color(255, 146, 52));
        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(16, 51, 48));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_save_30px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        jPanel21.add(btnSave);

        btnDelete.setBackground(new java.awt.Color(255, 146, 52));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(16, 51, 48));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_remove_30px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setOpaque(true);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel21.add(btnDelete);

        btnUpdate.setBackground(new java.awt.Color(255, 146, 52));
        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(16, 51, 48));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_upgrade_30px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 25, 5, 25));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setOpaque(true);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        jPanel21.add(btnUpdate);

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane2.setBackground(new java.awt.Color(255, 51, 51));

        tblStudentInfor.setBackground(new java.awt.Color(204, 255, 204));
        tblStudentInfor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fullname", "Gender", "Email", "Number phone", "Student ID"
            }
        ));
        tblStudentInfor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentInforMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudentInfor);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        btnFirst.setBackground(new java.awt.Color(255, 146, 52));
        btnFirst.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(16, 51, 48));
        btnFirst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_skip_to_start_30px.png"))); // NOI18N
        btnFirst.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.setOpaque(true);
        btnFirst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFirstMouseClicked(evt);
            }
        });
        jPanel2.add(btnFirst);

        btnPrev.setBackground(new java.awt.Color(255, 146, 52));
        btnPrev.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(16, 51, 48));
        btnPrev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_rewind_30px.png"))); // NOI18N
        btnPrev.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrev.setOpaque(true);
        btnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrevMouseClicked(evt);
            }
        });
        jPanel2.add(btnPrev);

        btnNext.setBackground(new java.awt.Color(255, 146, 52));
        btnNext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(16, 51, 48));
        btnNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_fast_forward_30px.png"))); // NOI18N
        btnNext.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.setOpaque(true);
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        jPanel2.add(btnNext);

        btnLast.setBackground(new java.awt.Color(255, 146, 52));
        btnLast.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLast.setForeground(new java.awt.Color(16, 51, 48));
        btnLast.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_end_30px.png"))); // NOI18N
        btnLast.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.setOpaque(true);
        btnLast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLastMouseClicked(evt);
            }
        });
        jPanel2.add(btnLast);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeImageMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                } else {
                    return f.getName().toLowerCase().endsWith(".jpg") /*|| f.getName().toLowerCase().endsWith(".png")*/;
                }
            }

            @Override
            public String getDescription() {
                return "Image File (.png, .png)";
            }
        });

        if (fileChooser.showOpenDialog(parentForm) == JOptionPane.CANCEL_OPTION) {
            return;
        }
        File file = fileChooser.getSelectedFile();

        try {
            //Get Image form file and show it to lable
            ImageIcon icon = new ImageIcon(file.getPath());
            Image image = ImageHelper.resize(icon.getImage(), 206, 223);
            ImageIcon resizeIcon = new ImageIcon(image);
            lblImageContainer.setIcon(resizeIcon);

            // Convert image to byte array
            studentImage = ImageHelper.toBytes(image, "jpg");

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, e.getMessage(), "Error !!!");
        }
    }//GEN-LAST:event_btnChangeImageMouseClicked

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        txtFind.setText("");
        txtID.setText("");
        txtFullname.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        studentImage = null;
        lblImageContainer.setIcon(new ImageIcon(getClass().getResource("/com/asm/app/icons/icons8_man_student_200px.png")));
    }//GEN-LAST:event_btnNewMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {

            StringBuilder sb = new StringBuilder();

            if (!validate(sb)) {
                MessageDialogHelper.showErrorDialog(this, sb.toString(), null);
                return;
            }

            String idStudent = txtID.getText();
            String fullname = txtFullname.getText();
            String email = txtEmail.getText();
            String phoneNumber = txtPhoneNumber.getText();
            String address = txtAddress.getText();
            int gender = (rdbMale.isSelected()) ? 1 : 0;
            byte[] studentImage = this.studentImage;

            Students student = new Students(idStudent, fullname, email, phoneNumber, gender, address, studentImage);

            StudentDao sd = new StudentDao();
            UsersDao ud = new UsersDao();
            sd.insert(student);
            ud.createUsers(student);

            MessageDialogHelper.showMessageDialog(this, "Save student Successful", null);

        } catch (Exception ex) {
            ex.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
        } finally {
            fillTable();
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFindKeyPressed

    }//GEN-LAST:event_btnFindKeyPressed

    private void btnFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseClicked
        try {
            String key = txtFind.getText();
            StudentDao dao = new StudentDao();

            list = dao.getStudents(key);

            if (list.isEmpty()) {
                MessageDialogHelper.showErrorDialog(this, "Can't find student with this key", "Warning");
                list = dao.getStudents();
            }

            DefaultTableModel dtm = (DefaultTableModel) tblStudentInfor.getModel();

            dtm.setRowCount(0);

            for (Students std : list) {
                dtm.addRow(new Object[]{
                    std.getID(),
                    std.getFullname(),
                    std.getStringGender(),
                    std.getEmail(),
                    std.getPhoneNumber(),
                    std.getAddress()
                });
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnFindMouseClicked

    private void tblStudentInforMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentInforMouseClicked
        currentIndex = tblStudentInfor.getSelectedRow();
        showStudent(list.get(currentIndex));
    }//GEN-LAST:event_tblStudentInforMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        try {
            Students student = readForm();
            StudentDao sd = new StudentDao();
            boolean value = sd.update(student);
            if (value) {
                MessageDialogHelper.showMessageDialog(this, "Update successful", "Notifacation");
            } else {
                MessageDialogHelper.showErrorDialog(this, "Update unsuccessful", null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            MessageDialogHelper.showErrorDialog(this, ex.getMessage(), null);
        } finally {
            fillTable();
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked

        try {
            Students student = readForm();
            String s = student.getFullname() + " [" + student.getID() + "] ";
            StudentDao dao = new StudentDao();
            int option = MessageDialogHelper.showConfimDialog(this, "Are you sure DELETE " + s + " !", "Warning");
            if (option == JOptionPane.YES_OPTION) {
                boolean value = dao.delete(student);
                if (value) {
                    MessageDialogHelper.showMessageDialog(this, "DELETE " + s + " successful", "Notifacation");
                } else {
                    MessageDialogHelper.showMessageDialog(this, "DELETE " + s + " unsuccessful", "Notifacation");

                }
            }
        } catch (Exception e) {
            MessageDialogHelper.showMessageDialog(this, "Can't DELETE student now. Try again", null);
        } finally {
            fillTable();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        Thread th = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(10);
                    txtAddress.setToolTipText(txtAddress.getText());
                } catch (InterruptedException ex) {
                }
            }

        };
        th.start();
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtAddressMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseEntered
        txtAddressKeyPressed(null);
    }//GEN-LAST:event_txtAddressMouseEntered

    private void btnAutoFillEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAutoFillEmailMouseClicked
        String email = "";
        StringBuilder sb = new StringBuilder();

        DataValidator.valiDateEmpty(txtID, sb, "Please enter ID");
        DataValidator.valiDateEmpty(txtFullname, sb, "Please enter fullnname");

        if (sb.isEmpty()) {
            String id = txtID.getText();
            String fullname = txtFullname.getText();
            String[] parts = fullname.split(" ");
            email += parts[parts.length - 1];

            for (int i = 0; i < (parts.length - 1); i++) {
                String part = parts[i];
                email += part.substring(0, 1);
            }

            email = Converter.removeSign(email + id + "@fpt.edu.vn");

            txtEmail.setText(email.toLowerCase());

        } else {
            MessageDialogHelper.showErrorDialog(this, sb.toString(), null);
        }
    }//GEN-LAST:event_btnAutoFillEmailMouseClicked

    private void btnFirstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseClicked
        currentIndex = 0;
        showStudent(list.get(currentIndex));
    }//GEN-LAST:event_btnFirstMouseClicked

    private void btnPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrevMouseClicked
        currentIndex = (currentIndex == 0) ? list.size() - 1 : currentIndex - 1;
        showStudent(list.get(currentIndex));
    }//GEN-LAST:event_btnPrevMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        currentIndex = (currentIndex == list.size() - 1) ? 0 : currentIndex + 1;
        showStudent(list.get(currentIndex));
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnLastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLastMouseClicked
        currentIndex = list.size() - 1;
        showStudent(list.get(currentIndex));
    }//GEN-LAST:event_btnLastMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAutoFillEmail;
    private javax.swing.JLabel btnChangeImage;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnFind;
    private javax.swing.JLabel btnFirst;
    private javax.swing.JLabel btnLast;
    private javax.swing.JLabel btnNew;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnPrev;
    private javax.swing.JLabel btnSave;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.ButtonGroup btngGender;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnContainerInput;
    private javax.swing.JLabel lblImageContainer;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTable tblStudentInfor;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
