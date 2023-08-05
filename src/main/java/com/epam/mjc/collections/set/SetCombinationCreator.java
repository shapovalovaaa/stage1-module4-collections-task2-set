package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> combinedSet = new HashSet<>(firstSet);
        combinedSet.retainAll(secondSet);
        combinedSet.removeAll(thirdSet);

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        combinedSet.addAll(thirdSet);
        return combinedSet;
    }
}
