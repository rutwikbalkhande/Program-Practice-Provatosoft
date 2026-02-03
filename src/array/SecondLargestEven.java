package array;

import java.util.LinkedList;


public class SecondLargestEven {
    //sum all no. one no. with anther no. and find 2nd largest even number

    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 6};

        int evencount= 0;
        int index=0;
        int h1=0;
        int h2=0;

        LinkedList<Integer> ls = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                int a = arr[i] + arr[j];

                ls.add(a);
                if(a % 2==0){
                    if (h1<a){

                        h2=h1;  // swipe for 2nd large even no.
                        h1=a;
                    }
                }
            }
        }

// list store in Array
        int[] arr2=new int[ls.size()];
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i]=ls.get(i);
        }
        for (int i:arr2){
            System.out.print("Array: " + i+" ");
        }

        System.out.println("ls"+ ls);
        System.out.println();
        System.out.println(h2);
    }
}
