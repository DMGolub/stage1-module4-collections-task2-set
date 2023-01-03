package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {

    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> allSquares = new TreeSet<>();
        for (int number : sourceList) {
            allSquares.add(number * number);
        }
        return allSquares.subSet(lowerBound, true, upperBound, true);
    }
}