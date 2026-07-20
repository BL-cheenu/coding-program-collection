package com.coding.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _001RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B");

        List<String> uniqueList = new ArrayList<>();
        for (String str : list) {
            if (!uniqueList.contains(str)) {
                uniqueList.add(str);
            }
        }
        System.out.println("Original List : " + list);
        System.out.println("Unique List   : " + uniqueList);
    }
}
