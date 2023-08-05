package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        int divide;

        for (Integer number : sourceList) {
            if (number % 2 == 0) {
                result.add(number);
                divide = number;
                while (divide != 1) {
                    divide /= 2;
                    result.add(divide);
                }
            } else {
                result.add(number);
                result.add(number * 2);
            }
        }
        return result;
    }
}
