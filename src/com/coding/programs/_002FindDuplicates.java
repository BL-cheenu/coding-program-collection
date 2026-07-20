package com.coding.programs;

import java.util.*;

public class _002FindDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B", "D", "A");

        List<String> unique = new ArrayList<>();
        Set<String> duplicates = new HashSet<>();

        for (String str: list){
            if (!unique.contains(str)){
                duplicates.add(str);
            }
        }
        System.out.println("Original List : " + list);
        System.out.println("Duplicates    : " + duplicates);
    }
}
