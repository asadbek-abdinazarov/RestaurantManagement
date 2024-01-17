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
    String getTable(int tableId);
    String updateTable(Table newTable, int tableId);
    String showTables(List<Table> TO_LIST_TABLE);
    String deleteTable(int tableId);


    String createUser(User user);
    String getUser(int userId);
    String updateUser(User newUser, int userId);
    String showUsers(List<Table> TO_LIST_TABLE);
    String deleteUser(int userId);

    String createFood(Foods food);
    String getFood(int foodId);
    String updateFood(Foods newFood, int foodId);
    String showFoods(List<Foods> TO_LIST_FOODS);
    String deleteFood(int foodId);


}
