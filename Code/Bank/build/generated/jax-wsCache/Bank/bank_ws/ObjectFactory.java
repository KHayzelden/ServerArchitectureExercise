
package bank_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bank_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IOException_QNAME = new QName("http://bank_ws/", "IOException");
    private final static QName _DeleteCustomer_QNAME = new QName("http://bank_ws/", "deleteCustomer");
    private final static QName _GetNumberOfCustomers_QNAME = new QName("http://bank_ws/", "getNumberOfCustomers");
    private final static QName _GetNumberOfCustomersResponse_QNAME = new QName("http://bank_ws/", "getNumberOfCustomersResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://bank_ws/", "getCustomer");
    private final static QName _RegisterEmployee_QNAME = new QName("http://bank_ws/", "registerEmployee");
    private final static QName _DeleteEmployee_QNAME = new QName("http://bank_ws/", "deleteEmployee");
    private final static QName _RegisterCustomer_QNAME = new QName("http://bank_ws/", "registerCustomer");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://bank_ws/", "editCustomerResponse");
    private final static QName _UpdateCustomerFileResponse_QNAME = new QName("http://bank_ws/", "updateCustomerFileResponse");
    private final static QName _GetCustomerDetailsResponse_QNAME = new QName("http://bank_ws/", "getCustomerDetailsResponse");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://bank_ws/", "deleteEmployeeResponse");
    private final static QName _EmployeeLoginResponse_QNAME = new QName("http://bank_ws/", "employeeLoginResponse");
    private final static QName _GetCustomerDetails_QNAME = new QName("http://bank_ws/", "getCustomerDetails");
    private final static QName _GetEmployeeDetailsResponse_QNAME = new QName("http://bank_ws/", "getEmployeeDetailsResponse");
    private final static QName _RegisterCustomerResponse_QNAME = new QName("http://bank_ws/", "registerCustomerResponse");
    private final static QName _ReadCustomerFileResponse_QNAME = new QName("http://bank_ws/", "readCustomerFileResponse");
    private final static QName _RegisterEmployeeResponse_QNAME = new QName("http://bank_ws/", "registerEmployeeResponse");
    private final static QName _EditCustomer_QNAME = new QName("http://bank_ws/", "editCustomer");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://bank_ws/", "getCustomerResponse");
    private final static QName _ReadUsersFileResponse_QNAME = new QName("http://bank_ws/", "readUsersFileResponse");
    private final static QName _UpdateCustomerFile_QNAME = new QName("http://bank_ws/", "updateCustomerFile");
    private final static QName _ReadCustomerFile_QNAME = new QName("http://bank_ws/", "readCustomerFile");
    private final static QName _DeleteCustomerResponse_QNAME = new QName("http://bank_ws/", "deleteCustomerResponse");
    private final static QName _EmployeeLogin_QNAME = new QName("http://bank_ws/", "employeeLogin");
    private final static QName _GetEmployeeDetails_QNAME = new QName("http://bank_ws/", "getEmployeeDetails");
    private final static QName _EditEmployee_QNAME = new QName("http://bank_ws/", "editEmployee");
    private final static QName _EditEmployeeResponse_QNAME = new QName("http://bank_ws/", "editEmployeeResponse");
    private final static QName _ReadUsersFile_QNAME = new QName("http://bank_ws/", "readUsersFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bank_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link ReadUsersFileResponse }
     * 
     */
    public ReadUsersFileResponse createReadUsersFileResponse() {
        return new ReadUsersFileResponse();
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link RegisterEmployeeResponse }
     * 
     */
    public RegisterEmployeeResponse createRegisterEmployeeResponse() {
        return new RegisterEmployeeResponse();
    }

    /**
     * Create an instance of {@link ReadCustomerFileResponse }
     * 
     */
    public ReadCustomerFileResponse createReadCustomerFileResponse() {
        return new ReadCustomerFileResponse();
    }

    /**
     * Create an instance of {@link EmployeeLogin }
     * 
     */
    public EmployeeLogin createEmployeeLogin() {
        return new EmployeeLogin();
    }

    /**
     * Create an instance of {@link GetEmployeeDetails }
     * 
     */
    public GetEmployeeDetails createGetEmployeeDetails() {
        return new GetEmployeeDetails();
    }

    /**
     * Create an instance of {@link EditEmployee }
     * 
     */
    public EditEmployee createEditEmployee() {
        return new EditEmployee();
    }

    /**
     * Create an instance of {@link ReadUsersFile }
     * 
     */
    public ReadUsersFile createReadUsersFile() {
        return new ReadUsersFile();
    }

    /**
     * Create an instance of {@link EditEmployeeResponse }
     * 
     */
    public EditEmployeeResponse createEditEmployeeResponse() {
        return new EditEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomerFile }
     * 
     */
    public UpdateCustomerFile createUpdateCustomerFile() {
        return new UpdateCustomerFile();
    }

    /**
     * Create an instance of {@link ReadCustomerFile }
     * 
     */
    public ReadCustomerFile createReadCustomerFile() {
        return new ReadCustomerFile();
    }

    /**
     * Create an instance of {@link DeleteCustomerResponse }
     * 
     */
    public DeleteCustomerResponse createDeleteCustomerResponse() {
        return new DeleteCustomerResponse();
    }

    /**
     * Create an instance of {@link DeleteCustomer }
     * 
     */
    public DeleteCustomer createDeleteCustomer() {
        return new DeleteCustomer();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link GetNumberOfCustomers }
     * 
     */
    public GetNumberOfCustomers createGetNumberOfCustomers() {
        return new GetNumberOfCustomers();
    }

    /**
     * Create an instance of {@link GetNumberOfCustomersResponse }
     * 
     */
    public GetNumberOfCustomersResponse createGetNumberOfCustomersResponse() {
        return new GetNumberOfCustomersResponse();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link RegisterEmployee }
     * 
     */
    public RegisterEmployee createRegisterEmployee() {
        return new RegisterEmployee();
    }

    /**
     * Create an instance of {@link GetCustomerDetailsResponse }
     * 
     */
    public GetCustomerDetailsResponse createGetCustomerDetailsResponse() {
        return new GetCustomerDetailsResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeDetailsResponse }
     * 
     */
    public GetEmployeeDetailsResponse createGetEmployeeDetailsResponse() {
        return new GetEmployeeDetailsResponse();
    }

    /**
     * Create an instance of {@link EmployeeLoginResponse }
     * 
     */
    public EmployeeLoginResponse createEmployeeLoginResponse() {
        return new EmployeeLoginResponse();
    }

    /**
     * Create an instance of {@link GetCustomerDetails }
     * 
     */
    public GetCustomerDetails createGetCustomerDetails() {
        return new GetCustomerDetails();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link UpdateCustomerFileResponse }
     * 
     */
    public UpdateCustomerFileResponse createUpdateCustomerFileResponse() {
        return new UpdateCustomerFileResponse();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<IOException>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "deleteCustomer")
    public JAXBElement<DeleteCustomer> createDeleteCustomer(DeleteCustomer value) {
        return new JAXBElement<DeleteCustomer>(_DeleteCustomer_QNAME, DeleteCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getNumberOfCustomers")
    public JAXBElement<GetNumberOfCustomers> createGetNumberOfCustomers(GetNumberOfCustomers value) {
        return new JAXBElement<GetNumberOfCustomers>(_GetNumberOfCustomers_QNAME, GetNumberOfCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberOfCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getNumberOfCustomersResponse")
    public JAXBElement<GetNumberOfCustomersResponse> createGetNumberOfCustomersResponse(GetNumberOfCustomersResponse value) {
        return new JAXBElement<GetNumberOfCustomersResponse>(_GetNumberOfCustomersResponse_QNAME, GetNumberOfCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "registerEmployee")
    public JAXBElement<RegisterEmployee> createRegisterEmployee(RegisterEmployee value) {
        return new JAXBElement<RegisterEmployee>(_RegisterEmployee_QNAME, RegisterEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "registerCustomer")
    public JAXBElement<RegisterCustomer> createRegisterCustomer(RegisterCustomer value) {
        return new JAXBElement<RegisterCustomer>(_RegisterCustomer_QNAME, RegisterCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "editCustomerResponse")
    public JAXBElement<EditCustomerResponse> createEditCustomerResponse(EditCustomerResponse value) {
        return new JAXBElement<EditCustomerResponse>(_EditCustomerResponse_QNAME, EditCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "updateCustomerFileResponse")
    public JAXBElement<UpdateCustomerFileResponse> createUpdateCustomerFileResponse(UpdateCustomerFileResponse value) {
        return new JAXBElement<UpdateCustomerFileResponse>(_UpdateCustomerFileResponse_QNAME, UpdateCustomerFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getCustomerDetailsResponse")
    public JAXBElement<GetCustomerDetailsResponse> createGetCustomerDetailsResponse(GetCustomerDetailsResponse value) {
        return new JAXBElement<GetCustomerDetailsResponse>(_GetCustomerDetailsResponse_QNAME, GetCustomerDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "employeeLoginResponse")
    public JAXBElement<EmployeeLoginResponse> createEmployeeLoginResponse(EmployeeLoginResponse value) {
        return new JAXBElement<EmployeeLoginResponse>(_EmployeeLoginResponse_QNAME, EmployeeLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getCustomerDetails")
    public JAXBElement<GetCustomerDetails> createGetCustomerDetails(GetCustomerDetails value) {
        return new JAXBElement<GetCustomerDetails>(_GetCustomerDetails_QNAME, GetCustomerDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getEmployeeDetailsResponse")
    public JAXBElement<GetEmployeeDetailsResponse> createGetEmployeeDetailsResponse(GetEmployeeDetailsResponse value) {
        return new JAXBElement<GetEmployeeDetailsResponse>(_GetEmployeeDetailsResponse_QNAME, GetEmployeeDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "registerCustomerResponse")
    public JAXBElement<RegisterCustomerResponse> createRegisterCustomerResponse(RegisterCustomerResponse value) {
        return new JAXBElement<RegisterCustomerResponse>(_RegisterCustomerResponse_QNAME, RegisterCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCustomerFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "readCustomerFileResponse")
    public JAXBElement<ReadCustomerFileResponse> createReadCustomerFileResponse(ReadCustomerFileResponse value) {
        return new JAXBElement<ReadCustomerFileResponse>(_ReadCustomerFileResponse_QNAME, ReadCustomerFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "registerEmployeeResponse")
    public JAXBElement<RegisterEmployeeResponse> createRegisterEmployeeResponse(RegisterEmployeeResponse value) {
        return new JAXBElement<RegisterEmployeeResponse>(_RegisterEmployeeResponse_QNAME, RegisterEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "editCustomer")
    public JAXBElement<EditCustomer> createEditCustomer(EditCustomer value) {
        return new JAXBElement<EditCustomer>(_EditCustomer_QNAME, EditCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUsersFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "readUsersFileResponse")
    public JAXBElement<ReadUsersFileResponse> createReadUsersFileResponse(ReadUsersFileResponse value) {
        return new JAXBElement<ReadUsersFileResponse>(_ReadUsersFileResponse_QNAME, ReadUsersFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomerFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "updateCustomerFile")
    public JAXBElement<UpdateCustomerFile> createUpdateCustomerFile(UpdateCustomerFile value) {
        return new JAXBElement<UpdateCustomerFile>(_UpdateCustomerFile_QNAME, UpdateCustomerFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCustomerFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "readCustomerFile")
    public JAXBElement<ReadCustomerFile> createReadCustomerFile(ReadCustomerFile value) {
        return new JAXBElement<ReadCustomerFile>(_ReadCustomerFile_QNAME, ReadCustomerFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "deleteCustomerResponse")
    public JAXBElement<DeleteCustomerResponse> createDeleteCustomerResponse(DeleteCustomerResponse value) {
        return new JAXBElement<DeleteCustomerResponse>(_DeleteCustomerResponse_QNAME, DeleteCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "employeeLogin")
    public JAXBElement<EmployeeLogin> createEmployeeLogin(EmployeeLogin value) {
        return new JAXBElement<EmployeeLogin>(_EmployeeLogin_QNAME, EmployeeLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "getEmployeeDetails")
    public JAXBElement<GetEmployeeDetails> createGetEmployeeDetails(GetEmployeeDetails value) {
        return new JAXBElement<GetEmployeeDetails>(_GetEmployeeDetails_QNAME, GetEmployeeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "editEmployee")
    public JAXBElement<EditEmployee> createEditEmployee(EditEmployee value) {
        return new JAXBElement<EditEmployee>(_EditEmployee_QNAME, EditEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "editEmployeeResponse")
    public JAXBElement<EditEmployeeResponse> createEditEmployeeResponse(EditEmployeeResponse value) {
        return new JAXBElement<EditEmployeeResponse>(_EditEmployeeResponse_QNAME, EditEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadUsersFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bank_ws/", name = "readUsersFile")
    public JAXBElement<ReadUsersFile> createReadUsersFile(ReadUsersFile value) {
        return new JAXBElement<ReadUsersFile>(_ReadUsersFile_QNAME, ReadUsersFile.class, null, value);
    }

}
