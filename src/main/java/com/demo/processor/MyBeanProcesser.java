package com.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //Object bean      实例化的bean
        //String beanName  bean的id
        System.out.println("bean:初始化方法之前");
        return bean;// 这里必须return bean
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean:初始化方法之后");
        return bean;// 这里必须returnbean
    }
}
