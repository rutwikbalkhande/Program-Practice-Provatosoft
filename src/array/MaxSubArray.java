package array;

public class MaxSubArray {
    // find maximum sum of the sub Array using kadanes algorithm

    public static void main(String[] args) {

        int arr[]={-2,1,-3,4,5};
        int sum =0;                       // currentsum
        int max= Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int tempstart=0;

        for(int i=0; i< arr.length;i++){

            sum= sum + arr[i];

            if(sum > max){
                max=  sum;
                start= tempstart;
                end= i;
            }
            if(sum < 0){
                sum = 0;
                tempstart =i+1;
            }

        }
        System.out.println("max sum: " + max);
        System.out.println("start index: " + start);
        System.out.println("end index: "+ end);
    }
}