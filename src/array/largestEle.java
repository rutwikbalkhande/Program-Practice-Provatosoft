package array;

import java.util.Arrays;

public class largestEle {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 56, 72};
        int max1=0;
        int max2=0;

        for(int i=0; i< arr.length;i++){
            if(arr[i] > max1){
                max2= max1;
                max1= arr[i];
            }
            if(arr[i] > max2 && arr[i]< max1){
                max2= arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("1st largest : " + arr[arr.length-1]);
        System.out.println("1st largest ele max1 : "+ max1);
        System.out.println("2nd largest ele max2:"+ max2);
    }
}
