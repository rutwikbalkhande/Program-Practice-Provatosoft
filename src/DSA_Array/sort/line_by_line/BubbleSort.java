package DSA_Array.sort.line_by_line;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {50,30,10,40,20};

        for (int i = 1; i < arr.length; i++) {

            int temp= arr[i];
            int j= i-1;

            while(j >=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        System.out.println("Final Sorted: " + Arrays.toString(arr));
    }
}

