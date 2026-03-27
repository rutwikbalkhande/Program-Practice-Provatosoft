package string.stringToIntConverter;

import java.util.Arrays;

public class a {

    public static void main(String[] args) {
        String str = "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10";

        String s[]= str.trim().split(",",5);

        System.out.println(Arrays.toString(s));



    }
}
