package been;

import java.util.ArrayList;
import java.util.List;

public class Table extends BaseIdBeen{



    private int tableId;
    private int numberOfChairs;
    private int clientId;
    List<Foods> foods;

    public Table() {
    }

    public Table(int numberOfChairs, int clientId, List<Foods> foods) {
        this.numberOfChairs = numberOfChairs;
        this.clientId = clientId;
        this.foods = foods;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public List<Foods> getFoods() {
        return foods;
    }

    public void setFoods(List<Foods> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableId=" + tableId +
                ", numberOfChairs=" + numberOfChairs +
                ", clientId=" + clientId +
                ", foods=" + foods +
                '}';
    }
}
