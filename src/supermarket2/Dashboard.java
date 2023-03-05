package supermarket2;

import static supermarket2.Billing.displayUserName;

public class Dashboard extends javax.swing.JFrame {
    
    Admin admin = new Admin();

    static String displayAdminUserName = "";
    
    public Dashboard() {
        initComponents();
        
        adminName.setText(displayUserName);
    }
    
    public Dashboard(String uname) {
        initComponents();
        
        displayUserName = uname;
        adminName.setText(displayUserName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        resetpass = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        product = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        seller = new javax.swing.JLabel();
        stocks = new javax.swing.JLabel();
        dealer = new javax.swing.JLabel();
        productClear1 = new javax.swing.JButton();
        dealerImg = new javax.swing.JLabel();
        productImg = new javax.swing.JLabel();
        resetPasswordImg = new javax.swing.JLabel();
        salesReportImg = new javax.swing.JLabel();
        lowStockImg = new javax.swing.JLabel();
        sellerImg = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        resetpass.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        resetpass.setForeground(new java.awt.Color(255, 255, 255));
        resetpass.setText("Reset Password");
        resetpass.setAlignmentY(0.0F);
        resetpass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetpassMouseClicked(evt);
            }
        });
        jPanel1.add(resetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, 40));

        logout.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.setAlignmentY(0.0F);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 520, -1, 30));

        product.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setText("Manage Product");
        product.setAlignmentY(0.0F);
        product.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });
        jPanel1.add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 171, 33));

        report.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("Sales Report");
        report.setAlignmentY(0.0F);
        report.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportMouseClicked(evt);
            }
        });
        jPanel1.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 33));

        seller.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        seller.setForeground(new java.awt.Color(255, 255, 255));
        seller.setText("Manage Seller");
        seller.setAlignmentY(0.0F);
        seller.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerMouseClicked(evt);
            }
        });
        jPanel1.add(seller, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        stocks.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        stocks.setForeground(new java.awt.Color(255, 255, 255));
        stocks.setText("Low Stocks");
        stocks.setAlignmentY(0.0F);
        stocks.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocksMouseClicked(evt);
            }
        });
        jPanel1.add(stocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, 33));

        dealer.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        dealer.setForeground(new java.awt.Color(255, 255, 255));
        dealer.setText("Manage Dealer");
        dealer.setAlignmentY(0.0F);
        dealer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dealerMouseClicked(evt);
            }
        });
        jPanel1.add(dealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 32));

        productClear1.setBackground(new java.awt.Color(153, 153, 153));
        productClear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productClear1.setForeground(new java.awt.Color(255, 51, 51));
        productClear1.setText("X");
        productClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClear1MouseClicked(evt);
            }
        });
        jPanel1.add(productClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        dealerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/manage dealer.png"))); // NOI18N
        dealerImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dealerImgMouseClicked(evt);
            }
        });
        jPanel1.add(dealerImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 200, 120));

        productImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/manage product.png"))); // NOI18N
        productImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productImgMouseClicked(evt);
            }
        });
        jPanel1.add(productImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 200, 120));

        resetPasswordImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/reset password.png"))); // NOI18N
        resetPasswordImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetPasswordImgMouseClicked(evt);
            }
        });
        jPanel1.add(resetPasswordImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 200, 120));

        salesReportImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/sales report.png"))); // NOI18N
        salesReportImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesReportImgMouseClicked(evt);
            }
        });
        jPanel1.add(salesReportImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 200, 120));

        lowStockImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/low stocks.png"))); // NOI18N
        lowStockImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowStockImgMouseClicked(evt);
            }
        });
        jPanel1.add(lowStockImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 120));

        sellerImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/manage seller.png"))); // NOI18N
        sellerImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerImgMouseClicked(evt);
            }
        });
        jPanel1.add(sellerImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 200, 120));

        adminName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 80, 30));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermarket2/Images/dashboard.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetpassMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetpassMouseClicked

    private void dealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealerMouseClicked
        new Dealers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dealerMouseClicked

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMouseClicked

    private void reportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseClicked
        new SalesReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportMouseClicked

    private void stocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocksMouseClicked
        new Stocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stocksMouseClicked

    private void sellerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerMouseClicked
        new ManageSeller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellerMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void productClear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClear1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_productClear1MouseClicked

    private void sellerImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerImgMouseClicked
        new ManageSeller().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellerImgMouseClicked

    private void dealerImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealerImgMouseClicked
        new Dealers().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dealerImgMouseClicked

    private void productImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productImgMouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productImgMouseClicked

    private void lowStockImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowStockImgMouseClicked
        new Stocks().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lowStockImgMouseClicked

    private void salesReportImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesReportImgMouseClicked
        new SalesReport().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salesReportImgMouseClicked

    private void resetPasswordImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPasswordImgMouseClicked
        new UpdateAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetPasswordImgMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard(displayAdminUserName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel dealer;
    private javax.swing.JLabel dealerImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel lowStockImg;
    private javax.swing.JLabel product;
    private javax.swing.JButton productClear1;
    private javax.swing.JLabel productImg;
    private javax.swing.JLabel report;
    private javax.swing.JLabel resetPasswordImg;
    private javax.swing.JLabel resetpass;
    private javax.swing.JLabel salesReportImg;
    private javax.swing.JLabel seller;
    private javax.swing.JLabel sellerImg;
    private javax.swing.JLabel stocks;
    // End of variables declaration//GEN-END:variables
}
