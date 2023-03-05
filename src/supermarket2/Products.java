package supermarket2;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Products extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    
    Connection con = null;
    PreparedStatement st = null;
    java.sql.ResultSet rss = null;
   
    public Products() {
        initComponents();
        
        productTable.getTableHeader().setOpaque(false);
        productTable.getTableHeader().setBackground(new Color(32,136,203));
        productTable.getTableHeader().setForeground(new Color(255,255,255));
        productTable.setRowHeight(25);
        
        ShowProduct();
        setCategory();
    }

    public void ShowProduct(){
        rss = admin.viewProduct();
        productTable.setModel(DbUtils.resultSetToTableModel(rss));
    }
    
    public void setCategory(){
        rss = admin.setCategory();
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        productQuantity = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productId = new javax.swing.JTextField();
        productCat = new javax.swing.JComboBox<>();
        productAdd = new javax.swing.JButton();
        productEdit = new javax.swing.JButton();
        productDelete = new javax.swing.JButton();
        productClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productClear1 = new javax.swing.JButton();
        category = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Product Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Category");

        productName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        productQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityActionPerformed(evt);
            }
        });

        productPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceActionPerformed(evt);
            }
        });

        productId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdActionPerformed(evt);
            }
        });

        productCat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        productAdd.setBackground(new java.awt.Color(0, 153, 153));
        productAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productAdd.setForeground(new java.awt.Color(255, 255, 255));
        productAdd.setText("ADD");
        productAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAddMouseClicked(evt);
            }
        });

        productEdit.setBackground(new java.awt.Color(0, 153, 153));
        productEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productEdit.setForeground(new java.awt.Color(255, 255, 255));
        productEdit.setText("UPDATE");
        productEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productEditMouseClicked(evt);
            }
        });

        productDelete.setBackground(new java.awt.Color(0, 153, 153));
        productDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productDelete.setForeground(new java.awt.Color(255, 255, 255));
        productDelete.setText("DELETE");
        productDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDeleteMouseClicked(evt);
            }
        });

        productClear.setBackground(new java.awt.Color(0, 153, 153));
        productClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productClear.setForeground(new java.awt.Color(255, 255, 255));
        productClear.setText("CLEAR");
        productClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClearMouseClicked(evt);
            }
        });

        productTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Quantity", "Price", "Category"
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
        productTable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        productTable.setShowGrid(false);
        productTable.setShowHorizontalLines(true);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCat, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(productDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productClear)
                        .addGap(12, 12, 12)
                        .addComponent(productAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productEdit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productAdd)
                    .addComponent(productEdit)
                    .addComponent(productClear)
                    .addComponent(productDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );

        productLogout.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        productLogout.setForeground(new java.awt.Color(255, 0, 0));
        productLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLogout.setText("Logout");
        productLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLogoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Products");

        productClear1.setBackground(new java.awt.Color(0, 204, 204));
        productClear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productClear1.setForeground(new java.awt.Color(255, 51, 51));
        productClear1.setText("X");
        productClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClear1MouseClicked(evt);
            }
        });

        category.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        category.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/application.png"))); // NOI18N
        category.setText("Category");
        category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMouseClicked(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(category)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(back)))
                        .addGap(254, 254, 254)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productLogout)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(productClear1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(productLogout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(category)))
                        .addGap(3, 3, 3)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void productQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityActionPerformed

    private void productPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceActionPerformed

    private void productIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdActionPerformed

    private void productAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAddMouseClicked
       String sql = "insert into productdb values(?,?,?,?,?)";
        if(productId.getText().isEmpty() || productName.getText().isEmpty() || productQuantity.getText().isEmpty() || productPrice.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try {
                Connection conn=DBConnection.connectDB();
                PreparedStatement st=(PreparedStatement)conn.prepareStatement(sql);
                st.setString(1,productId.getText());
                st.setString(2, productName.getText());
                st.setString(3, productQuantity.getText());
                st.setString(4, productPrice.getText());
                st.setString(5, productCat.getSelectedItem().toString());
                int z=st.executeUpdate();
                conn.close();
                ShowProduct();
                JOptionPane.showMessageDialog(this, "Product Added Successfully");     
            }catch (HeadlessException | NumberFormatException | SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_productAddMouseClicked

    private void productClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClearMouseClicked
        productId.setText("");
        productName.setText("");
        productQuantity.setText("");
        productPrice.setText("");
    }//GEN-LAST:event_productClearMouseClicked

    private void productDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDeleteMouseClicked
        if(productId.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Select or enter a product to delete");
        else{
            try{
                con = DBConnection.connectDB();
                String id = productId.getText();
                Statement st = con.createStatement();
                st.executeUpdate("delete from productdb where productId="+id);
                ShowProduct();
                JOptionPane.showMessageDialog(this,"Product deleted successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_productDeleteMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int row = productTable.getSelectedRow();
        productId.setText(model.getValueAt(row, 0).toString());
        productName.setText(model.getValueAt(row, 1).toString());
        productQuantity.setText(model.getValueAt(row, 2).toString());
        productPrice.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_productTableMouseClicked

    private void productEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productEditMouseClicked
        if(productId.getText().isEmpty() || productName.getText().isEmpty() || productQuantity.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try{
                con = DBConnection.connectDB();
                String query = "update productdb set productName='"+productName.getText()+"',productPrice='"+productPrice.getText()+"',productQuantity='"+productQuantity.getText()+"' where productId="+productId.getText();
                java.sql.Statement st = con.createStatement();
                st.executeUpdate(query);
                ShowProduct();
                JOptionPane.showMessageDialog(this,"Product updated successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_productEditMouseClicked

    private void productClear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClear1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_productClear1MouseClicked

    private void productLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLogoutMouseClicked
        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_productLogoutMouseClicked

    private void categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMouseClicked
        new Category().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton productAdd;
    private javax.swing.JComboBox<String> productCat;
    private javax.swing.JButton productClear;
    private javax.swing.JButton productClear1;
    private javax.swing.JButton productDelete;
    private javax.swing.JButton productEdit;
    private javax.swing.JTextField productId;
    private javax.swing.JLabel productLogout;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
