package edu.northeastern.jiayin.q6;

import java.util.HashMap;

public class LongestSubstring {
    
    public int longestSubstring(String string) {
        if (string.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        int longest = 0;
        for (int i = 0, j = 0; i < string.length(); ++i) {
            if (hashmap.containsKey(string.charAt(i))) {
                j = Math.max(j, hashmap.get(string.charAt(i)) + 1);
            }
            hashmap.put(string.charAt(i), i);
            longest = Math.max(longest, i - j + 1);
        }
        return longest;
    }
}
