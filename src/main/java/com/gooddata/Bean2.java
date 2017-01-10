package com.gooddata;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    public int val = 1110;

    public Bean2() {
        System.out.println("Bean2 created");
    }

    public String getValue() {
        return "something123";
    }

    @PostConstruct
    public void onStart() {
        System.out.println("Bean2 onStart()");
    }
}
