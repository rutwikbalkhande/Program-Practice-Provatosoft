package DSA_Array.sort;

import java.util.Arrays;

public class a {

    static void bubble(int []arr){

       // int[] arr={49,74,36,18,13,20}

    }

    public static void main(String[] args) {
        int[] arr={49,74,36,18,13,20};
<<<<<<< HEAD
        bubble(arr);

=======
       // bubble(arr);

        for(int i=0;i< arr.length; i++) {

            int min=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[j]< arr[min]){
                        min = j;
                }
            }
              int tem= arr[min];
            arr[min] = arr[i];
            arr[i]= tem;
        }
>>>>>>> db92610 (add new prgm)
        System.out.println(Arrays.toString(arr));
    }
}
