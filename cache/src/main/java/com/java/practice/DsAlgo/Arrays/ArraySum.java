package com.java.practice.DsAlgo.Arrays;

public class ArraySum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

       int sum =  sum(arr,arr.length-1);

        System.out.println(sum);
    }

    private static int  sum(int[] arr, int i) {

        if(i<0) return 0 ;

        else {
          return  sum(arr,i-1)+arr[i];
        }



    }
}
