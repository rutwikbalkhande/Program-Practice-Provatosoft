package string.stringToIntConverter;

import java.util.Arrays;

public class Saperate_Word {

    public static void main(String[] args) {

        String str= "java dev spring";
        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));
    }
}
