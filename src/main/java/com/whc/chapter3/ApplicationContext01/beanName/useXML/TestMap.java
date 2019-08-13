package com.whc.chapter3.ApplicationContext01.beanName.useXML;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * author : whc
 * createTime:2019/8/13  19:45
 */
public class TestMap {
    @Test
    public void testmap(){
        Map<String,Object> map = new HashMap<>();
        //1.put
        map.put("no01","wanghongchang");
        map.put("no02",18);
        System.out.println(map);
        //2.get
        Object no02 = map.get("no02");
        System.out.println(no02);
        //3.remove
        map.remove("no01");
        System.out.println(map);
        //4.clear
        map.clear();
        System.out.println(map);
    }

    @Test
    public void testxunhuan(){
        Map<String,Object> map = new HashMap<>();
        map.put("a",111);
        map.put("b",222);
        map.put("c",333);

        //1.第一种遍历方式，把所有的key取出来，然后根据key获取所有的值
        Set<String> keys = map.keySet();
        for (String key : keys) { // iter 快捷操作出 for each 循环
            Object o = map.get(key);
            System.out.println(key +" --> "+o);
        }
        System.out.println("*********************************");

        //2.第二种遍历方式，根据entryset 来遍历+foreach循环进行遍历
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        System.out.println("*********************************");

        //3.书中练习的遍历方式，之前从来没有见过的,这个也算是新的东西吧
        map.entrySet().stream().forEach(b->{
            System.out.println(b.getKey()+" ==> "+b.getValue());
        });


    }
}
