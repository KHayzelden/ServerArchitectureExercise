
package bank;

import javax.swing.JOptionPane;

public class CreateEmployeeFrame extends javax.swing.JFrame {

    public CreateEmployeeFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        employeeIdLabel = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        employeeNameLabel = new javax.swing.JLabel();
        employeePositionField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        homeBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("New Employee");

        employeeIdLabel.setText("Employee Name");

        employeeNameLabel.setText("Employee Position");

        usernameLabel.setText("Username");

        jLabel2.setText("Password");

        homeBtn.setText("Home Page");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeIdLabel)
                    .addComponent(employeeNameLabel)
                    .addComponent(usernameLabel)
                    .addComponent(jLabel2)
                    .addComponent(homeBtn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registerBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeePositionField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeIdLabel)
                    .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNameLabel)
                    .addComponent(employeePositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(homeBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        
        this.dispose();
        new LoginFrame().setVisible(true);
        
    }//GEN-LAST:event_homeBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        
        if (employeeNameField.getText().trim().isEmpty() || 
            employeePositionField.getText().trim().isEmpty() || 
            usernameField.getText().trim().isEmpty() || 
            passwordField.getPassword().length == 0)
        {  
            JOptionPane.showMessageDialog(null,
                    "Please fill in all fields.\n",
            "Error",
            JOptionPane.PLAIN_MESSAGE);
        }
        else
        { 
            String  tempName = employeeNameField.getText(),
                    tempPosition = employeePositionField.getText(),
                    tempUsername = usernameField.getText(),
                    tempPassword = new String (passwordField.getPassword());
                   
            
            Boolean acceptableName = tempName.matches("[a-zA-Z0-9 ]+");
            Boolean acceptablePosition = tempPosition.matches("[a-zA-Z0-9 ]+");
            Boolean acceptableUsername = tempUsername.matches("[a-zA-Z0-9]+");
            Boolean acceptablePassword = tempPassword.matches("[a-zA-Z0-9]+");
            
            if (acceptableName && acceptablePosition && acceptableUsername && acceptablePassword)
            {
                Boolean successfulRegistration = false;
                
                successfulRegistration = registerEmployee(tempName,
                                                          tempPosition,
                                                          tempUsername,
                                                          tempPassword);
                
                if(successfulRegistration)
                {
                    JOptionPane.showMessageDialog(null,
                        "Registration was successful, you may now login.\n",
                    "Error",
                    JOptionPane.PLAIN_MESSAGE);
                    
                    LoginFrame frame = new LoginFrame();
                    frame.setVisible(true);
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                        "Registration was unsuccessful, please try again.\n",
                    "Error",
                    JOptionPane.PLAIN_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                    "All fields can only contain numbers and letters, please try again.\n",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_registerBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel employeeIdLabel;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JTextField employeePositionField;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private static Boolean registerEmployee(java.lang.String newEmployeeName, java.lang.String newEmployeePosition, java.lang.String newEmployeeUsername, java.lang.String newEmployeePassword) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.registerEmployee(newEmployeeName, newEmployeePosition, newEmployeeUsername, newEmployeePassword);
    }
    
}
