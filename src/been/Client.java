package been;

public class Client extends BaseIdBeen{


    private int clientId;
    private String clientName;
    private String clientPassword;
    private int userId;
    private int tableId;
    private double balance;

    public Client() {
    }

    public Client(String clientName, String clientPassword,double balance) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
        this.balance = balance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientPassword='" + clientPassword + '\'' +
                ", userId=" + userId +
                ", tableId=" + tableId +
                ", balance=" + balance +
                '}';
    }
}
