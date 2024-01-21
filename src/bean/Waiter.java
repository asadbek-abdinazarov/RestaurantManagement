package bean;

public class Waiter extends BaseIdBean{
    private String userName;
    private String password;
    private Integer clientId;
    private double salary;

    public Waiter() {
    }

    public Waiter(String userName, String password, Integer clientId, double salary) {
        this.userName = userName;
        this.password = password;
        this.clientId = clientId;
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
