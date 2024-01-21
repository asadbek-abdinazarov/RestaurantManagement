package been;

public class User extends BaseIdBeen{



    private String username;
    private String password;
    private Integer clientId;
    private double salary;

    public User() {
    }

    public User(String username, String password, double salary) {
        this.username = username;
        this.password = password;
        this.salary = salary;
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

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
