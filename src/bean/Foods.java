package bean;

import enums.FoodsEnum;

public class Foods extends BaseIdBean{

    private FoodsEnum foodsType;
    private String foodName;
    private Double foodPrice;

    public Foods(FoodsEnum foodsType, String foodName, Double foodPrice) {
        this.foodsType = foodsType;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }


    public FoodsEnum getFoodsType() {
        return foodsType;
    }

    public void setFoodsType(FoodsEnum foodsType) {
        this.foodsType = foodsType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

}
