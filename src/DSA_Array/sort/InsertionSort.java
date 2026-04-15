package DSA_Array.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int arr[]={7,8,3,1,2};
        int len= arr.length;

<<<<<<< HEAD
        for(int i=1;i<len;i++){
=======
        for(int i=1; i<len; i++){
>>>>>>> db92610 (add new prgm)
            int current= arr[i];
            int j= i-1;

            while (j>=0 && current < arr[j]){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.println("Insertion sort "+ Arrays.toString(arr));

    }
}