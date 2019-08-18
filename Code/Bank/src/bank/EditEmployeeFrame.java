
package bank;

import javax.swing.JOptionPane;

public class EditEmployeeFrame extends javax.swing.JFrame {

    static String currentUser = "" ;
    
    String name = "", position = "", username = "", password = "";
    
    public EditEmployeeFrame(String currentUserTemp) {
        initComponents();
        
        currentUser = currentUserTemp;

        String employeeDetails = getEmployeeDetails(currentUserTemp);
        
        String[] userDetails = employeeDetails.split(",");

        name = userDetails[0];
        position = userDetails[1];
        username = userDetails[2];
        password = userDetails[3];
        
        employeeNameField.setText(name);
        employeePositionField.setText(position);
        usernameField.setText(currentUser);
        passwordField.setText(password);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        employeePositionLabel = new javax.swing.JLabel();
        employeePositionField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Edit Employee");

        employeeNameLabel.setText("Employee Name");

        employeePositionLabel.setText("Employee Position");

        passwordLabel.setText("Password");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        usernameLabel.setText("Username");
        usernameLabel.setToolTipText("");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeNameLabel)
                                    .addComponent(employeePositionLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(employeePositionField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(employeeNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordField))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNameLabel)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeePositionLabel)
                    .addComponent(employeePositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(backBtn))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        name = employeeNameField.getText();
        position = employeePositionField.getText();
        username = usernameField.getText();
        password = new String (passwordField.getPassword());
 
        boolean successfulEdit = editEmployee(currentUser,name,position,username,password);
        
        if (successfulEdit)
        {
            JOptionPane.showMessageDialog(null,
                    "The user details have been updated.\nYou will need to log back in.",
                "Done",
                JOptionPane.PLAIN_MESSAGE);
            
            this.dispose();
            new LoginFrame().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "The edit was unsuccessful, please try again.",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        this.dispose();
        new EmployeeMenuFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeFrame(currentUser).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JTextField employeePositionField;
    private javax.swing.JLabel employeePositionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private static String getEmployeeDetails(java.lang.String employeeUsername) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.getEmployeeDetails(employeeUsername);
    }

    private static boolean editEmployee(java.lang.String originalEmployeeUsername, java.lang.String employeeName, java.lang.String employeePosition, java.lang.String employeeUsername, java.lang.String employeePassword) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.editEmployee(originalEmployeeUsername, employeeName, employeePosition, employeeUsername, employeePassword);
    }
}
