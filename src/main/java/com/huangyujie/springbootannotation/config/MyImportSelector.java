package com.huangyujie.springbootannotation.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //AnnotationMetadata注解元数据
        return new String[]{"com.huangyujie.springbootannotation.bean.Red"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return null;
    }
}
