package com.whc.chapter4.Profiles;

import java.util.ArrayList;
import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  11:04
 *
 * 开发环境下的 服务实现
 */
public class FoodServiceImplDev implements FoodService {
    @Override
    public List<Food> providerLunch() {

        List<Food> list = new ArrayList<>();
        list.add(new Food("可乐dev"));
        list.add(new Food("龙虾堡dev"));

        return list;
    }
}
