package com.kpk.lib.LearnSpring;

import com.kpk.lib.LearnSpring.collectionframework.LearnCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class LearnSpringApplication {

    @Autowired
    LearnCollection learnCollection;

    public static void main(String[] args) {

        LearnCollection.invokeCollectionDemo();

        SpringApplication.run(LearnSpringApplication.class, args);



    }
}
