package com.provatosoft.assignment;

import java.util.Arrays;

public class MoveZeroRight {
    // move all zero Right;

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        int index=arr.length-1;

        for(int i= arr.length-1; i>=0;i--)
        {
            if(arr[i] !=0)
            {
                arr[index]=arr[i];
                index--;
            }
        }
        while(index>=0)
        {
            arr[index--]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}


