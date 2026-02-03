package string;

import java.util.*;

public class Substring_window {
// find substring without using SbuString method

    public static void main(String[] args) {


        String str = "ABCABCDBB";

        // Stores character and its last index
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;        // start index of window
        int maxLen = 0;       // maximum length found
        String longest = "";  // longest substring

        for (int end = 0; end < str.length(); end++) {

            char ch = str.charAt(end);

            // If character already seen and inside current window
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            // Update last seen index
            map.put(ch, end);

            // Check current window length
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                longest = str.substring(start, end + 1);
            }
        }

        System.out.println("Longest Substring: " + longest);
        System.out.println("Length: " + maxLen);
    }
}