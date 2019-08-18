
package bank_ws;

public class Employee {
    
    String name, position, username, password;
    
    public void employee (String usernameTemp, String passwordTemp) {
    
        username = usernameTemp;
        password = passwordTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {

        return name + "," + 
               position + "," + 
               username + "," + 
               password ;
    }
    
}
