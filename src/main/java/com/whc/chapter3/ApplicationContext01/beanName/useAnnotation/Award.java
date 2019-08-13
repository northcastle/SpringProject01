package com.whc.chapter3.ApplicationContext01.beanName.useAnnotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * author : whc
 * createTime:2019/8/13  21:23
 * 这个注解是我自己创建的！之前从来没有创建过注解
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Award {
    @AliasFor("prize")
    String[] value() default { };
    @AliasFor("value")
    String[] prize() default { };
}
