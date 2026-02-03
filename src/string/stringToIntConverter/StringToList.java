package string.stringToIntConverter;

import java.util.Arrays;
import java.util.List;

public class StringToList {

    public static void main(String[] args) {

        String s = "apple,bannana,mango";           //["apple", "banana", "orange"]

        List<String> ls = Arrays.asList(s.split(","));

        System.out.println(ls);
    }
}
