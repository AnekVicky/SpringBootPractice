package com.java.practice.thread.printnumbers.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreEx {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);
        ExecutorService service = Executors.newFixedThreadPool(10);
        //IntStream.of(10).forEach(i -> service.execute(new Task(semaphore)));

        for(int i = 0;i<10;i++){
            service.execute(new Task(semaphore ));
        }

        service.shutdown();

    }

}

class Task implements Runnable {

    Semaphore semaphore ;
    public Task(Semaphore semaphore){
        this.semaphore = semaphore;
    }

    public void run(){
        semaphore.acquireUninterruptibly();
        System.out.println("Thread : - "+Thread.currentThread().getName());
        System.out.println("Permit is :- "+semaphore.availablePermits());
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
        System.out.println("After release permit is : -"+semaphore.availablePermits());

    }

}


