package DSA_Array;

import java.util.HashMap;
import java.util.Map;

public class Freqn_Of_Int_Ele {

    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,1,1,2,2,2};

        Map<Integer, Integer> map= new HashMap<>();

        for(int num: arr){
            if(!map.containsKey(num)){
                map.put(num, +1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
        }
        System.out.println(map);
    }
}
