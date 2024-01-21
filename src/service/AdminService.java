package service;

import been.Foods;
import been.Table;
import been.User;

import java.util.ArrayList;
import java.util.List;

public interface AdminService {

    List<User> TO_LIST_USER = new ArrayList<User>();
    List<Table> TO_LIST_TABLE = new ArrayList<Table>();
    List<Foods> TO_LIST_FOODS = new ArrayList<Foods>();

    String createTable(Table table);
    String getTable(Integer tableId);
    String updateTable(Table newTable, Integer tableId);
    String showTables(List<Table> TO_LIST_TABLE);
    String deleteTable(Integer tableId);


    String createUser(User user);
    String getUser(Integer userId);
    String updateUser(User newUser, Integer userId);
    String showUsers(List<Table> TO_LIST_TABLE);
    String deleteUser(Integer userId);

    String createFood(Foods food);
    String getFood(Integer foodId);
    String updateFood(Foods newFood, Integer foodId);
    String showFoods(List<Foods> TO_LIST_FOODS);
    String deleteFood(Integer foodId);


}
