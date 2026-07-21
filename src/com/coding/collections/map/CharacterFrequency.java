package com.coding.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";

        // getOrDefault
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("printing the data using getOrDefault");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // Traditional approach
        System.out.println("printing the data using Traditional approach");
        Map<Character, Integer> map1 = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        map1.forEach((key, value) -> System.out.println(key + ": " + value));

        // Stream API
        Map<Character, Long> map2 = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        map2.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
