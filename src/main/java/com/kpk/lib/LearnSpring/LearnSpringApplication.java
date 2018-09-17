package com.kpk.lib.LearnSpring;

import com.kpk.lib.LearnSpring.collectionframework.LearnCollection;
import com.kpk.lib.LearnSpring.streamsframework.LearnStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LearnSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(LearnSpringApplication.class, args);

    }
}
