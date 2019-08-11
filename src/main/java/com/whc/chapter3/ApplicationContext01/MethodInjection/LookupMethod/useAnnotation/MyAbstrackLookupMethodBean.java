package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useAnnotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/11  16:33
 */
@Component("myabstracklookupmethodbean")
public class MyAbstrackLookupMethodBean {
    @Lookup
    public Singer getmytestsinger(){
        return null;
    }
}
