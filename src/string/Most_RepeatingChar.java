package string;

import string.stringToIntConverter.Char_abcdef;

import java.util.HashMap;
import java.util.Map;

public class Most_RepeatingChar {

    public static void main(String[] args) {
        String str="success";
        char s[]=str.toCharArray();
        int large=0;

        Map<Character, Integer> map= new HashMap<>();

        for(int i=0;i< s.length;i++)
        {
            char ch= s[i];
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
                large++;
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        // Step 2: Find most repeating character
        char maxChar = 0;
        int maxCount = 0;

    }
}
