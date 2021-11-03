package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test5 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run(){
                log.debug("running");
            }
        };

        t.setName("t0");
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
    }



}
