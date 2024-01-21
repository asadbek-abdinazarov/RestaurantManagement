package service;

import been.Foods;
import been.Table;

import java.util.List;

public interface ClientService {
    String bookTable(Integer tableId, Integer clientId);
    String bookFoods(Integer tableId, Integer clientId);
    String showTable(List<Table> tables);
    String showFoodsOfPrice(Foods foodPrice);

}
