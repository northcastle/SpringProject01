package com.whc.chapter4.SpringFeelingBean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * author : whc
 * createTime:2019/8/18  09:33
 */
public class _02ApplicationContextAware implements ApplicationContextAware {

    private ApplicationContext ctx;

    private String myString;

    public _02ApplicationContextAware() {
        System.out.println("This is construct method without args");
    }

   public void  myinit(){
       System.out.println("This is method myinit");
    }
    public void mydestroy(){
        System.out.println("This is method mydestroy.");
    }

    /**
     * 重写的接口中的方法
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       this.ctx = applicationContext;
        System.out.println("This is method setApplicationContext with applicationContext");
    }

    public void setmyselefstring(){
        this.myString = ctx.getBean("mystring00", String.class);
        System.out.println("==>"+this.myString+"<==");
        System.out.println("This is method setmyselefstring");
    }
}
