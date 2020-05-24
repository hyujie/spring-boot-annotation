package com.huangyujie.springbootannotation.config;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1。获取ioc容器使用的ioc容器
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2.获取类加载器
        ClassLoader classLoader =  context.getClassLoader();
        //2/获取当前环境信息
        Environment env = context.getEnvironment();
        //获取bean注册器
        BeanDefinitionRegistry registry =  context.getRegistry();
        String properties = env.getProperty("os.name");
        System.out.println("properties:"+properties);
        assert properties != null;
        if(properties.contains("linux")){
            return true;
        }

        return false;
    }
}
