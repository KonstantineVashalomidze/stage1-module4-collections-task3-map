package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : Arrays.stream(sentence.split("[^a-zA-Z]+"))
                .filter(word -> !word.isEmpty()).toArray(String[]::new)) {
            wordFrequency.merge(word.toLowerCase(), 1, Integer::sum);
        }
        return wordFrequency;
    }
}
