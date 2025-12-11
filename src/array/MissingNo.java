package array;

public class MissingNo {
    public static void main(String[] args) {

        int arr[]= {1,3,4,7,8,9,2};
        int j=0;
        int miss;
        for(int i=1 ; i<=arr.length ; i++)
        {
            if(arr[j]==i)
            {
                j++;
            }
            else {
                System.out.println("missing No :" + i);

            }
        }
        System.out.println("Array length: "+ arr.length);
    }
}
