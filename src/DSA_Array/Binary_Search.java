package DSA_Array;

public class Binary_Search {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,9};
        int target=4;

        int low=0;
        int high= arr.length-1;

        int index=-1;
        while(low < high){
            int mid= low + (high - low)/2;

            if(target == arr[mid]){
                index= mid;
                break;
            }
            if(target < arr[mid]){
                high= mid-1;
            }
            else{
                low= mid+1;
            }

        }
        System.out.println(target + " availble on index: "+ index);
    }
}
