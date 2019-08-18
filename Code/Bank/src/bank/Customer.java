
package bank;

public class Customer {
    
    String name, birthday, address, mobile, email, accountType, accountNumber,
           sortCode, balance, cardNumber;
    
    public void customer (String nameTemp, 
                          String birthdayTemp, 
                          String addressTemp, 
                          String mobileTemp, 
                          String emailTemp, 
                          String accountTypeTemp, 
                          String accountNumberTemp, 
                          String sortCodeTemp, 
                          String balanceTemp, 
                          String cardNumberTemp)
    {
        name = nameTemp;
        birthday = birthdayTemp;
        address = addressTemp;
        mobile = mobileTemp;
        email = emailTemp;
        accountType = accountTypeTemp;
        accountNumber = accountNumberTemp;
        sortCode = sortCodeTemp;
        balance = balanceTemp;
        cardNumber = cardNumberTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
}
