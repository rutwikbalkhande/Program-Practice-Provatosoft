package string;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String s= "Hello Java is easy";
        String str[]= s.split("");

        String rev=" ";

        for(int i=str.length-1; i>=0;i-- )
        {
            rev= rev+ str[i] + " ";

        }

        System.out.println(Arrays.toString(str));
        System.out.println(rev + " ");

          }
}
