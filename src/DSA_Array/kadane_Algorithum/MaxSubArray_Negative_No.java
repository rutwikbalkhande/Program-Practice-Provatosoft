package DSA_Array.kadane_Algorithum;

public class MaxSubArray_Negative_No {

    public static void main(String[] args) {

        int arr[] = {-5, -2, -8, -1};
        int max=Integer.MIN_VALUE;

        for(int i=0; i< arr.length;i++){

            int sum=0;
            for(int j=i; j< arr.length;j++){

                sum = sum + arr[i];
                if(sum > max ){
                    max= sum;
                }
            }

        }
        System.out.println(max);
        System.out.println();

    }
}
