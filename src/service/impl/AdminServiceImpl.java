package service.impl;

import api.ApiResponse;
import bean.Foods;
import bean.Table;
import bean.Waiter;
import enums.Person;
import service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {

    private Person person;

    private Integer index = 0;

    @Override
    public ApiResponse createTable(Table table) {

        table.setId(++this.index);
        if (!tables.contains(table)){
            tables.add(table);
        }

        return new ApiResponse(200, "OK", table);
    }

    @Override
    public ApiResponse getTable(Integer tableId) {

        for (Table table : tables) {
            if (table.getId().equals(tableId)){
                return new ApiResponse(200, "OK", table);
            }
        }

        return new ApiResponse(404, "Not Found", tableId);
    }

    @Override
    public ApiResponse updateTable(Table newTable, Integer tableId) {
        return null;
    }

    @Override
    public ApiResponse showTables(List<Table> tables) {
        return null;
    }

    @Override
    public ApiResponse deleteTable(Integer tableId) {
        return null;
    }

    @Override
    public ApiResponse createWaiter(Waiter waiter) {
        return null;
    }

    @Override
    public ApiResponse getWaiter(Integer waiterId) {
        return null;
    }

    @Override
    public ApiResponse updateWaiter(Waiter newWaiter, Integer waiterId) {
        return null;
    }

    @Override
    public ApiResponse showWaiter(List<Waiter> waiters) {
        return null;
    }

    @Override
    public ApiResponse deleteWaiter(Integer waiterId) {
        return null;
    }

    @Override
    public ApiResponse createFood(Foods food) {
        return null;
    }

    @Override
    public ApiResponse getFood(Integer foodId) {
        return null;
    }

    @Override
    public ApiResponse updateFood(Foods newFood, Integer foodId) {
        return null;
    }

    @Override
    public ApiResponse showFood(List<Foods> foods) {
        return null;
    }

    @Override
    public ApiResponse deleteFood(Integer foodId) {
        return null;
    }
}
