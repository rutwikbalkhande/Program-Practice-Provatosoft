package array;

import java.util.Arrays;

public class RotateArrayEasy {

    public static void main(String[] args) {

        int arr[] = {3, 1, 4, 2, 5};
        int find=2;
        int position=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == find)
            {
                position=i;
                break;
            }
        }
        int r[]=new int[arr.length];
        int index=0;
        int start=0;

        for(int i= position; i<arr.length;i++)
        {
            r[index++]=arr[position++];
        }
        while(index < arr.length)
        {
            r[index++]= arr[start++];
        }
        System.out.println(Arrays.toString(r));


    }
}
