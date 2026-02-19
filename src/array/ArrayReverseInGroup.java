package array;

import java.util.Arrays;

public class ArrayReverseInGroup {
    //reverse array in pair of group

    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        int len= arr.length;
       for (int i= 0; i< arr.length;i++)
       {
           int left=i;
           int right= Math.min(i+k-1, len-1);

           while(left < right){
               int tem= arr[left];
                arr[left]= arr[right];
                arr[right]= tem;

                left++; right--;
           }
           i= i+k;
           System.out.println(i);
       }
        System.out.println("reverse array in pair of group");
        System.out.println(Arrays.toString(arr));

    }
}
