package supermarket2;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Dealers extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rss = null;

    public Dealers() {
        initComponents();
        
        dealertable.getTableHeader().setOpaque(false);
        dealertable.getTableHeader().setBackground(new Color(32,136,203));
        dealertable.getTableHeader().setForeground(new Color(255,255,255));
        dealertable.setRowHeight(25);
        
        ShowDealer();
    }
    
    public void ShowDealer(){
        rss = admin.viewDealer();
        dealertable.setModel(DbUtils.resultSetToTableModel(rss));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dealername = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        dealerid = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dealertable = new javax.swing.JTable();
        deletebtn1 = new javax.swing.JButton();
        dealerphone = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchDealer = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        refreshDealer = new javax.swing.JButton();
        logoutFromMSeller = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        categorytab = new javax.swing.JLabel();
        addbtn1 = new javax.swing.JButton();
        addbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Dealer Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Product Name");

        dealername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dealername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealernameActionPerformed(evt);
            }
        });

        productname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productnameActionPerformed(evt);
            }
        });

        quantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });

        dealerid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dealerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealeridActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(0, 153, 153));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
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

        dealertable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dealertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dealer Id", "Name", "Phone", "Date", "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dealertable.setDoubleBuffered(true);
        dealertable.setName(""); // NOI18N
        dealertable.setRowHeight(25);
        dealertable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        dealertable.setShowGrid(false);
        dealertable.setShowHorizontalLines(true);
        dealertable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dealertableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dealertable);

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

        dealerphone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dealerphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealerphoneActionPerformed(evt);
            }
        });

        price.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Price");

        searchDealer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDealerActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Date");

        refreshDealer.setBackground(new java.awt.Color(0, 153, 153));
        refreshDealer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refreshDealer.setForeground(new java.awt.Color(255, 255, 255));
        refreshDealer.setText("REFRESH");
        refreshDealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshDealerMouseClicked(evt);
            }
        });
        refreshDealer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDealerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(searchDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(search)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(refreshDealer)
                            .addGap(0, 9, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dealername, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(dealerid)
                                .addComponent(price)
                                .addComponent(quantity)
                                .addComponent(dealerphone, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(productname, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(37, 37, 37)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(deletebtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editbtn)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchDealer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshDealer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dealerid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dealername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dealerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(editbtn)
                            .addComponent(clearbtn)
                            .addComponent(deletebtn1))
                        .addGap(56, 56, 56))
                    .addComponent(jScrollPane1))
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
        jLabel1.setText("Manage Dealers");

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

        addbtn2.setBackground(new java.awt.Color(0, 204, 204));
        addbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addbtn2.setText("<--");
        addbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtn2MouseClicked(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addbtn2)
                        .addGap(307, 307, 307)
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
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addbtn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutFromMSeller))
                            .addComponent(addbtn2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(categorytab, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dealernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealernameActionPerformed

    private void productnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productnameActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void dealeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealeridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealeridActionPerformed

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked

        String sql = "insert into dealerdb values(?,?,?,?,?,?,?)";
        if(dealerid.getText().isEmpty() || dealername.getText().isEmpty() || quantity.getText().isEmpty() || productname.getText().isEmpty() || dealerphone.getText().isEmpty() || price.getText().isEmpty())
        JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try {
                Connection conn=DBConnection.connectDB();

                PreparedStatement st=(PreparedStatement)conn.prepareStatement(sql);
                st.setString(1,dealerid.getText());
                st.setString(2, dealername.getText());
                st.setString(3, dealerphone.getText());
                Date date = (java.util.Date)dealerDate.getDate();
                st.setDate(4, new java.sql.Date(date.getTime()));
                st.setString(5, productname.getText());
                st.setString(6, quantity.getText());
                st.setString(7, price.getText());
                
                int z=st.executeUpdate();
                ShowDealer();
                JOptionPane.showMessageDialog(this, "Seller Added Successfully");

                conn.close();
            }catch (HeadlessException | NumberFormatException | SQLException ex) {
                Logger.getLogger(ManageSeller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_addbtnMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        if(dealerid.getText().isEmpty() || dealername.getText().isEmpty() || quantity.getText().isEmpty() || productname.getText().isEmpty() || dealerphone.getText().isEmpty() || price.getText().isEmpty())
        JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try{
                con = DBConnection.connectDB();
                String query = "update dealerdb set dealername='"+dealername.getText()+"',dealerphone='"+dealerphone.getText()+"',product='"+productname.getText()+"',quantity='"+quantity.getText()+"',price='"+price.getText()+"' where dealerid="+dealerid.getText();
                Statement st = con.createStatement();
                st.executeUpdate(query);
                ShowDealer();
                JOptionPane.showMessageDialog(this,"Seller updated successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_editbtnMouseClicked

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbtnActionPerformed

    private void clearbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearbtnMouseClicked
        dealerid.setText("");
        dealername.setText("");
        dealerphone.setText("");
        productname.setText("");
        quantity.setText("");
        price.setText("");
        searchDealer.setText("");
    }//GEN-LAST:event_clearbtnMouseClicked

    private void dealertableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealertableMouseClicked
        DefaultTableModel model = (DefaultTableModel)dealertable.getModel();
        int row = dealertable.getSelectedRow();
        dealerid.setText(model.getValueAt(row, 0).toString());
        dealername.setText(model.getValueAt(row, 1).toString());
        dealerphone.setText(model.getValueAt(row, 2).toString());
        productname.setText(model.getValueAt(row, 4).toString());
        quantity.setText(model.getValueAt(row, 5).toString());
        price.setText(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_dealertableMouseClicked

    private void deletebtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtn1MouseClicked
        if(dealerid.getText().isEmpty())
        JOptionPane.showMessageDialog(this, "Select a dealer to delete");
        else{
            try{
                con = DBConnection.connectDB();
                String id = dealerid.getText();
                Statement st = con.createStatement();
                st.executeUpdate("delete from dealerdb where dealerid="+id);
                ShowDealer();
                JOptionPane.showMessageDialog(this,"Dealer deleted successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_deletebtn1MouseClicked

    private void deletebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtn1ActionPerformed

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

    private void dealerphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealerphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealerphoneActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void searchDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDealerActionPerformed

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        try{
            String searchName = searchDealer.getText();
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from dealerdb where product = '"+searchName+"'");
            rss = (java.sql.ResultSet) st.executeQuery();
            dealertable.setModel(DbUtils.resultSetToTableModel(rss));
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchMouseClicked

    private void refreshDealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshDealerMouseClicked
        searchDealer.setText("");
        ShowDealer();
    }//GEN-LAST:event_refreshDealerMouseClicked

    private void refreshDealerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDealerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshDealerActionPerformed

    private void addbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtn2MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addbtn2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dealers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addbtn1;
    private javax.swing.JButton addbtn2;
    private javax.swing.JLabel categorytab;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField dealerid;
    private javax.swing.JTextField dealername;
    private javax.swing.JTextField dealerphone;
    private javax.swing.JTable dealertable;
    private javax.swing.JButton deletebtn1;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutFromMSeller;
    private javax.swing.JTextField price;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton refreshDealer;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchDealer;
    // End of variables declaration//GEN-END:variables
}
