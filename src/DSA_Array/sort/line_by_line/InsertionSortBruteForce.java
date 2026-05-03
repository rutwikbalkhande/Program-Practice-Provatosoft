package DSA_Array.sort.line_by_line;

import java.util.Arrays;

public class InsertionSortBruteForce {

    public static void main(String[] args) {

        int arr[]={7,8,3,1,2};
        int len= arr.length;


        for(int i=1;i<len;i++){
            int tem= arr[i];
            int j;
            for( j=i-1; i>=0;j--){

                if(arr[j] > tem){
                    //shift
                    arr[j+1]= arr[j];
                }
                else{   // stop
                    break;
                }
            }
            arr[j+1]= tem;
        }

        System.out.println("Insertion sort "+ Arrays.toString(arr));

    }
}
