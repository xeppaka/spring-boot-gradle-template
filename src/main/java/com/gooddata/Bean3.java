package com.gooddata;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * Created by nnm on 12/22/16.
 */
@Component
public class Bean3 implements BeanFactoryPostProcessor, PriorityOrdered {
    @PostConstruct
    public void onStart() {
        System.out.println("Bean3 onStart()");
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("blabla");
        beanFactory.getBean(Bean1.class);
    }
}
