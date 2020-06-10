package com.java.practice.thread.printnumbers;

public class SharedResourceForPrint {

    private int number = 1;
    int result ;
    private final int NUMBER_OF_THREADS ;
    private final int NUMBERS_IN_SQUENCE ;


   public SharedResourceForPrint(int numberOfThreads,int numbersInSquence){
    this.NUMBER_OF_THREADS = numberOfThreads;
    this.NUMBERS_IN_SQUENCE = numbersInSquence;
      }

    public void print(int result){

    while(number < NUMBERS_IN_SQUENCE-1){
      synchronized (this) {
        while (number % NUMBER_OF_THREADS != result) {

            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//inner while
        System.out.println(Thread.currentThread().getName()+" "+number++);
        this.notifyAll();
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }//sync

    }// outer while


    }



}
