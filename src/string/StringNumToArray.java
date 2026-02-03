package string;

import java.util.Arrays;

public class StringNumToArray {
    public static void main(String[] args) {

        String str= "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10 ";

        String s[]= str.trim().split(",");

        int arr[]= new int[s.length];
        for(int i=0;i< s.length;i++)
        {
            arr[i]= Integer.parseInt(s[i]);
        }

               System.out.println(Arrays.toString(s));
               System.out.println(Arrays.toString(arr));
    }
}
