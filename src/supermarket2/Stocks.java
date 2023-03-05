package supermarket2;

import database.stocksDb;
import java.awt.Color;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class Stocks extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    stocksDb obj = new stocksDb();
    
    ResultSet rss = null;

    public Stocks() {
        initComponents();
        
        stocksTable.getTableHeader().setOpaque(false);
        stocksTable.getTableHeader().setBackground(new Color(32,136,203));
        stocksTable.getTableHeader().setForeground(new Color(255,255,255));
        stocksTable.setRowHeight(25);
        
        ShowStocks();
    }

    public void ShowStocks(){
        Admin admin = new Admin();
        rss = obj.ShowLowStocks();
        stocksTable.setModel(DbUtils.resultSetToTableModel(rss));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stocksTable = new javax.swing.JTable();
        productLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productClear1 = new javax.swing.JButton();
        backToBilling = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        stocksTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        stocksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Name", "Quantity", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stocksTable.setDoubleBuffered(true);
        stocksTable.setName(""); // NOI18N
        stocksTable.setRowHeight(25);
        stocksTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        stocksTable.setShowGrid(true);
        stocksTable.setShowVerticalLines(false);
        stocksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stocksTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
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
        jLabel1.setText("Low Stocks");

        productClear1.setBackground(new java.awt.Color(0, 204, 204));
        productClear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productClear1.setForeground(new java.awt.Color(255, 51, 51));
        productClear1.setText("X");
        productClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productClear1MouseClicked(evt);
            }
        });

        backToBilling.setBackground(new java.awt.Color(0, 204, 204));
        backToBilling.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backToBilling.setText("<--");
        backToBilling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToBillingMouseClicked(evt);
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
                        .addComponent(backToBilling)
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(productClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(productLogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backToBilling)))
                .addGap(16, 16, 16)
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

    private void stocksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocksTableMouseClicked
        
    }//GEN-LAST:event_stocksTableMouseClicked

    private void productLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLogoutMouseClicked
        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_productLogoutMouseClicked

    private void productClear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClear1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_productClear1MouseClicked

    private void backToBillingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToBillingMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToBillingMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToBilling;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton productClear1;
    private javax.swing.JLabel productLogout;
    private javax.swing.JTable stocksTable;
    // End of variables declaration//GEN-END:variables
}
