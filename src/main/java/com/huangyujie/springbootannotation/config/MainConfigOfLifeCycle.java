package com.huangyujie.springbootannotation.config;

import com.huangyujie.springbootannotation.bean.Blue;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * beanPostProcess  初始化前后拦截：bean的负责过户，注入其他组件，@Autowire 生命周期注解功能，@#SyncxxBeanPostProcess
 */
@Configuration
@Import(MyBeanPostProcess.class)
public class MainConfigOfLifeCycle {

    @Bean(name = "blue2",initMethod = "init",destroyMethod = "destory")
    public Blue blue(){

        return new Blue();
    }


}
