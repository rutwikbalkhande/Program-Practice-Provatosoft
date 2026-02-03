package string.stringToIntConverter;

import java.util.Arrays;

public class Char_abcdef {

    public static void main(String[] args) {

        String s = "abcd";
      char ch[]= s.toCharArray();
      String sm[]= new String[ch.length];
      for (int i=0;i<ch.length;i++)
      {
          sm[i]=String.valueOf(ch[i]);
      }
        System.out.println(Arrays.toString(sm));
    }
}

