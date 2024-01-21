package been;

import java.util.List;

public class Table extends BaseIdBeen{

    private Integer numberOfChairs;
    private Integer clientId;
    List<Foods> foods;

    public Table() {
    }

    public Table(int numberOfChairs, int clientId, List<Foods> foods) {
        this.numberOfChairs = numberOfChairs;
        this.clientId = clientId;
        this.foods = foods;
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

    public List<Foods> getFoods() {
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }
}
