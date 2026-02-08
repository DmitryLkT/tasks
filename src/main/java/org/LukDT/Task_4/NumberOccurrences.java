package org.LukDT.Task_4;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurrences {
    public static Map<String, Integer> numberOccurrences(String text) {
        Map<String, Integer> map = new HashMap<>();

        if(text == null) return map;

        text = text.toLowerCase().trim();
        if(text.isEmpty()) return map;

        String[] words = text.split(" ");

        for(String word : words) {
            if(word.isEmpty()) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }
}
