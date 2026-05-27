package array;


import java.util.Arrays;
import java.util.Comparator;

public class a {

    public static void main(String[] args) {

        char arr[]={'b','a','f','e','d','c'};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j< arr.length;j++){

                if(arr[i]< arr[j]){
                    char c= arr[i];
                    arr[i]= arr[j];
                    arr[j]=c;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}


