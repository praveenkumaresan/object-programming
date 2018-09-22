package com.kpk.lib.LearnSpring.streamsframework;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        List<String> clubList = new ArrayList<>();
        clubList.add(0,"Valencia");
        clubList.add(1,"Barcelona");
        clubList.add(2,"RealMadrid");
        clubList.add(3,"Atletico");
        clubList.add(4,"InterMilan");
        clubList.add(5,"Juventus");
        clubList.add(6,"ManUnited");
        clubList.add(7,"Liverpool");

        Map<String, Integer> clubLengthMap = clubList.stream().distinct().collect(
                Collectors.toMap(Function.identity(), String::length)
        );

        clubLengthMap.entrySet().forEach(
                stringIntegerEntry -> {
                    System.out.println(" clubLengthMap key --> " +stringIntegerEntry.getKey());
                    System.out.println(" clubLengthMap value --> " +stringIntegerEntry.getValue());
                }
        );

    }

    private static void populateMap() {
        clubPlayersListMap.put("RealMadrid",Arrays.asList("ronaldo"));
    }
}
