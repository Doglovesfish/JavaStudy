package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test1")
public class Test1 {
    public static void main(String[] args) {
        Thread t = new Thread(){ // 匿名内部
            @Override
            public void run(){
                log.debug("running!!!!!");
            }
        };
        t.start();
        t.setName("t1");

        log.debug("running !!!!");
    }
}


