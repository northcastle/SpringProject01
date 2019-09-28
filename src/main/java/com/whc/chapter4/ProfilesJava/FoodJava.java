package com.whc.chapter4.ProfilesJava;

/**
 * author : whc
 * createTime:2019/9/28  17:21
 *
 * 这是一个基础类
 */
public class FoodJava {

    private  String foodname;

    public FoodJava(String foodname) {
        this.foodname = foodname;
    }

    public FoodJava() {
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    @Override
    public String toString() {
        return "FoodJava{" +
                "foodname='" + foodname + '\'' +
                '}';
    }
}
