package com.java.practice.DsAlgo.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {3,4,8,9};   // i
        int[] arr2 = {1,2,6,7};   // j

        int[] arr3 = new int[arr1.length+arr2.length];
        // Merge
        int i=0,j=0,k=0;
        while(i < arr1.length && j < arr2.length){

            if(arr2[j] < arr1[i]){
                arr3[k++] = arr2[j++];
            }
            else{
                arr3[k++] = arr1[i++];
            }
        }//while
        while(i<arr1.length) arr3[k++]=arr1[i++];

        while(j<arr2.length) arr3[k++]=arr1[j++];




        for(int g :arr3){
            System.out.println(g);
        }

    }//method
}
