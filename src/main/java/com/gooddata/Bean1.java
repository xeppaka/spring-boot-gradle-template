package com.gooddata;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Bean1 {
    private Bean2 bean2;

    public Bean1() {
        System.out.println("Bean1 created");
        // this.bean2 = bean2;
    }

    @PostConstruct
    public void onStart() {
        System.out.println("Bean1 onStart()");
        // bean2.getValue();
    }
}
