package array;

import java.util.Arrays;

public class RotateArray {
// find position of 1 & start array from that position & left side ele. add at the end.
    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 1, 5};
        int len = arr.length;

        // find index of 1
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == 1) {
                index = i;
                break;
            }
        }

        int rotated[] = new int[len];

        for (int i = 0; i < len; i++) {
            rotated[i] = arr[(i + index) % len];

        }

        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}