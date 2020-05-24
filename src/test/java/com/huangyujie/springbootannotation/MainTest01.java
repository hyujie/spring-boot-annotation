package com.huangyujie.springbootannotation;

import com.huangyujie.springbootannotation.bean.Car;
import com.huangyujie.springbootannotation.config.MainConfig2;
import com.huangyujie.springbootannotation.config.MainConfigOfLifeCycle;
import com.huangyujie.springbootannotation.config.MianConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootAnnotationApplication.class)
public class MainTest01 implements ApplicationContextAware {
    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MianConfig.class);
        String[] names = applicationContext.getBeanNamesForType(Car.class);
        for(String name:names){
            System.out.println(name);
        }
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }
    }
    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }
    }

    @Test
    public void ImportTest(){
//        String[] beanNames1 = applicationContext.getBeanDefinitionNames();
//        System.out.println("======");
//        for(String name:beanNames1){
//            System.out.println(name);
//        }
//        System.out.println(applicationContext.getBean("blue"));
//        System.out.println("======");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }
        System.out.println(applicationContext.getBean("&coloerFactoryBean"));
        System.out.println(applicationContext.getBean("coloerFactoryBean"));
    }
    @Test
    public void LifeCycleTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println(name);
        }
    }
}
