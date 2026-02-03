package array;

import java.util.Arrays;

public class ArrayReverseInGroup {
    //reverse array in pair of group

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        int n= arr.length;
        for(int i=0;i<n; i=i+k)
        {
            int left=i;
            int right=Math.min( i+k-1, n-1 );

            while(left < right)
            {
                int temp= arr[left];
                arr[left]= arr[right];
                arr[right]= temp;

                left++;
                right--;
            }
        }
        System.out.println("reverse array in pair of group");
        System.out.println(Arrays.toString(arr));

    }
}
