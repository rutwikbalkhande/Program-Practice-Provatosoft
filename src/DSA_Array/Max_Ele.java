package DSA_Array;

public class Max_Ele {
// find 1st & 2nd Largest element in array

    public static void main(String[] args) {

        int arr[]={-65,7,25,33,75,65,45,-2};

        int max= Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i] > max)
            {
                max= arr[i];
            }
            // second larget
            if(arr[i]< max && arr[i] > max2){
                max2= arr[i];
            }
        }
        System.out.println("1st largest ele: "+ max);
        System.out.println("2nd largest ele:" + max2);

    }
}
