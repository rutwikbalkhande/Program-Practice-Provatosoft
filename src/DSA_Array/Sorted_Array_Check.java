package DSA_Array;

public class Sorted_Array_Check {
//  Check if array is sorted
    public static void main(String[] args) {

        int arr[] = {1,5,3,4};

        boolean isSorted= true;
        for(int i=0;i < arr.length-1;i++)
        {
            if(arr[i] > arr[i+1]){

                isSorted = false;
            }
        }
        if(isSorted == true){
            System.out.println("sorted");
        }
        else {
            System.out.println("not sorted");
        }

    }
}
