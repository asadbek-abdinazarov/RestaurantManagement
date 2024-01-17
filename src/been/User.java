package been;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseIdBeen{



    private int userId;
    private String username;
    private String password;
    private int clientId;
    private double salary;

    public User() {
    }

    public User(String username, String password, double salary) {
        this.username = username;
        this.password = password;
        this.salary = salary;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", clientId=" + clientId +
                ", salary=" + salary +
                '}';
    }
}
