package DSA_Array.Array_CTOBhayya;

public class MaxConsecutive_Ones {
//binary array 0,1 given find longeat pair of 1. ex last three 1 sequence is more.
    // Time Complexity O(n)
    //Space Complexity O(1)

    public static void main(String[] args) {

        int arr[]={1,0,1,1,0,1,1,1};

       int count=0;
        int max=0;

        int start=0;
        int end=1;
        int tempstart=0;

        for(int i=0;i< arr.length;i++){

            if(arr[i]==1){

                if(count == 0){
                    tempstart = i;
                }
                count++;

                if(count >  max){
                    max= count;
                    start = tempstart;
                    end = i;
                }
            }
            else{
                count=0;
            }
        }

        System.out.println("size of longest pair of 1= " + max + " times");
        System.out.println("starting index = " + start);
        System.out.println("ending index= " + end);

    }
}
