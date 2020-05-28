package com.java.practice.functional;
/*
created by ANEK SINGH on 5/16/2020
*/

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathEx {

    public static void main(String[] args) throws IOException {

       // Path path = Paths.get("./src/main/com/java/practice/functional/abc.txt");  DOESNOT WORK
       // Path path = Paths.get("C:\\Users\\Abhishek\\Desktop\\ANEK\\SpringBootPractice\\cache\\src\\main\\java\\com\\java\\practice\\functional\\abc.txt");


      // Worked
        System.out.println(Paths.get(".").toAbsolutePath());

       //Path path = Paths.get("./cache/src/main/java/com/java/practice/functional/abc.txt");

        Path path = Paths.get(".\\cache\\src\\main\\java\\com\\java\\practice\\functional\\abc.txt");
        Files.lines(path, Charset.defaultCharset()).count();


        System.out.println(path);
        System.out.println(Files.lines(path, Charset.defaultCharset()).count());

       // ResourceUtils.getFile("classpath:config/sample.txt");

        /*System.out.println( ResourceUtils.getFile("classpath:resources/abc.txt"));

        System.out.println(
                new PathEx().getClass().getClassLoader().getResourceAsStream("abc.txt")        );
*/

    }
}
