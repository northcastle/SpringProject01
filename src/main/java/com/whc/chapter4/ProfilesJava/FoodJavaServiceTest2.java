package com.whc.chapter4.ProfilesJava;

import com.whc.chapter4.Profiles.Food;
import com.whc.chapter4.Profiles.FoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * author : whc
 * createTime:2019/9/28  17:45
 *
 * 使用注解的方式启用 不同的配置文件，
 *  注意:此方式只适用于测试类中使用
 * 1.pom中导入依赖 ： 这个@RunWith(SpringJUnit4ClassRunner.class) 会用到的
 *   <dependency>
 *          <groupId>org.springframework</groupId>
 *          <artifactId>spring-test</artifactId>
 *          <version>5.1.7.RELEASE</version>
 *   </dependency>
 *
 * 2.指定需要用到的配置类
 *   @ContextConfiguration(classes = {FoodJavaConfigPro.class,FoodJavaConfigDev.class})
 *
 *
 * 3.指定激活的配置文件
 *    @ActiveProfiles("dev")
 *
 *
 * 注 ： 此方法只能用在测试类上面，
 *      目前这个操作还存在一些问题，不过在后面13章的时候，会详细的了解关于spring应用称需的测试内容
 *      所以这个位置先，暂且放一放，后续再回头来看。
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FoodJavaConfigPro.class,FoodJavaConfigDev.class})
@ActiveProfiles("dev")
public class FoodJavaServiceTest2 {

    //此时的这个测试类，已经是一个 spring容器了，所以可以直接从这个里面获取需要的bean
    @Autowired
    private FoodService foodService;


    @Test
    public void test(){
        List<Food> list = foodService.providerLunch();
        for (Food food : list) {
            System.out.println(food);
        }
    }
}
