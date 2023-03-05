package supermarket2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Billing extends javax.swing.JFrame {
    
    Seller seller = new Seller();
    static String displayUserName = "";
    int j,proId;
    Double price,total=0.0,finalPrice=0.0;
    int i,remQty;
    String cat = "";
    
    Connection con = null;
    PreparedStatement st = null;
    java.sql.ResultSet rss = null;

    public Billing(String uname) {
        initComponents();
        
        productTable.getTableHeader().setOpaque(false);
        productTable.getTableHeader().setBackground(new Color(32,136,203));
        productTable.getTableHeader().setForeground(new Color(255,255,255));
        productTable.setRowHeight(25);
        
        displayUserName = uname;
        userName.setText(displayUserName);
        
        ShowProduct();
        setCategory();
        
        try{
            con = DBConnection.connectDB();
            st = con.prepareStatement("select * from salesdb order by salesid desc limit 1;");
            rss = (java.sql.ResultSet) st.executeQuery();
            if(rss.next()){
                j = rss.getInt("salesid");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ShowProduct(){
            rss = seller.viewProduct();
            productTable.setModel(DbUtils.resultSetToTableModel(rss));
    }
    
    public void update(){  
        int quantitySelected = Integer.valueOf(proQuantity.getText());
        seller.updateStocks(proId, remQty, quantitySelected);
        ShowProduct();    
    }
    
    public void setCategory(){           
        rss = seller.setCategory();
        try {
            while(rss.next()){
                try {
                    productCat.addItem(rss.getString("catname"));
                } catch (SQLException ex) {
                    Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        proQuantity = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        filter = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        billText = new javax.swing.JTextArea();
        printBtn = new javax.swing.JButton();
        finalAmount = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        custPhone = new javax.swing.JTextField();
        custName = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        discount = new javax.swing.JButton();
        purchaseDate = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userPhoto = new javax.swing.JLabel();
        filter1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Product");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Quantity");

        productName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        proQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        proQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proQuantityActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 153, 153));
        refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("REFRESH");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        filter.setBackground(new java.awt.Color(0, 153, 153));
        filter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filter.setForeground(new java.awt.Color(255, 255, 255));
        filter.setText("FILTER");
        filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterMouseClicked(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("ADD TO BILL");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 153, 153));
        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("CLEAR");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });

        productTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Quantity", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setDoubleBuffered(true);
        productTable.setName(""); // NOI18N
        productTable.setRowHeight(25);
        productTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        productTable.setShowGrid(false);
        productTable.setShowHorizontalLines(true);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(productTable);

        productCat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productCatMouseClicked(evt);
            }
        });

        billText.setColumns(20);
        billText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        billText.setRows(5);
        jScrollPane1.setViewportView(billText);

        printBtn.setBackground(new java.awt.Color(0, 153, 153));
        printBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print Bill");
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
        });
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        finalAmount.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        finalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalAmountActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Name");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("Phone");

        custPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPhoneActionPerformed(evt);
            }
        });

        custName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Date");

        discount.setBackground(new java.awt.Color(0, 153, 153));
        discount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setText("Apply Discount");
        discount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discountMouseClicked(evt);
            }
        });
        discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(productCat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(filter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refresh)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addGap(16, 16, 16)
                                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(purchaseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(custPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16)
                                        .addGap(16, 16, 16)
                                        .addComponent(proQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(finalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(clearBtn)
                                .addGap(10, 10, 10)
                                .addComponent(addBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(discount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printBtn))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filter)
                            .addComponent(refresh))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(proQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(purchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(clearBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(finalAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Logout");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Product Billing");

        userName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));

        userPhoto.setBackground(new java.awt.Color(0, 0, 0));

        filter1.setBackground(new java.awt.Color(0, 204, 204));
        filter1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filter1.setForeground(new java.awt.Color(255, 0, 0));
        filter1.setText("X");
        filter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filter1MouseClicked(evt);
            }
        });
        filter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(384, 384, 384)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(filter1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(filter1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18)
                            .addGap(24, 24, 24))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(userPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void proQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proQuantityActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        ShowProduct();
    }//GEN-LAST:event_refreshMouseClicked

    private void filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterMouseClicked
        try{
            cat = productCat.getSelectedItem().toString();
            rss = seller.filterTable(cat);
            productTable.setModel(DbUtils.resultSetToTableModel(rss));
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_filterMouseClicked

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        if(proQuantity.getText().isEmpty() || productName.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else if(remQty <= Integer.valueOf(proQuantity.getText()))
            JOptionPane.showMessageDialog(this,"Not Enough In Stock");
        else{
            i++;
            total = (price * Double.valueOf(proQuantity.getText().toString()));
            finalPrice=finalPrice+total;

            if(custName.getText().isEmpty() || custPhone.getText().isEmpty())
                JOptionPane.showMessageDialog(this,"Missing Customer Information");
            else{
                    Date date = (Date)purchaseDate.getDate();
                    j = seller.addSalesDetails(j,date,productName.getText(),proQuantity.getText(),String.valueOf(total));
                }
            
            if(i == 1){
                billText.setText(billText.getText()+"***************************A2Z SuperMart*******************************\n"+"Sl#                Name                Price               Quantity                Total\n"+i+"                 "+productName.getText()+"            "+price+"                      "+proQuantity.getText()+"                     "+total+"\n");
                billText.setText(billText.getText()+"-----------------------------------------------------------------------------------\n");  
            }
            else{                
                billText.setText(billText.getText()+i+"                 "+productName.getText()+"            "+price+"                      "+proQuantity.getText()+"                     "+total+"\n");                              
                billText.setText(billText.getText()+"-----------------------------------------------------------------------------------\n");
            }
            finalAmount.setText("Net Amount: "+finalPrice);
            update();
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        productName.setText("");
        proQuantity.setText("");
        custName.setText("");
        custPhone.setText("");
        billText.setText("");
        finalAmount.setText("");
    }//GEN-LAST:event_clearBtnMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        proQuantity.setText("");
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int row = productTable.getSelectedRow();
        proId = Integer.valueOf(model.getValueAt(row, 0).toString());
        productName.setText(model.getValueAt(row, 1).toString());
        price = Double.valueOf(model.getValueAt(row, 3).toString());
        remQty = Integer.valueOf(model.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_productTableMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseClicked
        
        if(custName.getText().isEmpty() || custPhone.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Customer Information");
        else{
            
            seller.addCustomerDetails(custName.getText(), custPhone.getText(),displayUserName);
        }
        try{
            billText.setText(billText.getText()+"\n\n\t\tTotal Amount: "+finalPrice.toString());
            billText.setText(billText.getText()+"\n\nThank You For Shopping With A2Z Supermarket");
            billText.print();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_printBtnMouseClicked

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBtnActionPerformed

    private void finalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalAmountActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        seller.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked
    
    private void productCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productCatMouseClicked
        
    }//GEN-LAST:event_productCatMouseClicked

    private void filter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filter1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_filter1MouseClicked

    private void filter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filter1ActionPerformed

    private void custPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custPhoneActionPerformed

    private void custNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameActionPerformed

    private void discountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discountMouseClicked
        double discount = 0.2;
        finalPrice = finalPrice-(finalPrice*discount);
        finalAmount.setText("Net Amount: "+finalPrice);
        
    }//GEN-LAST:event_discountMouseClicked

    private void discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing(displayUserName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea billText;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField custName;
    private javax.swing.JTextField custPhone;
    private javax.swing.JButton discount;
    private javax.swing.JButton filter;
    private javax.swing.JButton filter1;
    private javax.swing.JTextField finalAmount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField proQuantity;
    private javax.swing.JComboBox<String> productCat;
    private javax.swing.JTextField productName;
    private javax.swing.JTable productTable;
    private com.toedter.calendar.JDateChooser purchaseDate;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel userPhoto;
    // End of variables declaration//GEN-END:variables
}
