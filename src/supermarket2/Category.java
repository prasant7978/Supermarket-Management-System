package supermarket2;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Category extends javax.swing.JFrame {
    
    Admin admin = new Admin();
    
    Connection con = null;
    PreparedStatement pst = null;
    java.sql.ResultSet rss = null;
    
    public Category() {
        initComponents();
        
        cattable.getTableHeader().setOpaque(false);
        cattable.getTableHeader().setBackground(new Color(32,136,203));
        cattable.getTableHeader().setForeground(new Color(255,255,255));
        cattable.setRowHeight(25);
        
        ShowCategory();
    }

    public void ShowCategory(){
        rss = admin.viewCategory();
        cattable.setModel(DbUtils.resultSetToTableModel(rss));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        catname = new javax.swing.JTextField();
        catdesc = new javax.swing.JTextField();
        catid = new javax.swing.JTextField();
        catadd = new javax.swing.JButton();
        catupdt = new javax.swing.JButton();
        catdelete = new javax.swing.JButton();
        catclr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cattable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        catadd1 = new javax.swing.JButton();
        catadd2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Cat Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Description");

        catname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catnameActionPerformed(evt);
            }
        });

        catdesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catdescActionPerformed(evt);
            }
        });

        catid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        catid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catidActionPerformed(evt);
            }
        });

        catadd.setBackground(new java.awt.Color(0, 153, 153));
        catadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catadd.setForeground(new java.awt.Color(255, 255, 255));
        catadd.setText("ADD");
        catadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cataddMouseClicked(evt);
            }
        });

        catupdt.setBackground(new java.awt.Color(0, 153, 153));
        catupdt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catupdt.setForeground(new java.awt.Color(255, 255, 255));
        catupdt.setText("UPDATE");
        catupdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catupdtMouseClicked(evt);
            }
        });

        catdelete.setBackground(new java.awt.Color(0, 153, 153));
        catdelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catdelete.setForeground(new java.awt.Color(255, 255, 255));
        catdelete.setText("DELETE");
        catdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catdeleteMouseClicked(evt);
            }
        });
        catdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catdeleteActionPerformed(evt);
            }
        });

        catclr.setBackground(new java.awt.Color(0, 153, 153));
        catclr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catclr.setForeground(new java.awt.Color(255, 255, 255));
        catclr.setText("CLEAR");
        catclr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catclrMouseClicked(evt);
            }
        });

        cattable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Category Name", "Category Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cattable.setDoubleBuffered(true);
        cattable.setName(""); // NOI18N
        cattable.setRowHeight(25);
        cattable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        cattable.setShowGrid(false);
        cattable.setShowHorizontalLines(true);
        cattable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cattableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cattable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(catdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(catname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(catid, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(catdelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catclr)
                        .addGap(12, 12, 12)
                        .addComponent(catadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(catupdt)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(catname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(catdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catadd)
                    .addComponent(catupdt)
                    .addComponent(catclr)
                    .addComponent(catdelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Logout");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Categories");

        catadd1.setBackground(new java.awt.Color(0, 204, 204));
        catadd1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        catadd1.setForeground(new java.awt.Color(255, 0, 0));
        catadd1.setText("X");
        catadd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catadd1MouseClicked(evt);
            }
        });

        catadd2.setBackground(new java.awt.Color(0, 204, 204));
        catadd2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        catadd2.setText("<--");
        catadd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catadd2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(catadd2)
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catadd1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(catadd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(catadd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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

    private void catnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catnameActionPerformed

    private void catdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catdescActionPerformed

    private void catidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catidActionPerformed

    private void catdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catdeleteActionPerformed

    private void cataddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cataddMouseClicked
        
            if(catid.getText().isEmpty() || catname.getText().isEmpty() || catdesc.getText().isEmpty())
                JOptionPane.showMessageDialog(this,"Missing Information");
            else{
                try {
                    Connection conn=DBConnection.connectDB();
                    String sql = "insert into categorydb values(?,?,?)";
                    PreparedStatement st=(PreparedStatement)conn.prepareStatement(sql);
                    st.setString(1,catid.getText());
                    st.setString(2, catname.getText());
                    st.setString(3, catdesc.getText());
                    
                    int rowAffected=st.executeUpdate();
                    conn.close();
                    ShowCategory();
                    JOptionPane.showMessageDialog(this, "Category Added Successfully");
                }catch (HeadlessException | NumberFormatException | SQLException ex) {
                    Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_cataddMouseClicked

    private void catclrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catclrMouseClicked
        catid.setText("");
        catname.setText("");
        catdesc.setText("");
    }//GEN-LAST:event_catclrMouseClicked

    private void catdeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catdeleteMouseClicked
        if(catid.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Select a category to delete");
        else{
            try{
                con = DBConnection.connectDB();
                String id = catid.getText();
                java.sql.Statement st = con.createStatement();
                st.executeUpdate("delete from categorydb where catid="+id);
                ShowCategory();
                JOptionPane.showMessageDialog(this,"Category deleted successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_catdeleteMouseClicked

    private void catupdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catupdtMouseClicked
        if(catid.getText().isEmpty() || catname.getText().isEmpty() || catdesc.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            try{
                con = DBConnection.connectDB();
                String query = "update categorydb set catname='"+catname.getText()+"',catdesc='"+catdesc.getText()+"' where catid="+catid.getText();
                java.sql.Statement st = con.createStatement();
                st.executeUpdate(query);
                ShowCategory();
                JOptionPane.showMessageDialog(this,"Category updated successfully");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_catupdtMouseClicked

    private void cattableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cattableMouseClicked
        DefaultTableModel model = (DefaultTableModel)cattable.getModel();
        int row = cattable.getSelectedRow();
        catid.setText(model.getValueAt(row, 0).toString());
        catname.setText(model.getValueAt(row, 1).toString());
        catdesc.setText(model.getValueAt(row, 2).toString());
    }//GEN-LAST:event_cattableMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        admin.logoutEmployee();
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void catadd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catadd1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_catadd1MouseClicked

    private void catadd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catadd2MouseClicked
        new Products().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_catadd2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton catadd;
    private javax.swing.JButton catadd1;
    private javax.swing.JButton catadd2;
    private javax.swing.JButton catclr;
    private javax.swing.JButton catdelete;
    private javax.swing.JTextField catdesc;
    private javax.swing.JTextField catid;
    private javax.swing.JTextField catname;
    private javax.swing.JTable cattable;
    private javax.swing.JButton catupdt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
