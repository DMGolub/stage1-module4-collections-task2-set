package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> onlyInThird = new HashSet<>(thirdSet);
        onlyInThird.removeAll(firstSet);
        onlyInThird.removeAll(secondSet);

        Set<String> result = new HashSet<>(firstSet);
        result.retainAll(secondSet);
        result.removeAll(thirdSet);
        result.addAll(onlyInThird);
        return result;
    }
}