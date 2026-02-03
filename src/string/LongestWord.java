package string;

import java.util.Arrays;

public class LongestWord {

    public static void main(String[] args) {
        String str= "hello i am rutwik ";
        String max="";

         String word[] = str.trim().split("\\s++");

        System.out.println(Arrays.toString(word));
        for(String n :word)
        {
            if(max.length() < n.length())
            {
                max = n;
            }
        }
        System.out.println("Longest word in string : " + max);
    }
}
