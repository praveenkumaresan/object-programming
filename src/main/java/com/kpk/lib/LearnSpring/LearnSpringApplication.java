package com.kpk.lib.LearnSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class LearnSpringApplication {

    public static void main(String[] args) {

        List<String> testString = new ArrayList<>();

        System.out.println("display --> " + testString.stream().collect(Collectors.toList()));

        testString.forEach(it -> System.out.println("array -> " + Arrays.asList(it)));

        SpringApplication.run(LearnSpringApplication.class, args);
    }
}
