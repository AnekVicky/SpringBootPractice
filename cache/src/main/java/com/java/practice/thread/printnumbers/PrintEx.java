package com.java.practice.thread.printnumbers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEx {

    static final int NUMBER_OF_THREADS = 3 ;
    static final int NUMBER_IN_SEQUENCE = 10;
    public static void main(String[] args) {


    SharedResourceForPrint resource = new SharedResourceForPrint(NUMBER_OF_THREADS,NUMBER_IN_SEQUENCE);

        ExecutorService service = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

        service.execute(()->resource.print(0));
        service.execute(()->resource.print(2));
        service.execute(()->resource.print(1));

        Map map = new HashMap<>();


        service.shutdown();

    }

}

