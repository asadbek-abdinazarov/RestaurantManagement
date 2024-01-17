package service;

import been.Foods;
import been.Table;

import java.util.List;

public interface ClientService {
    String bookTable(int tableId, int clientId);
    String bookFoods(int tableId, int clientId);
    String showTable(List<Table> tables);
    String showFoodsOfPrice(Foods foodPrice);

}
