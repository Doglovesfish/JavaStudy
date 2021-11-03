package com.yide.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j( topic = "c.Test11")
public class Test11 {
    public static void main(String[] args) throws InterruptedException{
        TwoPhaseTermination tpt = new TwoPhaseTermination();
        tpt.start();

        Thread.sleep(10000);

        tpt.stop();
    }
}

@Slf4j (topic = "c.TwoPhaseTermination")
class TwoPhaseTermination{
    private Thread monitor;

    //启动监控线程
    public void start(){
        monitor = new Thread(()->{
            while(true){
                Thread current = Thread.currentThread();
                if(current.isInterrupted()){
                    log.debug("料理后事");
                    break;
                }

                try {
                    Thread.sleep(1000);//if interrupt here, will catch e
                    log.debug("执行监控记录"); //if interrupt here,
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //sleep过程中被打断，isInterrupt为false
                    current.interrupt(); //将isInterrupt置为true
                }
            }
        });

        monitor.start();

    }

    //停止监控线程
    public void stop(){
        monitor.interrupt();
    }
}
