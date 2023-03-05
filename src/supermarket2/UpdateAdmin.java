package supermarket2;

import javax.swing.JOptionPane;

public class UpdateAdmin extends javax.swing.JFrame {
    
    public UpdateAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pass = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        adminPassword = new javax.swing.JTextField();
        adminName = new javax.swing.JTextField();
        adminClear = new javax.swing.JButton();
        adminUpdate = new javax.swing.JButton();
        adminClear1 = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Reset Admin");

        Pass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.setText("Password");

        Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");

        adminPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPasswordActionPerformed(evt);
            }
        });

        adminName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminNameActionPerformed(evt);
            }
        });

        adminClear.setBackground(new java.awt.Color(0, 51, 51));
        adminClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminClear.setForeground(new java.awt.Color(255, 255, 255));
        adminClear.setText("CLEAR");
        adminClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminClearMouseClicked(evt);
            }
        });

        adminUpdate.setBackground(new java.awt.Color(0, 51, 51));
        adminUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminUpdate.setForeground(new java.awt.Color(255, 255, 255));
        adminUpdate.setText("UPDATE");
        adminUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminUpdateMouseClicked(evt);
            }
        });

        adminClear1.setBackground(new java.awt.Color(0, 204, 204));
        adminClear1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminClear1.setForeground(new java.awt.Color(255, 0, 0));
        adminClear1.setText("X");
        adminClear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminClear1MouseClicked(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 204, 204));
        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setText("<--");
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
                .addComponent(back)
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminClear1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(adminClear)
                                .addGap(30, 30, 30)
                                .addComponent(adminUpdate)))
                        .addGap(1, 1, 1)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back)
                            .addComponent(adminClear1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminClear)
                    .addComponent(adminUpdate))
                .addGap(66, 66, 66))
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

    private void adminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminPasswordActionPerformed

    private void adminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNameActionPerformed

    private void adminUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminUpdateMouseClicked
        if(adminName.getText().isEmpty() || adminPassword.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Missing Information");
        else{
            Admin admin = new Admin();
            admin.resetPassword(adminName.getText(),adminPassword.getText());
            JOptionPane.showMessageDialog(this,"Updated successfully");
        }
    }//GEN-LAST:event_adminUpdateMouseClicked

    private void adminClear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminClear1MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminClear1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void adminClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminClearMouseClicked
        adminName.setText("");
        adminPassword.setText("");
    }//GEN-LAST:event_adminClearMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Pass;
    private javax.swing.JButton adminClear;
    private javax.swing.JButton adminClear1;
    private javax.swing.JTextField adminName;
    private javax.swing.JTextField adminPassword;
    private javax.swing.JButton adminUpdate;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
