package DSA_Array;

import java.util.Arrays;

public class Rotate_In_Pair_Odd {
//Rotate array in the pair of 2 

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        for(int i=0; i< arr.length;i++){

            if(i+1 < arr.length){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;

                i= i+1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
