package com.java.practice.DsAlgo.Arrays;

/* Arrange all the -ve to left side and +ve to right side */
public class ArrangingArraysEx {

    public static void main(String[] args) {

        int[] arr = {1,-2,2,-1};

        int i=0,j=arr.length-1;

      while(i<j) {
          while (arr[i] < 0) {i++ ;}

          while (arr[j] >= 0) {j-- ;}

          if(i < j){

              swap(arr, i, j);
          }
      }

      for(int k : arr){
          System.out.print(k);
      }
    }

    private static void swap(int[] arr ,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }

}
