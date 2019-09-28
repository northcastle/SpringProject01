package com.whc.chapter4.Profiles;

/**
 * author : whc
 * createTime:2019/9/28  11:00
 *
 * 这个是基本对象
 */
public class Food {

    private String foodname;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public Food(String foodname) {
        this.foodname = foodname;
    }

    public Food() {
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodname='" + foodname + '\'' +
                '}';
    }
}
