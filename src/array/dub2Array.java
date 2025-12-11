package array;

import java.util.ArrayList;
import java.util.List;

public class dub2Array {

    // find dublicate print only ones in array
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 3};
        int arr2[] = {2, 2, 3,5, 8,16,4};

        List<Integer> ls = new ArrayList<>();
          if(arr1.length > arr2.length)
          {
        for (int num : arr2) {
            for (int j = 0; j < arr1.length; j++) {
                if (!ls.contains(num)) {
                    if (num == arr2[j]) {
                        ls.add(num);
                    }
                }
            }
                  }
        }

        else {
            for(int  num :arr1)
            {
                for(int j=0;j< arr2.length;j++){
                    if(!ls.contains(num))
                    {
                        if(num== arr2[j]){
                            ls.add(num);
                        }
                    }
                }
            }

        }
            System.out.println(ls);
        }
    }

