
package bank_ws;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Bank")
public class Bank {

    static ArrayList<Employee> employees = new ArrayList<>();  //this is used to store the emploees
    static ArrayList<Customer> customers = new ArrayList<>();  //and customers read from their files
    static String userFilePath = "/Users/krishayzelden/Desktop/users.txt";
    static String customerFilePath = "/Users/krishayzelden/Desktop/customers.txt";
    
    //this service will check the username in the list of employees, which are a class
    //then .getPassword to compare the username with password and will return
    //false if they do not match
    @WebMethod(operationName = "employeeLogin")
    public Boolean employeeLogin(@WebParam(name = "employeeUsername") String employeeUsername, 
                                 @WebParam(name = "employeePassword") String employeePassword) {
        
        readUsersFile();
        
        boolean acceptedLogin = false;
        
        for (int i = 0 ; i < employees.size() ; i++)
        {
            if (employees.get(i).getUsername().equals(employeeUsername) &&
                employees.get(i).getPassword().equals(employeePassword))
            {
                acceptedLogin = true;
                
            }
        }
        
        return acceptedLogin;
    }
    
    //this is a method to read in the file from text form and use it to 
    //populate the employees arraylist
    public void readUsersFile() {
        
        employees.clear(); //this will reset the list
        
        try (BufferedReader reader = new BufferedReader(new FileReader(userFilePath)))
        {
            String line;

            while ((line = reader.readLine()) != null) 
            {
                String[] userDetails = line.split(",");

                Employee employee = new Employee();
                
                employee.setName(userDetails[0]);   
                employee.setPosition(userDetails[1]);
                employee.setUsername(userDetails[2]);
                employee.setPassword(userDetails[3]);

                employees.add(employee);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    //this will re write the employees arraylist
    //to the file to update the employees information or if one is registered or
    //deleted, it uses the employee class's toString overrride
    public static void updateUsersFile() throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(userFilePath));
        
        try
        {
            for ( int i = 0 ; i < employees.size() ; i++ )
            {
                writer.write(employees.get(i).toString());
                writer.newLine();
            }  
            
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    //this will take all the details for a new employee and will register
    //that employee provided that the username, which must be unique has
    //not been registered before, and will return an error if so
    @WebMethod(operationName = "registerEmployee")
    public Boolean registerEmployee(@WebParam(name = "newEmployeeName") String newEmployeeName, 
                                    @WebParam(name = "newEmployeePosition") String newEmployeePosition, 
                                    @WebParam(name = "newEmployeeUsername") String newEmployeeUsername, 
                                    @WebParam(name = "newEmployeePassword") String newEmployeePassword) {
        
        readUsersFile();
        
        Boolean acceptableNewUser = true;
        
        for ( int i=0 ; i < employees.size() ; i++ )
        {
            if (employees.get(i).getUsername().equals(newEmployeeUsername))
            {
                acceptableNewUser = false;
            }
        }
        
        if (acceptableNewUser)
        {
            Employee newEmployee = new Employee();
            
            newEmployee.setName(newEmployeeName);
            newEmployee.setPosition(newEmployeePosition);
            newEmployee.setUsername(newEmployeeUsername);
            newEmployee.setPassword(newEmployeePassword);
            
            employees.add(newEmployee);
            
            try 
            {
                updateUsersFile();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return acceptableNewUser;
    }
    
    //this takes in the original employee username in order to find the 
    //employee to edit, then updates any information for that employee
    //and updates the arraylist and file
    public boolean editEmployee(@WebParam(name = "originalEmployeeUsername") String originalEmployeeUsername, 
                                @WebParam(name = "employeeName") String employeeName, 
                                @WebParam(name = "employeePosition") String employeePosition, 
                                @WebParam(name = "employeeUsername") String employeeUsername, 
                                @WebParam(name = "employeePassword") String employeePassword) {
        
        readUsersFile();
        
        Boolean successfulUpdate = true;
        
        for ( int i = 0 ; i < employees.size() ; i++ )
        {
            if (employees.get(i).getUsername().equals(originalEmployeeUsername))
            {
                employees.get(i).setName(employeeName);
                employees.get(i).setPosition(employeePosition);
                employees.get(i).setUsername(employeeUsername);
                employees.get(i).setPassword(employeePassword);
            }
        }

        try 
        {
            updateUsersFile();
        } 
        catch (IOException ex) 
        {
            successfulUpdate = false;
        }
        
        return successfulUpdate;
    }

    //this will return the employee's details as a string
    //which can be split on the client end
    @WebMethod(operationName = "getEmployeeDetails")
    public String getEmployeeDetails(@WebParam(name = "employeeUsername") final String employeeUsername) {
        
        String employeeDetails = "" ;
        
        readUsersFile();
        
        for ( int i = 0 ; i < employees.size() ; i++ )
        {
            if (employees.get(i).getUsername().equals(employeeUsername))
            {
                employeeDetails = employees.get(i).toString();
            }
        }
        
        return employeeDetails;    
    }

    //this will read the customer file using a customer class
    //and adding them to an arraylist customers
    public void readCustomerFile () {
        
        customers.clear();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(customerFilePath)))
        {
            String line;

            while ((line = reader.readLine()) != null) 
            {
                String[] customerDetails = line.split(",");

                Customer customer = new Customer();
                
                customer.setName(customerDetails[0]);   
                customer.setBirthday(customerDetails[1]);
                customer.setAddress(customerDetails[2]);
                customer.setMobile(customerDetails[3]);
                customer.setEmail(customerDetails[4]);   
                customer.setAccountType(customerDetails[5]);
                customer.setAccountNumber(customerDetails[6]);
                customer.setSortCode(customerDetails[7]);
                customer.setBalance(customerDetails[8]);   
                customer.setCardNumber(customerDetails[9]);

                customers.add(customer);
            }
            reader.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    //this will re write the customer file to update
    //if a customer has been deleted or edited or registered
    public void updateCustomerFile () throws IOException {
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(customerFilePath));
        
        try
        {
            for ( int i = 0 ; i < customers.size() ; i++ )
            {
                writer.write(customers.get(i).toString());
                writer.newLine();
            }  
            
            writer.flush();
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }

    //this will return the number of customers, used for the client side 
    //when making the table
    @WebMethod(operationName = "getNumberOfCustomers")
    public int getNumberOfCustomers() {
        
        int numberOfCustomers = 0;
        
        readCustomerFile();
        
        for ( int i = 0 ; i < customers.size() ; i++ )
        {
            numberOfCustomers++ ;
        }
        
        return numberOfCustomers;
        
    }

    //this returns an individual customer's details using the
    //customer class's methods into a string that can be split on the client side
    @WebMethod(operationName = "getCustomer")
    public String getCustomer(@WebParam(name = "number") int number) {
        
        readCustomerFile();
        
        String customer = "";
        
        customer = customers.get(number).getName() + "," + 
                    customers.get(number).getBirthday() + "," + 
                    customers.get(number).getAddress() + "," + 
                    customers.get(number).getMobile() + "," + 
                    customers.get(number).getEmail() + "," + 
                    customers.get(number).getAccountType() + "," + 
                    customers.get(number).getAccountNumber() + "," + 
                    customers.get(number).getSortCode() + "," + 
                    customers.get(number).getBalance() + "," +
                    customers.get(number).getCardNumber();
        
        return customer;
    }

    //this will take the username of the employee and remove it from
    //the arraylist and update the txt file
    @WebMethod(operationName = "deleteEmployee")
    public Boolean deleteEmployee(@WebParam(name = "username") String username) {

        Boolean successfulDelete = false;
        
        for ( int i = 0 ; i < employees.size(); i++ )
        {
            if (employees.get(i).getUsername().equals(username))
            {
                employees.remove(i);
                successfulDelete = true;
                break;
            }
        }
        
        try 
        {
            updateUsersFile();
        } 
        catch (IOException ex) 
        {
            successfulDelete = false;
        }
        
        return successfulDelete;
    }

    //this will use the original account number of the customer
    //as this is unique, to identify the customer
    //then edit it's details and update the arraylist and file
    @WebMethod(operationName = "editCustomer")
    public Boolean editCustomer(@WebParam(name = "originalAccountNumber") String originalAccountNumber,
                                @WebParam(name = "newCustomerAccountNumber") String newCustomerAccountNumber,
                                @WebParam(name = "newCustomerName") String newCustomerName, 
                                @WebParam(name = "newCustomerBirthday") String newCustomerBirthday, 
                                @WebParam(name = "newCustomerAddress") String newCustomerAddress, 
                                @WebParam(name = "newCustomerMobile") String newCustomerMobile, 
                                @WebParam(name = "newCustomerEmail") String newCustomerEmail, 
                                @WebParam(name = "newCustomerAccountType") String newCustomerAccountType, 
                                @WebParam(name = "newCustomerSortCode") String newCustomerSortCode, 
                                @WebParam(name = "newCustomerBalance") String newCustomerBalance, 
                                @WebParam(name = "newCustomerCardNumber") String newCustomerCardNumber) {
        
        readCustomerFile();
        
        Boolean successfulUpdate = true;
        
        for ( int i = 0 ; i < customers.size() ; i++ )
        {
            if (customers.get(i).getAccountNumber().equals(originalAccountNumber))
            {
                customers.get(i).setName(newCustomerName);
                customers.get(i).setBirthday(newCustomerBirthday);
                customers.get(i).setAddress(newCustomerAddress);
                customers.get(i).setMobile(newCustomerMobile);
                customers.get(i).setEmail(newCustomerEmail);
                customers.get(i).setAccountType(newCustomerAccountType);
                customers.get(i).setAccountNumber(newCustomerAccountNumber);
                customers.get(i).setSortCode(newCustomerSortCode);
                customers.get(i).setBalance(newCustomerBalance);
                customers.get(i).setCardNumber(newCustomerCardNumber);
            }
        }

        try 
        {
            updateCustomerFile();
        } 
        catch (IOException ex) 
        {
            successfulUpdate = false;
        }
        
        return successfulUpdate;
    }

    //this will register a new customer
    //as long as the customer's account number is unique, otherwise
    //it will return false as it must be unique
    //and then if successful it will update the customer array and file
    @WebMethod(operationName = "registerCustomer")
    public Boolean registerCustomer(@WebParam(name = "customerName") String customerName, 
                                    @WebParam(name = "customerBirthday") String customerBirthday, 
                                    @WebParam(name = "customerAddress") String customerAddress, 
                                    @WebParam(name = "customerMobile") String customerMobile, 
                                    @WebParam(name = "customerEmail") String customerEmail, 
                                    @WebParam(name = "customerAccountType") String customerAccountType, 
                                    @WebParam(name = "customerAccountNumber") String customerAccountNumber, 
                                    @WebParam(name = "customerSortCode") String customerSortCode, 
                                    @WebParam(name = "customerBalance") String customerBalance, 
                                    @WebParam(name = "customerCardNumber") String customerCardNumber) {
        
        Boolean acceptableNewCustomer = true;
        
        readCustomerFile();
        
        for ( int i=0 ; i < customers.size() ; i++ )
        {
            if (customers.get(i).getAccountNumber().equals(customerAccountNumber))
            {
                acceptableNewCustomer = false;
            }
        }
        
        if(acceptableNewCustomer)
        {
            Customer newCustomer = new Customer();
            
            newCustomer.setName(customerName);
            newCustomer.setBirthday(customerBirthday);
            newCustomer.setAddress(customerAddress);
            newCustomer.setMobile(customerMobile);
            newCustomer.setEmail(customerEmail);
            newCustomer.setAccountType(customerAccountType);
            newCustomer.setAccountNumber(customerAccountNumber);
            newCustomer.setSortCode(customerSortCode);
            newCustomer.setBalance(customerBalance);
            newCustomer.setCardNumber(customerCardNumber);
            
            customers.add(newCustomer);
            
            try 
            {
                updateCustomerFile();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return acceptableNewCustomer;
    }

    //this searches the array for a specific customer and 
    //will return a string that can be split on the client side
    @WebMethod(operationName = "getCustomerDetails")
    public String getCustomerDetails(@WebParam(name = "customerNumber") String customerNumber) {
        
        String customerDetails = "" ;
        
        readCustomerFile();
        
        for ( int i = 0 ; i < customers.size() ; i++ )
        {
            if (customers.get(i).getAccountNumber().equals(customerNumber))
            {
                customerDetails = customers.get(i).toString();
            }
        }
        
        return customerDetails;
    }

    //this will search for the specifc customer and remove them
    //from the arraylist and update the file
    @WebMethod(operationName = "deleteCustomer")
    public Boolean deleteCustomer(@WebParam(name = "customerNumber") String customerNumber) {
        
        Boolean successfulDelete = false;
        
        for ( int i = 0 ; i < customers.size(); i++ )
        {
            if (customers.get(i).getAccountNumber().equals(customerNumber))
            {
                customers.remove(i);
                successfulDelete = true;
                break;
            }
        }
        
        try 
        {
            updateCustomerFile();
        } 
        catch (IOException ex) 
        {
            successfulDelete = false;
        }
        
        return successfulDelete;
    }
}
