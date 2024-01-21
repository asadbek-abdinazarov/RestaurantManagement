package service;

import api.ApiResponse;
import bean.Foods;
import bean.Table;
import bean.Waiter;

import java.util.ArrayList;
import java.util.List;

public interface AdminService {

    List<Table> tables = new ArrayList<Table>();
    List<Waiter> waiter = new ArrayList<Waiter>();
    List<Foods> foods = new ArrayList<Foods>();


    ApiResponse createTable(Table table);
    ApiResponse getTable(Integer tableId);

    ApiResponse updateTable(Table newTable, Integer tableId);

    ApiResponse showTables(List<Table> tables);

    ApiResponse deleteTable(Integer tableId);



    ApiResponse createWaiter(Waiter waiter);
    ApiResponse getWaiter(Integer waiterId);

    ApiResponse updateWaiter(Waiter newWaiter, Integer waiterId);

    ApiResponse showWaiter(List<Waiter> waiters);

    ApiResponse deleteWaiter(Integer waiterId);




    ApiResponse createFood(Foods food);
    ApiResponse getFood(Integer foodId);

    ApiResponse updateFood(Foods newFood, Integer foodId);

    ApiResponse showFood(List<Foods> foods);

    ApiResponse deleteFood(Integer foodId);






}
