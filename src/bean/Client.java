package bean;

public class Client extends BaseIdBean{
    private String clientName;
    private String clientPassword;
    private Integer userId;
    private Integer tableId;
    private double balance;

    public Client() {
    }

    public Client(String clientName, String clientPassword, Integer userId, Integer tableId, double balance) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
        this.userId = userId;
        this.tableId = tableId;
        this.balance = balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
