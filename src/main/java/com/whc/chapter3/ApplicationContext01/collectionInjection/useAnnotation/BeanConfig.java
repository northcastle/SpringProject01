package com.whc.chapter3.ApplicationContext01.collectionInjection.useAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.List;

/**
 * author : whc
 * createTime:2019/8/10  16:03
 */
@Configuration
@ImportResource("springChapter3/applicationcontext-CollectionInjection.xml")
public class BeanConfig {

    @Bean("collectionbean02")
    public CollectionInjection createCollectionbean02(){
        return new CollectionInjection();
    }

    @Bean("mylist02")
    public List createlist(){
        List list = new ArrayList();
        list.add("first list value -- wanghognchang");
        list.add("second list value -- wanghognchang");
        list.add(true);
        list.add(123);
        return list;
    }
}
