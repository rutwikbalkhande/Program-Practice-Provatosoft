package string;

import java.util.*;

public class Anagram2 {
    public static void main(String[] args) {

        String name = "listen,silent, enlist, rat,tar,art, top, pot, opt";

        String[] names = name.split(",");

        Map<String, String> map = new HashMap<>();

        for (String str : names) {
            char ch[] = str.trim().toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, str);
            } else {
                map.put(key, map.get(key) + " " + str);
            }
        }
        System.out.println(map);
    }
}