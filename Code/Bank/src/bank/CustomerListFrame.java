
package bank;

import static bank.EmployeeMenuFrame.currentUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerListFrame extends javax.swing.JFrame {

    ArrayList<Customer> customers = new ArrayList<>();
    
    static String currentUser = "";
    
    DefaultTableModel model;
    
    public CustomerListFrame(String currentUserTemp) {
        initComponents();
        currentUser = currentUserTemp;
        
        int numberOfCustomers = getNumberOfCustomers();
        
        for (int i = 0 ; i < numberOfCustomers ; i++ )
        {
            String line = getCustomer(i);
            
            String[] temporaryCustomerString = line.split(",");
            
            Customer temporaryCustomer = new Customer();
            
            temporaryCustomer.setName(temporaryCustomerString[0]);
            temporaryCustomer.setBirthday(temporaryCustomerString[1]);
            temporaryCustomer.setAddress(temporaryCustomerString[2]);
            temporaryCustomer.setMobile(temporaryCustomerString[3]);
            temporaryCustomer.setEmail(temporaryCustomerString[4]);
            temporaryCustomer.setAccountType(temporaryCustomerString[5]);
            temporaryCustomer.setAccountNumber(temporaryCustomerString[6]);
            temporaryCustomer.setSortCode(temporaryCustomerString[7]);
            temporaryCustomer.setBalance(temporaryCustomerString[8]);
            temporaryCustomer.setCardNumber(temporaryCustomerString[9]);
            
            customers.add(temporaryCustomer);
        }
        
        createTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customerListTable = new javax.swing.JTable();
        createCustomerBtn = new javax.swing.JButton();
        editCustomerBtn = new javax.swing.JButton();
        menuBtn = new javax.swing.JButton();
        deleteCustomerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Account Number", "Name", "DOB", "Address", "Mobile", "Email", "Account Type", "Sort Code", "Balance", "Card Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerListTable);

        createCustomerBtn.setText("Create New Customer");
        createCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerBtnActionPerformed(evt);
            }
        });

        editCustomerBtn.setText("Edit Customer");
        editCustomerBtn.setToolTipText("");
        editCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerBtnActionPerformed(evt);
            }
        });

        menuBtn.setText("Return to Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        deleteCustomerBtn.setText("Delete Customer");
        deleteCustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createCustomerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteCustomerBtn)
                        .addGap(12, 12, 12)
                        .addComponent(editCustomerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCustomerBtn)
                    .addComponent(editCustomerBtn)
                    .addComponent(menuBtn)
                    .addComponent(deleteCustomerBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerBtnActionPerformed
        
        this.dispose();
        new CreateCustomerFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_createCustomerBtnActionPerformed

    private void deleteCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerBtnActionPerformed
        
        int selectedCustomer = customerListTable.getSelectedRow();
        int accountNumberColumn = 0; //always the case for account number
        
        String customerNumber = (String) customerListTable.getModel().getValueAt(selectedCustomer, accountNumberColumn);
        
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
        {
            Boolean successfulDeletion = deleteCustomer(customerNumber);
            
            if (successfulDeletion)
            {
                JOptionPane.showMessageDialog(null,
                    "The customer #" + customerNumber + " has been deleted.\n ",
                "Deleted",
                JOptionPane.PLAIN_MESSAGE);
                
                this.dispose();
                new CustomerListFrame(currentUser).setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                    "Unable to delete customer, please try again.\n",
                "Error",
                JOptionPane.PLAIN_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_deleteCustomerBtnActionPerformed

    private void editCustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerBtnActionPerformed
        
        int selectedCustomer = customerListTable.getSelectedRow();
        int accountNumberColumn = 0; //always the case for account number
        
        String customerNumber = (String) customerListTable.getModel().getValueAt(selectedCustomer, accountNumberColumn);
                
        this.dispose();
        new EditCustomerFrame(currentUser,customerNumber).setVisible(true);
        
    }//GEN-LAST:event_editCustomerBtnActionPerformed

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        
        this.dispose();
        new OptionFrame(currentUser).setVisible(true);
        
    }//GEN-LAST:event_menuBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerListFrame(currentUser).setVisible(true);
            }
        });
    }
    
    public void createTable(){
        
        model = (DefaultTableModel) customerListTable.getModel();
        
        model.setRowCount(0);
        
        for (int i = 0; i < customers.size() ; i++)
        {
            String customerAccountNumber = customers.get(i).getAccountNumber();
            String customerName = customers.get(i).getName();
            String customerDOB = customers.get(i).getBirthday();
            String customerAddress = customers.get(i).getAddress();
            String customerMobile = customers.get(i).getMobile();
            String customerEmail = customers.get(i).getEmail();
            String customerAccountType = customers.get(i).getAccountType();
            String customerSortCode = customers.get(i).getSortCode();
            String customerBalance = customers.get(i).getBalance();
            String customersCardNumber = customers.get(i).getCardNumber();
            
            model.addRow(new Object[]{
                customerAccountNumber,
                customerName, 
                customerDOB,
                customerAddress,
                customerMobile,
                customerEmail,
                customerAccountType,
                customerSortCode,
                customerBalance,
                customersCardNumber
            });
        }
        
        customerListTable.setModel(model);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCustomerBtn;
    private javax.swing.JTable customerListTable;
    private javax.swing.JButton deleteCustomerBtn;
    private javax.swing.JButton editCustomerBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton menuBtn;
    // End of variables declaration//GEN-END:variables

    private static int getNumberOfCustomers() {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.getNumberOfCustomers();
    }

    private static String getCustomer(int number) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.getCustomer(number);
    }

    private static Boolean deleteCustomer(java.lang.String customerNumber) {
        bank_ws.Bank_Service service = new bank_ws.Bank_Service();
        bank_ws.Bank port = service.getBankPort();
        return port.deleteCustomer(customerNumber);
    }
}
