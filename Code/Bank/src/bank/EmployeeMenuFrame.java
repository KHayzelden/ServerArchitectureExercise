
package bank;

import javax.swing.JOptionPane;

public class EmployeeMenuFrame extends javax.swing.JFrame {

    static String currentUser = "" ;
    
    public EmployeeMenuFrame(String currentUserTemp) {
        initComponents();
        currentUser = currentUserTemp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteEmployeeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ediBtn = new javax.swing.JButton();
        returnToMenuBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deleteEmployeeBtn.setText("Delete Employee");
        deleteEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Employee Menu");

        ediBtn.setText("Edit Employee");
        ediBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ediBtnActionPerformed(evt);
            }
        });

        returnToMenuBtn.setText("Return to Menu");
        returnToMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMenuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ediBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnToMenuBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(ediBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteEmployeeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addGap(18, 18, 18)
                .addComponent(returnToMenuBtn)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeBtnActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            Boolean successfulDeletion = deleteEmployee(currentUser);
            
            if (successfulDeletion)
            {
                JOptionPane.showMessageDialog(null,
                    "The employee " + currentUser + " has been deleted.\n "
                            + "You will now be taken to the login.",
                "Deleted",
                JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                    "Unable to delete user, please try again.\n",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_deleteEmployeeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        
        this.dispose();
        new LoginFrame().setVisible(true);
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void ediBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ediBtnActionPerformed
        
        this.dispose();
        new EditEmployeeFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_ediBtnActionPerformed

    private void returnToMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMenuBtnActionPerformed
        
        this.dispose();
        new OptionFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_returnToMenuBtnActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMenuFrame(currentUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteEmployeeBtn;
    private javax.swing.JButton ediBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton returnToMenuBtn;
    // End of variables declaration//GEN-END:variables

    private static Boolean deleteEmployee(java.lang.String username) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.deleteEmployee(username);
    }
}
