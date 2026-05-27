package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccuranceChar {

    //. count occurrences of each character in String
    // saperately count " " & "." as a special character combine
    // output : character occurance: { =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}

    public void character(){

        String str= "Start small. Ship something.";
        String s= str.toLowerCase();
        int specialChar=0;

        Map<Character, Integer> map= new HashMap<>();

        for(int i=0;i< s.length();i++){

            char ch= s.charAt(i);

            if(ch==' ' || ch=='.'){
                specialChar++;
            }
            else if (!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch, map.get(ch)+1);
            }
        }

        map.put('#' , specialChar);
        System.out.println(map);
    }



    public static void main(String[] args) {
        OccuranceChar o = new OccuranceChar();
           o.character();

    }}


