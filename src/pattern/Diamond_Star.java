package pattern;

public class Diamond_Star {

    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) {
            for (int s = 1; s <= 5 - r; s++) {
                System.out.print(" ");
            }
//3rd lind value of "r=3" After calculate "(r*2)-1" =5 mean 5 star print


            for (int c = 1; c <= (r * 2) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
// Reverse Triangle start to print after line no. 5th

        for (int r = 4; r >= 1; r--) {
            for (int s = 1; s <= 5 - r; s++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (r * 2) - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
          *
         ***
        *****
       *******
      *********
       *******
        *****
         ***
          *

 */