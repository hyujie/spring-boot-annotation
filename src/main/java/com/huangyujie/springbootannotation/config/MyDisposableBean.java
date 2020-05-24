package com.huangyujie.springbootannotation.config;

import org.springframework.beans.factory.DisposableBean;

public class MyDisposableBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {

    }
}
