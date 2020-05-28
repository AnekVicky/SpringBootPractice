package com.java.practice.functional;
/*
created by ANEK SINGH on 5/16/2020
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {


    public static void main(String[] args) {

        System.out.println(
        Optional.of("null").orElseThrow(() -> new RuntimeException("Invalid value"))
        );


        System.out.println(Optional.ofNullable("ANEK"));


        /* Use Optional.Of where you are sure that value is NOT NULL

            Optional.ofNullable where you are not sure value is null or not null

        */
        Optional<List<String>> optional = Optional.of(Arrays.asList("ANEK","MADRAS","null"));
        System.out.println(optional.get());


    }


}

