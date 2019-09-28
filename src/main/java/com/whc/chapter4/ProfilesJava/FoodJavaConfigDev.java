package com.whc.chapter4.ProfilesJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * author : whc
 * createTime:2019/9/28  17:25
 *
 * 这个是 dev 环境下的配置类 : 有一个 dev的实现类
 */

@Configuration
@Profile("dev") // 这个注解指明了 当前配置类在哪个环境下生效
public class FoodJavaConfigDev {

    @Bean("foodjavaservice")
    public FoodJavaService getFoodJava(){
        return new FoodJavaServiceImplDev();
    }
}
