/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.inventorysystemui.adminforms;

import com.mycompany.inventorysystemui.userforms.LoginForm;
import com.mycompany.inventorysystemui.querymethods.QueryMethodHandler;
import com.mycompany.inventorysystemui.adminforms.AdminProductsForm;
import com.mycompany.inventorysystemui.adminforms.AdminFormFront;
import com.mycompany.inventorysystemui.adminforms.AdminAccountsForm;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
//import java.sql.PreparedStatement;
//import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Danica
 */
public class RegisterFormAdmin extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterFormAdmin() {
        initComponents();
//        Connection con;
//        PreparedStatement pst;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegister1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtRegisterPass = new javax.swing.JPasswordField();
        txtConfirmPass = new javax.swing.JPasswordField();
        showPass = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        lblBoxIcon = new javax.swing.JLabel();
        lblInventory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegister2 = new javax.swing.JButton();
        grayPnl = new javax.swing.JPanel();
        reportTxT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuItem = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        btnRegister1.setForeground(new java.awt.Color(51, 51, 255));
        btnRegister1.setText("Register");
        btnRegister1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnRegister1.setContentAreaFilled(false);
        btnRegister1.setDefaultCapable(false);
        btnRegister1.setFocusPainted(false);
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        txtFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFirstNameFocusLost(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastNameFocusLost(evt);
            }
        });
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtRegisterPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRegisterPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRegisterPassFocusLost(evt);
            }
        });
        txtRegisterPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterPassActionPerformed(evt);
            }
        });

        txtConfirmPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmPassFocusLost(evt);
            }
        });
        txtConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassActionPerformed(evt);
            }
        });

        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 153, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(242, 242, 242));
        btnSignUp.setText("SIGN UP");
        btnSignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSignUpFocusGained(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblBoxIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danica\\Documents\\NetBeansProjects\\JTableInventory_UI\\src\\main\\java\\iconImages\\inventory_categories.png")); // NOI18N

        lblInventory.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblInventory.setForeground(new java.awt.Color(0, 153, 255));
        lblInventory.setText("REGISTER");

        jLabel2.setText("Already have an account?");

        btnRegister2.setForeground(new java.awt.Color(51, 51, 255));
        btnRegister2.setText("Login");
        btnRegister2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        btnRegister2.setContentAreaFilled(false);
        btnRegister2.setDefaultCapable(false);
        btnRegister2.setFocusPainted(false);
        btnRegister2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister2ActionPerformed(evt);
            }
        });

        grayPnl.setBackground(new java.awt.Color(0, 153, 255));
        grayPnl.setBorder(new javax.swing.border.MatteBorder(null));

        reportTxT.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        reportTxT.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danica\\Documents\\NetBeansProjects\\JTableInventory_UI\\src\\main\\java\\iconImages\\inventoryDesignIcon.jpg")); // NOI18N

        javax.swing.GroupLayout grayPnlLayout = new javax.swing.GroupLayout(grayPnl);
        grayPnl.setLayout(grayPnlLayout);
        grayPnlLayout.setHorizontalGroup(
            grayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grayPnlLayout.createSequentialGroup()
                .addGroup(grayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(grayPnlLayout.createSequentialGroup()
                        .addGap(1041, 1041, 1041)
                        .addComponent(reportTxT))
                    .addGroup(grayPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        grayPnlLayout.setVerticalGroup(
            grayPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, grayPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(reportTxT)
                .addContainerGap())
        );

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Mel\\backIcon.jpg")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setDefaultCapable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Firstname");

        jLabel14.setText("Lastname");

        jLabel15.setText("Email");

        jLabel16.setText("Username");

        jLabel17.setText("Password");

        jLabel12.setText("Confirm Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBoxIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(showPass, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRegister2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegisterPass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel15)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(77, 77, 77)))
                .addComponent(grayPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBoxIcon)
                    .addComponent(lblInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRegisterPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnRegister2))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(grayPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuItem.setIcon(new javax.swing.ImageIcon("C:\\Mel\\menuIcon.jpg")); // NOI18N
        menuItem.setText("Menu");

        jMenuItem6.setText("Home");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuItem.add(jMenuItem6);

        jMenu8.setText("Database Management");

        jMenuItem4.setText("Accounts");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuItem5.setText("Products Inventory");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        menuItem.add(jMenu8);

        jMenuBar2.add(menuItem);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed

        //
        //                if(username.equals("name@adressemail.com")&&password.equals("password123")&&confirmpass.equals("password123")){
            //                    reportTxT.setText("Fields must not be empty.");
            //                }
        //                else if(username.equals("name@adressemail.com")){
            //                    reportTxT.setText("Username is empty.");
            //                }
        //                else if(password.equals("password123")&&confirmpass.equals("password123")){
            //                    reportTxT.setText("Please enter a password.");
            //                }
        //                else if(password.equals("password123")){
            //                    reportTxT.setText("Please enter a password");
            //                }
        //                else if(confirmpass.equals("password123")){
            //                    reportTxT.setText("Please re-enter password");
            //                }
        //                else if(!confirmpass.equals( password)){
            //                    reportTxT.setText("Password does not match.");
            //                }
        //
        //                else {
            //                     boolean isExist = QueryMethodHandler.registerUser(username,password);
            //                     if(isExist){
                //                        reportTxT.setText("Username already exist");
                //                     }
            //                     else{
                //                        reportTxT.setText("");
                //                        JOptionPane.showMessageDialog(bluePnl, "Account created Successfully.");
                //                        QueryMethodHandler.registerUser(username,password);
                //                        setVisible(false);
                //                        new ForCountdown().setVisible(true);
                //                     }
            //
            //                }
        //
        String firstname = txtFirstName.getText();
        String lastname = txtLastName.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String password = String.valueOf(txtRegisterPass.getPassword());
        String confirmpass = String.valueOf(txtConfirmPass.getPassword());
        String role = "admin";
        // String password = String.valueOf(txtRegisterPass.getPassword());
        if(firstname.equals("")&&lastname.equals("")&&email.equals("")&&username.equals("")&&password.equals("")&&confirmpass.equals("")){
            JOptionPane.showMessageDialog(this,"All data required");
     //   else if(username.equals("name@adressemail.com")&&password.equals("password123")&&confirmpass.equals("password123")){
            //                    reportTxT.setText("Fields must not be empty.");
            //                }
        }else if(username.equals("admin")) {
            JOptionPane.showMessageDialog(this,"Username Exist Already!");
        
        }else if(firstname.equals("firstname")&&lastname.equals("lastname")&&email.equals("name@gmail.com")&&username.equals("name@adressemail.com")&&password.equals("password123")&&confirmpass.equals("password123")){
            JOptionPane.showMessageDialog(this,"All data required");
        }
        else{

            boolean isExist = QueryMethodHandler.newRegisterUser(firstname,lastname,email,username,password, role);
            if(isExist){
                JOptionPane.showMessageDialog(jPanel1, "Username Exists Already");
            }
            else {
                QueryMethodHandler.newRegisterUser(firstname,lastname,email,username,password, role);

                JOptionPane.showMessageDialog(this, "Add data successfully!");
                new AdminAccountsForm().setVisible(true);
                //            txtFirstName.setText("");
                //            txtLastName.setText("");
                //            txtEmail.setText("");
                //            txtUsername.setText("");
                //            txtRegisterPass.setText("");
                //            txtConfirmPass.setText("");
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSignUpFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpFocusGained

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        // TODO add your handling code here:
        if(showPass.isSelected()){
            txtRegisterPass.setEchoChar((char)0);
            txtConfirmPass.setEchoChar((char)0);
            reportTxT.setText("");
        }
        else{
            txtRegisterPass.setEchoChar('\u2022');
            txtConfirmPass.setEchoChar('\u2022');

        }
    }//GEN-LAST:event_showPassActionPerformed

    private void txtConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassActionPerformed

    private void txtConfirmPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPassFocusLost

       
    }//GEN-LAST:event_txtConfirmPassFocusLost

    private void txtConfirmPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmPassFocusGained

       
    }//GEN-LAST:event_txtConfirmPassFocusGained

    private void txtRegisterPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterPassActionPerformed

    private void txtRegisterPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegisterPassFocusLost

       
    }//GEN-LAST:event_txtRegisterPassFocusLost

    private void txtRegisterPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRegisterPassFocusGained

       
    }//GEN-LAST:event_txtRegisterPassFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost

        
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained

        
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtLastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusLost
                
    }//GEN-LAST:event_txtLastNameFocusLost

    private void txtLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastNameFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtLastNameFocusGained

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusLost
       
      
    }//GEN-LAST:event_txtFirstNameFocusLost

    private void txtFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFirstNameFocusGained
        
    }//GEN-LAST:event_txtFirstNameFocusGained

    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        //To go
        RegisterFormAdmin toRegister = new RegisterFormAdmin();
        toRegister.setVisible(true);
        toRegister.setLocationRelativeTo(null);
        setVisible(false);

    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void btnRegister2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister2ActionPerformed
        // TODO add your handling code here:
        //To go
        new LoginForm().setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btnRegister2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AdminAccountsForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new AdminFormFront().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        new AdminAccountsForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new AdminProductsForm().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister1;
    private javax.swing.JButton btnRegister2;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel grayPnl;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoxIcon;
    private javax.swing.JLabel lblInventory;
    private javax.swing.JMenu menuItem;
    private javax.swing.JLabel reportTxT;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtRegisterPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

//    private void addUserToDatabase(String usernameNew, String passwordNew) {
//      RegisterForm myForm = new RegisterForm();// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    
}

