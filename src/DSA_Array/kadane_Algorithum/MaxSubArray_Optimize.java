package DSA_Array.kadane_Algorithum;

public class MaxSubArray_Optimize {

    public static void main(String[] args) {

        int []arr = {-2,1,2,-4};

        int currentsum = arr[0];
        int maxsum= arr[0];

        for(int i =1;i< arr.length;i++){

            currentsum = Math.max(arr[i] , currentsum + arr[i]);
            maxsum = Math.max(maxsum , currentsum);
        }
        System.out.println(maxsum);
    }
}
