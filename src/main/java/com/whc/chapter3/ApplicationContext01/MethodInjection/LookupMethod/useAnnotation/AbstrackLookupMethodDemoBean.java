package com.whc.chapter3.ApplicationContext01.MethodInjection.LookupMethod.useAnnotation;


import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * author : whc
 * createTime:2019/8/11  15:27
 */
@Component("abtracklookupbean")
public  class AbstrackLookupMethodDemoBean implements DemoBean{

    /**
     * @Lookup 注解 强调使用方法注入的方式，可以使 单例bean获取非单例bean的不同实例
     * @return
     */
    @Lookup
    public  Singer getMySinger(){
        return null;
    }

    @Override
    public void doSomething() {
        this.getMySinger().sing();
    }
}
