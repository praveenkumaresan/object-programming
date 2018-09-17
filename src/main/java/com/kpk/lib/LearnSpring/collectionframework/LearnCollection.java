package com.kpk.lib.LearnSpring.collectionframework;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class LearnCollection {

    /**
     * Collection - root interface of collection frame. No class that implements
     * collection directly
     */
    public static void invokeCollectionDemo(){

        List<Integer> testList = Arrays.asList(1);
        List<Integer> integerList = new ArrayList<Integer>();

        integerList.add(1);
        integerList.add(100);
        integerList.add(3);
        integerList.add(56);
        integerList.add(2);
        integerList.add(81);
        integerList.add(445451);

        /**
         * collection framework
         */
        if (integerList.contains(1)){System.out.println("list contains 1");}

        if (integerList.contains(3)){System.out.println("list is not containing 3");}

        if (integerList.containsAll(testList)){System.out.print("test list is subset of integer list... ");}


        /***
         * Collections demos
         */
        System.out.println(" before sorting ...");

        integerList.forEach(it -> System.out.println("element in the list --> " +it));

        Collections.sort(integerList);

        System.out.println("after sorting ...");

        integerList.forEach(it -> System.out.println("element in the list --> " +it));

        System.out.println("return position of element --> " +Collections.binarySearch(integerList,56));


    }

}
