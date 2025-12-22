package array;


import java.util.Arrays;

public class ReverseArray {
    // rotate array reverse without using extra space { dont use new arrays use }
    public static void main(String[] args) {

        int arr[] = {3, 1 ,4, 2, 5};                     // o/p  arr2: [2, 5, 3, 1, 4]

        System.out.println("arr:"+ Arrays.toString(arr));

        int start=0;
        int end= arr.length-1;

        while(start < end)
        {
            int temp= arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++; end--;
        }

            System.out.println("Rotate Arr:  " + Arrays.toString(arr));

    }}
