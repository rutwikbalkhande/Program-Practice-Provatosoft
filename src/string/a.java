package string;


import java.util.*;

public class a {

    public static void main(String[] args) {

        String str = "abcabcdeabbbvmjklhd";
        String longest= " ";

        for(int i=0;i<str.length();i++)
        {
            Set<Character>set= new HashSet<>();
            String current=" ";

            char ch= str.charAt(i);

            if(!set.contains(ch))
            {
                set.add(ch);
                current = current + ch;
            }
            else{
                break;
            }
            if(current.length() > longest.length())
            {
                longest= current;
            }
        }

        System.out.println(longest);
    }
    }