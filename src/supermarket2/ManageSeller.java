package supermarket2;

//import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.awt.HeadlessException;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
//import java.sql.Connection;

public class ManageSeller extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rss = null;
    
    public ManageSeller() {
        initComponents();
        
        selltable.getTableHeader().setOpaque(false);
        selltable.getTableHeader().setBackground(new Color(32,136,203));
        selltable.getTableHeader().setForeground(new Color(255,255,255));
        selltable.setRowHeight(25);
        
        ShowSeller();
    }
    
    public void ShowSeller(){
        rss = admin.viewSeller();
        selltable.setModel(DbUtils.resultSetToTableModel(rss));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellname = new javax.swing.JTextField();
        sellphone = new javax.swing.JTextField();
        sellpass = new javax.swing.JTextField();
        sellid = new javax.swing.JTextField();
        sellgender = new javax.swing.JComboBox<>();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selltable = new javax.swing.JTable();
        deletebtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sellsalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sellworking = new javax.swing.JTextField();
        logoutFromMSeller = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        categorytab = new javax.swing.JLabel();
        addbtn1 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Seller Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Gender");

        sellname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellnameActionPerformed(evt);
            }
        });

        sellphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellphoneActionPerformed(evt);
            }
        });

        sellpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellpassActionPerformed(evt);
            }
        });

        sellid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellidActionPerformed(evt);
            }
        });

        sellgender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        addbtn.setBackground(new java.awt.Color(0, 153, 153));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(0, 153, 153));
        editbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("UPDATE");
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(0, 153, 153));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("CLEAR");
        clearbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearbtnMouseClicked(evt);
            }
        });
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        selltable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        selltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller Id", "Name", "Phone", "Gender", "Working Days", "Salary", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        selltable.setDoubleBuffered(true);
        selltable.setName(""); // NOI18N
        selltable.setRowHeight(25);
        selltable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        selltable.setShowGrid(false);
        selltable.setShowHorizontalLines(true);
        selltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(selltable);

        deletebtn1.setBackground(new java.awt.Color(0, 153, 153));
        deletebtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn1.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn1.setText("DELETE");
        deletebtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtn1MouseClicked(evt);
            }
        });
        deletebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Salary");

        sellsalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellsalaryActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Working Days");

        sellworking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellworking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellworkingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(deletebtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editbtn)
                        .addGap(575, 575, 575))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellworking, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellgender, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellpass, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellid, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellgender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellworking, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(editbtn)
                    .addComponent(clearbtn)
                    .addComponent(deletebtn1))
                .addGap(101, 101, 101))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        logoutFromMSeller.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        logoutFromMSeller.setForeground(new java.awt.Color(255, 0, 51));
        logoutFromMSeller.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutFromMSeller.setText("Logout");
        logoutFromMSeller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutFromMSellerMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Sellers");

        categorytab.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        categorytab.setForeground(new java.awt.Color(255, 255, 255));
        categorytab.setText("Categories");
        categorytab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorytabMouseClicked(evt);
            }
        });

        addbtn1.setBackground(new java.awt.Color(0, 204, 204));
        addbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbtn1.setForeground(new java.awt.Color(255, 0, 0));
        addbtn1.setText("X");
        addbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtn1MouseClicked(evt);
            }
        });
        addbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtn1ActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Prasant\\Downloads\\Untitled design (3).png")); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutFromMSeller, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addbtn1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(428, 428, 428)
                    .addComponent(categorytab, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addbtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logoutFromMSeller))
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(categorytab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(303, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellnameActionPerformed

    private void sellphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellphoneActionPerformed

    private void sellpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellpassActionPerformed

    private void sellidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellidActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked

            String sql = "insert into sellerdb values(?,?,?,?,?,?,?)";
            if(sellid.getText().isEmpty() || sellname.getText().isEmpty() || sellpass.getText().isEmpty() || sellphone.getText().isEmpty() || sellworking.getText().isEmpty() || sellsalary.getText().isEmpty())
                JOptionPane.showMessageDialog(this,"Missing Information");
            
            else{
                try {
                    Connection conn=DBConnection.connectDB();

                    PreparedStatement st=(PreparedStatement)conn.prepareStatement(sql);
                    st.setString(1,sellid.getText());
                    st.setString(2, sellname.getText());
                    st.setString(3, sellphone.getText());
                    st.setString(4, sellgender.getSelectedItem().toString());
                    st.setString(5, sellworking.getText());
                    st.setString(6, sellsalary.getText());
                    st.setString(7, sellpass.getText());
                    int z=st.executeUpdate();
                    conn.close();
                    ShowSeller();
                    JOptionPane.showMessageDialog(this, "Seller Added Successfully");
                     
                }catch(SQLIntegrityConstraintViolationException e){
                    String error = e.getMessage();
                    String[] str = error.split(" ");
                    String err = str[2].substring(1,str[2].length()-1);
                    String err_msg = "Duplicate entery for 'sellerid' "+err;
                    JOptionPane.showMessageDialog(this,err_msg);
                    sellid.setText("");
                }
                catch (HeadlessException | NumberFormatException | SQLException ex) {
                    Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                
            }
    }//GEN-LAST:event_addbtnMouseClicked

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed
        
    }//GEN-LAST:event_deletebtn1ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        
    }//GEN-LAST:event_editbtnActionPerformed

    private void selltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selltableMouseClicked
        DefaultTableModel model = (DefaultTableModel)selltable.getModel();
        int row = selltable.getSelectedRow();
        sellid.setText(model.getValueAt(row, 0).toString());
        sellname.setText(model.getValueAt(row, 1).toString());
        sellphone.setText(model.getValueAt(row, 2).toString());
        sellworking.setText(model.getValueAt(row, 4).toString());
        sellsalary.setText(model.getValueAt(row, 5).toString());
        sellpass.setText(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_selltableMouseClicked

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        sellid.setText("");
        sellname.setText("");
        sellphone.setText("");
        sellpass.setText("");
        sellsalary.setText("");
        sellworking.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void deletebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtn1MouseClicked
        if(sellid.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Select a seller to delete");
        else{
            try{
                con = DBConnection.connectDB();
                String id = sellid.getText();
                Statement st = con.createStatement();
                st.executeUpdate("delete from sellerdb where sellerid="+id);
                ShowSeller();
                JOptionPane.showMessageDialog(this,"Seller deleted successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deletebtn1MouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        if(sellid.getText().isEmpty() || sellname.getText().isEmpty() || sellphone.getText().isEmpty() || sellpass.getText().isEmpty() || sellworking.getText().isEmpty() || sellsalary.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try{
                con = DBConnection.connectDB();
                String query = "update sellerdb set sellername='"+sellname.getText()+"',sellerphone='"+sellphone.getText()+"',sellerpass='"+sellpass.getText()+"',sellergender='"+sellgender.getSelectedItem().toString()+"',workingdays='"+sellworking.getText()+"',Salary='"+sellsalary.getText()+"' where sellerid="+sellid.getText();
                Statement st = con.createStatement();
                st.executeUpdate(query);
                ShowSeller();
                JOptionPane.showMessageDialog(this,"Seller updated successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void logoutFromMSellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutFromMSellerMouseClicked
        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_logoutFromMSellerMouseClicked

    private void categorytabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorytabMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categorytabMouseClicked

    private void addbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtn1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_addbtn1MouseClicked

    private void addbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtn1ActionPerformed

    private void sellsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellsalaryActionPerformed

    private void sellworkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellworkingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellworkingActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbtnActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel categorytab;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutFromMSeller;
    private javax.swing.JComboBox<String> sellgender;
    private javax.swing.JTextField sellid;
    private javax.swing.JTextField sellname;
    private javax.swing.JTextField sellpass;
    private javax.swing.JTextField sellphone;
    private javax.swing.JTextField sellsalary;
    private javax.swing.JTable selltable;
    private javax.swing.JTextField sellworking;
    // End of variables declaration//GEN-END:variables
}
