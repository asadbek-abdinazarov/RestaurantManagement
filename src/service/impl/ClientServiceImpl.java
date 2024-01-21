package service.impl;

import been.Foods;
import been.Table;
import service.ClientService;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    @Override
    public String bookTable(Integer tableId, Integer clientId) {
        return null;
    }

    @Override
    public String bookFoods(Integer tableId, Integer clientId) {
        return null;
    }

    @Override
    public String showTable(List<Table> tables) {
        return null;
    }

    @Override
    public String showFoodsOfPrice(Foods foodPrice) {
        return null;
    }
}
