package array;

import java.util.Arrays;

public class BinarySearch2 {

    // binary search work inside sorted Array. calculate mid 7 check target value greater or Smaller than mid on that basis Low high move by 1

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9};
         int target=6;

         int low=0;
         int high= arr.length-1;
         int index=-1;

         while(low <= high)
         {
             int mid= low + (high- low)/2;

             if(arr[mid]== target)
             {
                 index = mid;
                 break;
             }

             if(target < arr[mid])
             {
                 high = mid-1;
             }
             else  {

                 low= mid + 1;
             }

         }
        System.out.println(target + " availble on index: "+ index);

    }
}