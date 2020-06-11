package com.java.practice.DsAlgo.Arrays;

public class RotateArrayEx {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int[] rotate_arr = new int[arr.length];

        int rotation_index = 3;
        int i = 0,size=arr.length,l=rotation_index;
        while(i < rotation_index){

            rotate_arr[i] = arr[size-l];
            System.out.println("# "+rotate_arr[i]);
            i++;l--;
        }//while
        print(rotate_arr);
        System.out.println("****************");

        i = rotation_index ;
        while(rotation_index < size){
            rotate_arr[rotation_index] = arr[l];
            System.out.println("# i is " +i+ ",l is "+l+" , "+rotate_arr[rotation_index]);
            rotation_index++;l++;
        }
        print(rotate_arr);
    }
private static void print(int[] arr){

   for(int o : arr){
       System.out.println(o);
   }

}
}
