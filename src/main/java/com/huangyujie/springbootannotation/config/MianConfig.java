package com.huangyujie.springbootannotation.config;

import com.huangyujie.springbootannotation.SpringBootAnnotationApplication;
import com.huangyujie.springbootannotation.bean.Car;
import com.huangyujie.springbootannotation.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.swing.*;

//D:\idea-workspace\spring-boot-annotation\src\main\java\com\huangyujie\springbootannotation
@Configuration
//@ComponentScan(value = "com.huangyujie.springbootannotation",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {SpringBootAnnotationApplication.class}),
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})
@ComponentScan(value = "com.huangyujie.springbootannotation",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {SpringBootAnnotationApplication.class})
},includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Service.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)
},useDefaultFilters = false)
public class MianConfig {

    @Bean
//    @Lazy  懒加载，调用的时候才才创建
    public Car getCar(){
        System.out.println("创建---car");
        return new Car();
    }
//    @Scope("prototype")多实例的时候容器创建不会创建实例
    @Bean
    public Person getPerson(){
        return new Person();
    }
}
