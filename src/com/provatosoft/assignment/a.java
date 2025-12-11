package com.provatosoft.assignment;

import java.util.*;

// ArmStrong number
public class a {
    public static void main(String[] args) {

//Given an array of integers, move all the 0 values to the end of the array while maintaining the relative order of the non-zero elements.
//
//input : [0, 1, 0, 3, 12]
//
//Output:[1, 3, 12, 0, 0]


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
