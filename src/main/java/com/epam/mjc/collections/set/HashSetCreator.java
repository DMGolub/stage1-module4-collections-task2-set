package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {

    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int number : sourceList) {
            result.add(number);
            if (number % 2 == 0) {
                while (number % 2 == 0) {
                    result.add(number / 2);
                    number /= 2;
                }
            } else {
                result.add(number * 2);
            }
        }
        return result;
    }
}