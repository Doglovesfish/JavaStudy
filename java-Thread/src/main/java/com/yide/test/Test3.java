package com.yide.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

@Slf4j(topic = "c.Test3")
public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.debug("running");
                Thread.sleep(1000);
                return null;
            }
        });

        Thread t = new Thread(task, "t0");
        t.start();
        task.get();// 等待task返回结果,阻塞
        log.debug("{}", task.get()); //{}就是参数符号，使用","后面的数据进行替换
    }
}
