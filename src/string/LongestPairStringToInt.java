package string;

import java.util.Arrays;

public class LongestPairStringToInt {

    /*
        Given a String like 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,10
        print range of a number which is repeated most number of times continiuously.
        Example: 1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1

        Answer: 6,11 (2 repeated most number of times from index 6 to 11)
        1.Convert String To String Array[] -> int Array[]
         */

    public static void main(String[] args) {

        String s = "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1";

        String[] str = s.split(",");
        int[] arr = new int[str.length];

        for (int i = 0; i < str.length; i++) {             // Adding numbers String to int array
            arr[i] = Integer.parseInt(str[i]);
        }

        // start to check i & j
        int start=0;
        int end=0;
        int maxCount=1;

        for(int i=1;i < arr.length;i++) {

            int count =1;
            int j;
            for( j=i+1; j<arr.length;j++)
            {
                if(arr[j] == arr[i])
                {
                    count++;
                }
                else{
                    break;
                }
            }
            if(count > maxCount)
            {
                maxCount =count;
                start=i;
                end= j-1;
            }
            i= j-1;
        }

        System.out.println("Longest cosecative sequence Starting and ending index...");
        System.out.println(Arrays.toString(arr));

        System.out.println("starting index:" + start);
        System.out.println("ending index:"+ end);
        System.out.println("value:" + arr[start]);

    }
}