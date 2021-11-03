package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "c.Test2")
public class Test2 {
    public static void main(String[] args) {
        Runnable r = ()-> { { // 任务对象
                log.debug("running");
            }
        };

        Thread t = new Thread(r, "t2"); //线程对象
        t.start(); //任务启动
    }
}
