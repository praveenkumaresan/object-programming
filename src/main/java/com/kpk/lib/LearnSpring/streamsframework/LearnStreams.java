package com.kpk.lib.LearnSpring.streamsframework;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class LearnStreams {

    private static Map<String, List<String>> clubPlayersListMap = new HashMap<>();

    @PostConstruct
    public static void performStream(){

        populateMap();

        clubPlayersListMap.entrySet().forEach(
                stringListEntry -> System.out.println("entry inside map --> "
                        +stringListEntry.getKey() + " : " +stringListEntry.getValue())
        );

        clubPlayersListMap.clear();

        System.out.println("size of map --> " +clubPlayersListMap.size());

    }

    private static void populateMap() {
        clubPlayersListMap.put("RealMadrid",Arrays.asList("ronaldo"));
    }
}
