package pattern;

public class Reverse_RightAngle {
/*\
      * * * * *
      * * * *
      * * *
      * *
      *
 */
    public static void main(String[] args) {

        for (int r = 5; r >= 0; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}