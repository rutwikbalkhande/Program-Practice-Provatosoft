package string.stringToIntConverter;

import java.util.Arrays;

public class NoStringToarr {

    public static void main(String[] args) {

        String str= "12345";
        char ch[]=str.toCharArray();
        int arr[]= new int[ch.length];

for(int i=0;i<arr.length;i++)
{
    arr[i]= Integer.parseInt(String.valueOf(ch[i]));
}
        System.out.println(Arrays.toString(arr));
    }
}
