package com.huangyujie.springbootannotation.config;

import com.huangyujie.springbootannotation.bean.Blue;
import com.huangyujie.springbootannotation.bean.Green;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        if(!registry.containsBeanDefinition("com.huangyujie.springbootannotation.bean.Blue")){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
            registry.registerBeanDefinition("blue",beanDefinition);
        }
        if(!registry.containsBeanDefinition("com.huangyujie.springbootannotation.bean.Green")){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Green.class);
            registry.registerBeanDefinition("green",beanDefinition);
        }
    }
}
