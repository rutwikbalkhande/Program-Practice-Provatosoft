package DSA_Array.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int arr[]= {5,3,8,4,2};

        for(int i=0;i< arr.length-1;i++){

            for(int j=0;j< arr.length-1-i;j++){

                if(arr[j] > arr[j+1]){
                    int tem= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
