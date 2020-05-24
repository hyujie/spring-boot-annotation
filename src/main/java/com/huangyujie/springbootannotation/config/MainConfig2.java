package com.huangyujie.springbootannotation.config;

import com.huangyujie.springbootannotation.bean.Color;
import com.huangyujie.springbootannotation.bean.Person;
import org.springframework.context.annotation.*;

/**
 * conditional用法
 */
@Configuration
//@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    //    @Scope("prototype")多实例的时候容器创建不会创建实例
    @Bean("bill")
    @Conditional(value = {WindowCondition.class})
    public Person getPerson(){

        return new Person();
    }

    @Bean("linux")
    @Conditional(value = {LinuxCondition.class})
    public Person getPerson01(){
        return new Person();
    }

    @Bean
    public ColoerFactoryBean coloerFactoryBean(){
        return new ColoerFactoryBean();
    }
}
