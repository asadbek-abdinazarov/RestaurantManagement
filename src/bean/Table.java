package bean;

public class Table extends BaseIdBean{


    private Integer numberOfChairs;
    private Integer clientId;

    public Table() {
    }

    public Table(Integer numberOfChairs, Integer clientId) {
        this.numberOfChairs = numberOfChairs;
        this.clientId = clientId;
    }

    public Integer getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(Integer numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}
