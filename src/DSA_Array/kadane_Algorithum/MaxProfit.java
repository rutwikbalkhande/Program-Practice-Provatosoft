package DSA_Array.kadane_Algorithum;

public class MaxProfit {

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum=0;
        int max= Integer.MIN_VALUE;
        int start=0; int end=0; int tempstart=0;

        for(int i=0; i < arr.length;i++)
        {
            sum = sum+ arr[i];
            if (sum > max) {

                max= sum;
                start = tempstart;
                end =i;
            }
            if(sum < 0){
                sum =0;
                tempstart = i+1;
            }
        }
        System.out.println("max subArray: " + max);
        System.out.println("start index: " +start);
        System.out.println("end index: " + end);
    }
}
