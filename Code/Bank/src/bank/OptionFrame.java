
package bank;

public class OptionFrame extends javax.swing.JFrame {

    static String currentUser = "" ;
    
    public OptionFrame(String currentUserTemp) {
        initComponents();
        currentUser = currentUserTemp;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeePageBtn = new javax.swing.JButton();
        customerListBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        employeePageBtn.setText("Employee Page");
        employeePageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePageBtnActionPerformed(evt);
            }
        });

        customerListBtn.setText("Customer List");
        customerListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerListBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Please choose where you would like to go.");

        logoutBtn.setText("Log Out");
        logoutBtn.setName(""); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employeePageBtn)
                            .addComponent(customerListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(employeePageBtn)
                .addGap(18, 18, 18)
                .addComponent(customerListBtn)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeePageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePageBtnActionPerformed
        
        this.dispose();
        new EmployeeMenuFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_employeePageBtnActionPerformed

    private void customerListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerListBtnActionPerformed
        
        this.dispose();
        //new CustomerListFrame(currentUser).setVisible(true);
        new CustomerListFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_customerListBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        
        this.dispose();
        new LoginFrame().setVisible(true);
        
    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionFrame(currentUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerListBtn;
    private javax.swing.JButton employeePageBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
