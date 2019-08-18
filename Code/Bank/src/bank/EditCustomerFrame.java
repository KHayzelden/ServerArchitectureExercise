
package bank;

import javax.swing.JOptionPane;

public class EditCustomerFrame extends javax.swing.JFrame {

    static String currentUser = "";
    static String customerNumber = "";
    
    String accountNumber = "", name = "", dob = "", address = "", mobile = "", 
           email = "", accountType = "", sortCode = "", balance = "", cardNumber = "";
    
    public EditCustomerFrame(String currentUserTemp, String customerNumberTemp) {
        initComponents();
        
        currentUser = currentUserTemp;
        customerNumber = customerNumberTemp;

        String customerDetailsString = getCustomerDetails(customerNumber);
        
        String[] customerDetails = customerDetailsString.split(",");

        name = customerDetails[0];
        dob = customerDetails[1];
        address = customerDetails[2];
        mobile = customerDetails[3];
        email = customerDetails[4];
        accountType = customerDetails[5];
        accountNumber = customerDetails[6];
        sortCode = customerDetails[7];
        balance = customerDetails[8];
        cardNumber = customerDetails[9];
        
        accountNumberField.setText(accountNumber);
        nameField.setText(name);
        dateOfBirthField.setText(dob);
        addressField.setText(address);
        mobileField.setText(mobile);
        emailField.setText(email);
        accountTypeField.setText(accountType);
        sortCodeField.setText(sortCode);
        balanceField.setText(balance);
        cardNumberField.setText(cardNumber);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        nameLable = new javax.swing.JLabel();
        dobLable = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        dateOfBirthField = new javax.swing.JTextField();
        addressLable = new javax.swing.JLabel();
        MobileLable = new javax.swing.JLabel();
        emailAdressLable = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        accountTypeLable = new javax.swing.JLabel();
        accountTypeField = new javax.swing.JTextField();
        accountNumberLable = new javax.swing.JLabel();
        accountNumberField = new javax.swing.JTextField();
        balanceLable = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sortCodeLabel = new javax.swing.JLabel();
        sortCodeField = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nameLable.setText("Name");

        dobLable.setText("Date Of Birth");

        addressLable.setText("Address");

        MobileLable.setText("Mobile");

        emailAdressLable.setText("Email Address");

        accountTypeLable.setText("Account Type");

        accountNumberLable.setText("Account Number");

        balanceLable.setText("Balance");

        jLabel10.setText("Customer Accounts Page ");

        sortCodeLabel.setText("Sort Code");

        cardNumberLabel.setText("Card Number");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Make Changes");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameLable)
                                        .addComponent(dobLable)
                                        .addComponent(addressLable)
                                        .addComponent(emailAdressLable)
                                        .addComponent(MobileLable)
                                        .addComponent(accountTypeLable)
                                        .addComponent(accountNumberLable)
                                        .addComponent(balanceLable))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(sortCodeLabel)
                                    .addGap(88, 88, 88)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cardNumberLabel)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sortCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(nameField)
                            .addComponent(dateOfBirthField)
                            .addComponent(addressField)
                            .addComponent(mobileField)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(accountTypeField)
                            .addComponent(accountNumberField)
                            .addComponent(balanceField)
                            .addComponent(cardNumberField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(editBtn)))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLable)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLable)
                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLable)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MobileLable)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAdressLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountTypeLable)
                    .addComponent(accountTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNumberLable)
                    .addComponent(accountNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLable)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortCodeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberLabel)
                    .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(editBtn))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        this.dispose();
        new CustomerListFrame(currentUser).setVisible(true);

    }//GEN-LAST:event_backBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        
        accountNumber = accountNumberField.getText();
        name = nameField.getText();
        dob = dateOfBirthField.getText();
        address = addressField.getText();
        mobile = mobileField.getText();
        email = emailField.getText();
        accountType = accountTypeField.getText();
        sortCode = sortCodeField.getText();
        balance = balanceField.getText();
        cardNumber = cardNumberField.getText();
 
        boolean successfulEdit = editCustomer(customerNumber,
                                              accountNumber,
                                              name,
                                              dob,
                                              address,
                                              mobile,
                                              email,
                                              accountType,
                                              sortCode,
                                              balance,
                                              cardNumber);
        
        if (successfulEdit)
        {
            JOptionPane.showMessageDialog(null,
                    "The customer's details have been updated.\n",
                "Done",
                JOptionPane.PLAIN_MESSAGE);
            
            this.dispose();
            new CustomerListFrame(currentUser).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,
                    "The edit was unsuccessful, please try again.",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_editBtnActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomerFrame(currentUser,customerNumber).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MobileLable;
    private javax.swing.JTextField accountNumberField;
    private javax.swing.JLabel accountNumberLable;
    private javax.swing.JTextField accountTypeField;
    private javax.swing.JLabel accountTypeLable;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLable;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLable;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JLabel dobLable;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailAdressLable;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField sortCodeField;
    private javax.swing.JLabel sortCodeLabel;
    // End of variables declaration//GEN-END:variables

    private static String getCustomerDetails(java.lang.String customerNumber) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.getCustomerDetails(customerNumber);
    }

    private static Boolean editCustomer(java.lang.String originalAccountNumber, java.lang.String newCustomerAccountNumber, java.lang.String newCustomerName, java.lang.String newCustomerBirthday, java.lang.String newCustomerAddress, java.lang.String newCustomerMobile, java.lang.String newCustomerEmail, java.lang.String newCustomerAccountType, java.lang.String newCustomerSortCode, java.lang.String newCustomerBalance, java.lang.String newCustomerCardNumber) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.editCustomer(originalAccountNumber, newCustomerAccountNumber, newCustomerName, newCustomerBirthday, newCustomerAddress, newCustomerMobile, newCustomerEmail, newCustomerAccountType, newCustomerSortCode, newCustomerBalance, newCustomerCardNumber);
    }
}
