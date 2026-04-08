package string;

import java.util.Arrays;

public class Longest_Char_Index {

    // find starting & ending index of most repeating character in sequence.

    public static void main(String[] args) {

        String s = "a,a,d,a,b,b,b,b,b,d,d,d";     // "b" repeating most time o/p start=4, end=8
        String arr[]= s.split(",");

        int start=0;
        int end=0;
        int tempstart=0;

        int max=1;
        int count=1;

        for(int i=1; i< arr.length;i++){

            if(arr[i].equals(arr[i-1])){
                count++;
            }
            else{
                tempstart=i;     //
                count=1;        //refresh count
            }
            if(count > max){
                max=count;
                start=tempstart;
                end=i;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println("character: " + arr[start]);
        System.out.println("start index: " + start);
        System.out.println("end index: " + end);


    }
}
