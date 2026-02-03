package string;

import java.util.Arrays;

public class Longest_Char_Index {

    // find starting & ending index of most repeating character.

    public static void main(String[] args) {

        String s = "a,d,c,d,s,a,a,b,b,b,b,b,d,d,d";     // "b" repeating most time o/p start=7, end=11
        String str[]= s.split(",");
        String arr[]= new String[str.length];

        //adding character in String arr
        for(int i=0;i<str.length;i++)
        {
            arr[i]= str[i];
        }

        // checking most repeating character
        int max=0;
        int start=0;
        int end=0;
        String character="";
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            int j;
            for( j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    count++;
                }
                else{
                    break;
                }
            }
            if(count > max)
            {
                max= count;
                start=i;
                end=j-1;
                character = str[i];

            }
            i=j-1;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(start);
        System.out.println(end);
        System.out.println(character);

    }
}
