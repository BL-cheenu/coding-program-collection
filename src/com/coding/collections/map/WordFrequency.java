package com.coding.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is easy java is powerful";

        // getOrDefault
        String[] words = sentence.split("\\s+");

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Stream API
        Map<String, Long> map1 = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        map1.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
