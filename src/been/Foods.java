package been;

import enums.FoodEnum;

public class Foods extends BaseIdBeen{



    private FoodEnum foodEnumType;
    private String foodName;
    private double foodPrice;

    public Foods() {
    }

    public Foods(FoodEnum foodEnumType, String foodName, double foodPrice) {
        this.foodEnumType = foodEnumType;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }
    public FoodEnum getFoodEnumType() {
        return foodEnumType;
    }

    public void setFoodEnumType(FoodEnum foodEnumType) {
        this.foodEnumType = foodEnumType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }
}
