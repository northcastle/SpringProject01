package com.whc.chapter4.ProfilesJava;

import java.util.ArrayList;
import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  17:23
 *
 * 这个时dev环境下的实现
 */
public class FoodJavaServiceImplDev implements FoodJavaService{
    @Override
    public List<FoodJava> providerFood() {
        List<FoodJava> list = new ArrayList<>();
        list.add(new FoodJava("馒头"));
        return list;
    }
}
