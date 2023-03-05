package supermarket2;

import java.awt.Color;
import java.sql.ResultSet;
import java.util.Date;
import net.proteanit.sql.DbUtils;

public class SalesReport extends javax.swing.JFrame {
    
    ResultSet rss = null;
    
    Admin admin = new Admin();

    public SalesReport() {
        initComponents();
        
        salesTable.getTableHeader().setOpaque(false);
        salesTable.getTableHeader().setBackground(new Color(32,136,203));
        salesTable.getTableHeader().setForeground(new Color(255,255,255));
        salesTable.setRowHeight(25);
        
        ShowStocks();
    }
    
    public void ShowStocks(){
        
        try{    
            rss = admin.salesReport();
            salesTable.setModel(DbUtils.resultSetToTableModel(rss));
            totalSales.setText("Total Amount: "+String.valueOf(admin.salesTotal()));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        filterDate = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        totalSales = new javax.swing.JTextField();
        chooseDate = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filter1 = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

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

        filterDate.setBackground(new java.awt.Color(0, 153, 153));
        filterDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        filterDate.setForeground(new java.awt.Color(255, 255, 255));
        filterDate.setText("FILTER");
        filterDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterDateMouseClicked(evt);
            }
        });

        salesTable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sl#", "Date", "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        salesTable.setDoubleBuffered(true);
        salesTable.setFocusable(false);
        salesTable.setName(""); // NOI18N
        salesTable.setRowHeight(25);
        salesTable.setSelectionBackground(new java.awt.Color(0, 153, 255));
        salesTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        salesTable.setShowGrid(false);
        salesTable.setShowHorizontalLines(true);
        salesTable.getTableHeader().setReorderingAllowed(false);
        salesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(salesTable);

        totalSales.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(chooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refresh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterDate)
                    .addComponent(refresh)
                    .addComponent(chooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Sales Report");

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

        refresh1.setBackground(new java.awt.Color(0, 204, 204));
        refresh1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        refresh1.setText("<--");
        refresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh1MouseClicked(evt);
            }
        });
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
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
                        .addComponent(refresh1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(338, 338, 338)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filter1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(filter1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        ShowStocks();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void filterDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterDateMouseClicked

        Date date = (Date)chooseDate.getDate();
        date = new java.sql.Date(date.getTime());
        
        rss = admin.salesReport(date);
        salesTable.setModel(DbUtils.resultSetToTableModel(rss));
        totalSales.setText("Total Amount: "+String.valueOf(admin.salesTotal(date)));
        
    }//GEN-LAST:event_filterDateMouseClicked

    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked

    }//GEN-LAST:event_salesTableMouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked

        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void filter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filter1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_filter1MouseClicked

    private void filter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filter1ActionPerformed

    private void refresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refresh1MouseClicked

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser chooseDate;
    private javax.swing.JButton filter1;
    private javax.swing.JButton filterDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refresh1;
    private javax.swing.JTable salesTable;
    private javax.swing.JTextField totalSales;
    // End of variables declaration//GEN-END:variables
}
