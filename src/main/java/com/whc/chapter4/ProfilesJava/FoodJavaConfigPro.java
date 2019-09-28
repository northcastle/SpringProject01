package com.whc.chapter4.ProfilesJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * author : whc
 * createTime:2019/9/28  17:28
 *
 * Pro环境下生效的配置类
 */

@Configuration
@Profile("pro")
public class FoodJavaConfigPro {

    @Bean("foodjavaservice")
    public FoodJavaService getFoodJava(){
        return new FoodJavaServiceImplPro();
    }
}
