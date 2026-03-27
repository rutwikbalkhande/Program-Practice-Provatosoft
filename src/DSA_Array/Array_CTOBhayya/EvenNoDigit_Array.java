package DSA_Array.Array_CTOBhayya;

public class EvenNoDigit_Array {
    /*
     Given an array of integers, count how many numbers have an even number of digits.
Input:  [12, 345, 2, 6, 7896]
Output: 2
Explanation:
12 → 2 digits (even)
345 → 3 digits (odd)
2 → 1 digit (odd)
6 → 1 digit (odd)
7896 → 4 digits (even)

Numbers with even digits = 2
     */

    public static void main(String[] args) {

        int arr[] = {12,345,2,6,7896};

            int count= 0;

        for(int num: arr){
            int digit = 0;

            while(num > 0){
             num = num /10;
             digit ++;
            }

            if(digit % 2 == 0){
                count++;
            }
        }

        System.out.println("Numbers with even digits: " + count);
    }
}
