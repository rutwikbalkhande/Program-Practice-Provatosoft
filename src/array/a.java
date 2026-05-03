package array;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max= Integer.MIN_VALUE;
        int sum=0;
        int start=0; int end=0;
        int temp=0;

        for(int i=0; i< arr.length;i++){
            sum= sum + arr[i];
            if(sum > max){
                max= sum;
                start =temp;
                end=i;
            }
            if(sum < 0){
                sum=0;
                temp= i + 1;

            }
        }
    }
}