package DSA_Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = {2,7,11,15};
        int target = 13;

        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i< arr.length;i++){

            int remaining = target - arr[i];

            if(map.containsKey(remaining)){
                System.out.println("index: "+ map.get(remaining) + " , "+ i);
                break;
            }
            else{
                map.put(arr[i], i);
            }

        }

    /*    Map<Integer, Integer> map= new HashMap<>();

        for(int i=0;i< arr.length;i++){

            int compliment = target - arr[i];

            if(map.containsKey(compliment)){
                System.out.println("indices: "+ map.get(compliment) + " , "+ i);
            }
            else{
                map.put(arr[i], i);
            }
        }

     */
    }
}
