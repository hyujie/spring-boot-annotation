package com.huangyujie.springbootannotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Blue implements InitializingBean, DisposableBean {
    private String name;

    public Blue() {
        System.out.println("blue:--");
    }

    public void init(){
        name = "blue";
        System.out.println("blue:init----");
    }

    public void destory(){
        System.out.println("blue:destory----");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("blue2:destory----");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("blue2:init----");
    }
}
