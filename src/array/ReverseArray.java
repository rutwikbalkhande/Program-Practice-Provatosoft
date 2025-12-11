package array;


import java.util.Arrays;

public class ReverseArray {
    // rotate array
    public static void main(String[] args) {

        int arr[] = {3, 1 ,4, 2, 5};                     // o/p  arr2: [2, 5, 3, 1, 4]
        int d=2 ;
        int n= arr.length;

        int arr2[]=new int[arr.length];

        int p=0;
        int index=-1;    // find 2 is on which index.


        // find the 1 available on wjich position
        for(int i=0;i<n; i++)
        {
            if (arr[i] == d)
            {
                index= i;
                System.out.println( "index of 1: " + index);
                arr2[p]=arr[i];
                break;
            }
        }
               for(int j= index; j < n;j++)
               {
                   arr2[p]=arr[j];
                   p++;
               }
               for(int r=0;r<index;r++)
               {
                   arr2[p]= arr[r];
                   p++;
               }

            System.out.println("arr2: " + Arrays.toString(arr2));

    }}
