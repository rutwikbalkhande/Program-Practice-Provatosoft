package DSA_Array.sort;

import java.util.Arrays;

public class SelectionSort {
// select max value(i) and search min value. Select the smallest element and place it at correct position

    public static void main(String[] args) {

        int[] arr={49,74,36,18,13,20};

        for(int i=0;i< arr.length;i++){

            int min=i;                   // find min value index
            for(int j=i+1;j< arr.length;j++){

                if(arr[j] < arr[min]){     // compare arr[min] value with next value if value small then "j" index store in min to compare next.
                    min =j;
                }
            }
            int tem= arr[min];
            arr[min]= arr[i];
            arr[i]= tem;
        }

        System.out.println("Selection Sort" + Arrays.toString(arr));
    }
}
