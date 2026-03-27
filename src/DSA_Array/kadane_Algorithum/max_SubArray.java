package DSA_Array.kadane_Algorithum;

public class max_SubArray {

    public static void main(String[] args) {

        int []arr = {-2,-4,4,2,-5,4};
        int currentsum= 0;
        int max= Integer.MIN_VALUE;

        int start=0;    int tempstart= 0;
         int end =0;

        for(int i=0; i< arr.length; i++){

            currentsum = currentsum +arr[i];

            if(currentsum > max){
                max= currentsum;

                start = tempstart;
                end = i;
            }
            if(currentsum < 0){
                currentsum =0;
                tempstart = i+1;
            }
        }
        System.out.println("max sum: "+ max);
        System.out.println("start index: "+ start);
        System.out.println("end index: "+ end);
    }
}
