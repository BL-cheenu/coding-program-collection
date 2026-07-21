package com.coding.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming";

        // getOrDefault
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non-Repeated Character: " + ch);
                break;
            }
        }

        // Stream API
        Character character = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("Character: " + character);

    }
}
