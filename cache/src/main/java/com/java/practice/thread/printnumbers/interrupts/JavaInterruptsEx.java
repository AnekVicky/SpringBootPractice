package com.java.practice.thread.printnumbers.interrupts;

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.*;

public class JavaInterruptsEx {
    public static void main(String[] args) throws InterruptedException {

        Thread taskThread =  new Thread(new Task());
        taskThread.start();
        sleep(1000);
        System.out.println("Now interrupting the thread ");
        taskThread.interrupt();

    }
}

class Task implements Runnable {

    @Override
    public void run() {

        //some long running task
        for (int i =0 ;i<100000;i++){
            System.out.println(i);
            if(currentThread().isInterrupted()){
                System.out.println("Stop processing !!!!  Thread has been interrupted ");
                return ;
            }
        }


    }
}