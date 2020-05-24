package com.huangyujie.springbootannotation.bean;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
    public Dog() {
        System.out.println("dog....");
    }
    //JSR250规范
    @PostConstruct
    public void post(){
        System.out.println("init");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory");
    }
}
