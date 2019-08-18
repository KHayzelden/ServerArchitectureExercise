
package bank;

import javax.swing.JOptionPane;

public class CreateCustomerFrame extends javax.swing.JFrame {

    static String currentUser = "";
    
    public CreateCustomerFrame(String currentUserTemp) {
        initComponents();
        currentUser = currentUserTemp;
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
        sortCodeLabel = new javax.swing.JLabel();
        balanceField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        createCustomerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        balanceLable1 = new javax.swing.JLabel();
        sortCodeField = new javax.swing.JTextField();
        cardNumberLabel = new javax.swing.JLabel();
        cardNumberField = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLable.setText("Name");

        dobLable.setText("Date Of Birth");

        addressLable.setText("Address");

        MobileLable.setText("Mobile");

        emailAdressLable.setText("Email Address");

        accountTypeLable.setText("Account Type");

        accountNumberLable.setText("Account Number");

        sortCodeLabel.setText("Sort Code");

        jLabel10.setText("Create Customer Account");

        createCustomerBtn.setText("Create Customer");
        createCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        balanceLable1.setText("Balance");

        cardNumberLabel.setText("Card Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(balanceLable1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLable)
                            .addComponent(dobLable)
                            .addComponent(addressLable)
                            .addComponent(emailAdressLable)
                            .addComponent(MobileLable)
                            .addComponent(accountTypeLable)
                            .addComponent(accountNumberLable)
                            .addComponent(sortCodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField)
                            .addComponent(dateOfBirthField)
                            .addComponent(addressField)
                            .addComponent(mobileField)
                            .addComponent(emailField)
                            .addComponent(accountTypeField)
                            .addComponent(accountNumberField)
                            .addComponent(sortCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createCustomerBtn)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLable)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MobileLable))
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
                    .addComponent(sortCodeLabel)
                    .addComponent(sortCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceLable1)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardNumberLabel)
                    .addComponent(cardNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(createCustomerBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerBtnActionPerformed
        
        if (nameField.getText().trim().isEmpty() || 
            dateOfBirthField.getText().trim().isEmpty() || 
            addressField.getText().trim().isEmpty() ||
            mobileField.getText().trim().isEmpty() || 
            emailField.getText().trim().isEmpty() || 
            accountTypeField.getText().trim().isEmpty() ||
            accountNumberField.getText().trim().isEmpty() || 
            sortCodeField.getText().trim().isEmpty() || 
            balanceField.getText().trim().isEmpty() ||
            cardNumberField.getText().trim().isEmpty())
        {  
            JOptionPane.showMessageDialog(null,
                    "Please fill in all fields.\n",
            "Error",
            JOptionPane.PLAIN_MESSAGE);
        }
        else
        { 
            String  name = nameField.getText(),
                    dateOfBirth = dateOfBirthField.getText(),
                    address = addressField.getText(),
                    mobile = mobileField.getText(), 
                    email = emailField.getText(),
                    accountType = accountTypeField.getText(),
                    accountNumber = accountNumberField.getText(),
                    sortCode = sortCodeField.getText(), 
                    balance = balanceField.getText(),
                    cardNumber = cardNumberField.getText();
                   
            
            Boolean acceptableName = name.matches("[a-zA-Z ]+");
            Boolean acceptableDateOfBirth = dateOfBirth.matches("[//0-9]+");
            Boolean acceptableAddress = address.matches("[a-zA-Z0-9 ]+");
            Boolean acceptableMobile = mobile.matches("[0-9]+");
            Boolean acceptableEmail = email.matches("[a-zA-Z0-9@_.]+");
            Boolean acceptableAccountType = accountType.matches("[a-zA-Z0-9]+");
            Boolean acceptableAccountNumber = accountNumber.matches("[0-9]+");
            Boolean acceptableSortCode = sortCode.matches("[0-9]+");
            Boolean acceptableBalance = balance.matches("[.0-9]+");
            Boolean acceptableCardNumber = cardNumber.matches("[0-9]+");
            
            if (acceptableName && 
                acceptableDateOfBirth && 
                acceptableAddress && 
                acceptableMobile &&
                acceptableEmail && 
                acceptableAccountType && 
                acceptableAccountNumber && 
                acceptableSortCode &&
                acceptableBalance && 
                acceptableCardNumber)
            {
                Boolean successfulRegistration = false;
                
                successfulRegistration = registerCustomer(name,
                                                          dateOfBirth,
                                                          address,
                                                          mobile, 
                                                          email,
                                                          accountType,
                                                          accountNumber,
                                                          sortCode, 
                                                          balance,
                                                          cardNumber);
                
                if(successfulRegistration)
                {
                    JOptionPane.showMessageDialog(null,
                        "Registration was successful\n",
                    "Error",
                    JOptionPane.PLAIN_MESSAGE);
                    
                    this.dispose();
                    new CustomerListFrame(currentUser).setVisible(true);
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
                    "All fields can only contain numbers, \".\"'s, and letters\n except email which may contain \"@\"\n"
                            + "and \"_\". Please try again.\n",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_createCustomerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        
        this.dispose();
        new CustomerListFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_backBtnActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateCustomerFrame(currentUser).setVisible(true);
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
    private javax.swing.JLabel balanceLable1;
    private javax.swing.JTextField cardNumberField;
    private javax.swing.JLabel cardNumberLabel;
    private javax.swing.JButton createCustomerBtn;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JLabel dobLable;
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

    private static Boolean registerCustomer(java.lang.String customerName, java.lang.String customerBirthday, java.lang.String customerAddress, java.lang.String customerMobile, java.lang.String customerEmail, java.lang.String customerAccountType, java.lang.String customerAccountNumber, java.lang.String customerSortCode, java.lang.String customerBalance, java.lang.String customerCardNumber) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.registerCustomer(customerName, customerBirthday, customerAddress, customerMobile, customerEmail, customerAccountType, customerAccountNumber, customerSortCode, customerBalance, customerCardNumber);
    }
}
