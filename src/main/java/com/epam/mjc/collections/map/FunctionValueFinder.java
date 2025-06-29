package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for (Integer element : functionMap.values()) {
            if (element == requiredValue) return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> functionMap = new HashMap<>();
        for (Integer element : sourceList) {
            functionMap.put(element, 5 * element + 2);
        }
        return functionMap;
    }
}
