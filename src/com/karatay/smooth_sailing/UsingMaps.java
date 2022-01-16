package com.karatay.smooth_sailing;

import java.util.HashMap;
import java.util.Map;

public class UsingMaps {
    public static void main(String[] args) {
        String str = "aaabbc";
        System.out.println("Most repeated char and frequency: " + charFrequency(str));
    }

    public static Pair charFrequency(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            max = Math.max(max, map.get(ch));
        }

        char maxChar = 0;
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() >= max) {
                max = set.getValue();
                maxChar = set.getKey();
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Max char: " + maxChar);
        Pair p = new Pair();
        p.key = maxChar;
        p.val = max;

        return p;
    }

    private static class Pair {
        char key;
        int val;

        @Override
        public String toString() {
            return "Pair{" +
                    "key=" + key +
                    ", val=" + val +
                    '}';
        }
    }
}
