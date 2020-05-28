package com.java.practice.functional;
/*
created by ANEK SINGH on 5/16/2020
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalEx {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("ANEK","VICKY");

        System.out.println(list);

        System.out.println(
        list.stream().filter(e->e.equals("ANEK")).findAny().get()
        );


        Predicate condition = e -> e.equals("ANEK") ;

        System.out.println(
        list.stream().takeWhile(condition).findAny().get()
        );


        System.out.println(
        condition.test("ANEK")
        );

    }


}
