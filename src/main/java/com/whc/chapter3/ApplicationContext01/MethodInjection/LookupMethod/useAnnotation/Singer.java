package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/11  15:19
 */
@Component("singer")
@Scope(value = "prototype")
public class Singer {
    private String lyric = "I played a quick game of chess with the salt and pepper shaker";
    public void sing(){
        System.out.println(lyric);
    }
}
