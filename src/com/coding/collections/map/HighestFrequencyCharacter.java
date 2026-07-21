package com.coding.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char highestChar = ' ';
        int highestFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestFrequency = entry.getValue();
                highestChar = entry.getKey();
            }
        }
        System.out.println("Highest Frequency Character: " + highestChar);
        System.out.println("Frequency: " + highestFrequency);

        // Stream API
        Map.Entry<Character, Long> result = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        if (result != null) {
            System.out.println("Highest Frequency Character: " + result.getKey());
            System.out.println("Frequency: " + result.getValue());
        }
    }
}
