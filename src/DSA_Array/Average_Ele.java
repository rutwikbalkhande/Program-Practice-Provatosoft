package DSA_Array;

public class Average_Ele {
//Find average of array elements
    public static void main(String[] args) {

        int arr[]= {10, 20, 30, 40};

        int sum=0;
        for(int i=0;i< arr.length;i++){

            sum= sum + arr[i];
        }
        System.out.println("Average ele: " + sum / arr.length);
    }
}
