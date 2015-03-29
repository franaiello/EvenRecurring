package com.aiello.exercise;

import java.util.*;

/**
 * Write a function which takes in a int []
 - all integers in the array are assumed to be even occurring.
 - except for one integer which occurs odd no. of times

 the function finds the odd occuring integer and returns it.

 [1,2,3,2,2,3,1] = 2

 */
public class EvenRecurring {

    /**
     * Method uses a HashMap to track the value and the occurrences of how
     * many times it appears in the array
     * @param array
     * @return
     */
    public static int findRecurringInt(int[] array) {
        Map<Integer, Integer> map = buildMap(array);

        return getHighestRecurringValue(map);
    }

    /**
     * Builds map structure in order to store value and its corresponding
     * number of times within array
     * @param array
     * @return
     */
    private static Map<Integer, Integer> buildMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int key : array) {
            if(map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, ++count);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }

    /**
     * Returns the highest recurring key based upon the highest recurrences
     * @param map
     * @return
     */
    private static int getHighestRecurringValue(Map<Integer, Integer> map) {
        Map.Entry<Integer,Integer> maxEntry = null;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    /**
     * Method uses a bitwise XOR to determine which value
     * within the array is odd occurring.
     * @param array
     * @return
     * @author http://www.geeksforgeeks.org/find-the-number-occurring-odd-number-of-times/
     */
    public static int getOddOccurrence(int[] array) {
        int i;
        int res = 0;
        for (i=0; i< array.length; i++) {
            res = res ^ array[i];
        }

        return res;
    }
}
