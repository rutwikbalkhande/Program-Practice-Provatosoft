package array;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 1, 5};
        int n = arr.length;

        // find index of 1
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                index = i;
                break;
            }
        }

        int rotated[] = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + index) % n];

        }

        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}