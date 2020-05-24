package com.huangyujie.springbootannotation;

import org.springframework.beans.factory.Aware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAnnotationApplication.class, args);
    }

}
