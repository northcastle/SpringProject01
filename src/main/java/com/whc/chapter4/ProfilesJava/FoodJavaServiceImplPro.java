package com.whc.chapter4.ProfilesJava;

import java.util.ArrayList;
import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  17:24
 *
 * 这个是 pro 环境下的实现
 */
public class FoodJavaServiceImplPro implements  FoodJavaService{
    @Override
    public List<FoodJava> providerFood() {
        List<FoodJava> list = new ArrayList<>();
        list.add(new FoodJava("大馒头"));
        return list;
    }
}
