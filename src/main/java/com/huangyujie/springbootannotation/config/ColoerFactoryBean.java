package com.huangyujie.springbootannotation.config;

import com.huangyujie.springbootannotation.bean.Color;
import org.springframework.beans.factory.FactoryBean;

public class ColoerFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColoerFactoryBean...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
