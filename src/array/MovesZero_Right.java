package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovesZero_Right {

    // move zero right ? also use two for loop and use Swapping if(arr[i = 0){ }
//input = {0, 1, 0, 3, 12}  // output = [1, 3, 12, 0, 0]

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
         int index=0;

        for(int num : arr)
        {
            if(num !=0)
            {
                arr[index] = num;
                index++;
            }
        }
        while(index< arr.length)
        {
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
