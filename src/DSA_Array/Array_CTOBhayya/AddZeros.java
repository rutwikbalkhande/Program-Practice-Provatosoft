package DSA_Array.Array_CTOBhayya;

import java.util.Arrays;

public class AddZeros {
/* Input  : [1,0,2,3,4,0,5,0]
Output : [1,0,0,2,3,4,0,0]
This problem means duplicate every 0 and shift elements right, keeping the array size the same.
 */

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 4, 0, 5, 0};        //  o/p= 1,0,0,2,3,4,0,0

        int num[]= new int[arr.length];

        int n=0;
        for(int i=0;i< arr.length && n<arr.length; i++){

            if(arr[i]==0){
                num[n]=0;
                n++;

                if(n < arr.length){
                    num[n]=0; n++;
                }
            }
            else{
                num[n]= arr[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(num));

    }
}
