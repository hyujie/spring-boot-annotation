package com.huangyujie.springbootannotation;

import com.huangyujie.springbootannotation.bean.Car;
import com.huangyujie.springbootannotation.config.MianConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootAnnotationApplication.class)
class SpringBootAnnotationApplicationTests implements ApplicationContextAware {

    ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    void contextLoads() {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Car.class);
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
        System.out.println(applicationContext.getBean("huang"));
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MianConfig.class);
        System.out.println(Arrays.toString(annotationConfigApplicationContext.getBeanDefinitionNames()));
        System.out.println(annotationConfigApplicationContext.getBean("huang"));

    }
    void test(){

    }

    public static void main(String[] args) {
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MianConfig.class);
        System.out.println(Arrays.toString(annotationConfigApplicationContext.getBeanDefinitionNames()));
        System.out.println(annotationConfigApplicationContext.getBean("huang"));
    }

}
