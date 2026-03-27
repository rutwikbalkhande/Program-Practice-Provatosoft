package array;

public class Max_SecMax_Min_EleArray {

    public static void main(String[] args) {



    int[] arr = {10, 25, 3, 99, 56, 72};

    int max=0;
    int secondMax= 0;
    int small=0;

        for(int i=0;i< arr.length;i++)
    {
                            //1st largest value
        if(arr[i] > max)
        {
            secondMax = max;
            max= arr[i];
        }
                             // 2nd largest value
        if(arr[i] < max && arr[i]> secondMax)
        {
            secondMax = arr[i];
        }
                             // smallest value in array
        if(arr[i] > small && arr[i] < secondMax  )
        {
            small = arr[i];
        }
    }
        System.out.println( "larges value in array: " + max);
        System.out.println("2nd largest ele: " + secondMax );
        System.out.println("Small: "+ small);
}
}
