package array;

import string.a;

import java.util.Arrays;

public class RangeOfTargetSum {

    public int[] toSum(int num[] , int target)

    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1; j<num.length;j++)
            {
                if(num[i] +num[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;

        RangeOfTargetSum obj= new RangeOfTargetSum();
        int result[]= obj.toSum(nums, target);

        System.out.println(Arrays.toString(result));
    }}


