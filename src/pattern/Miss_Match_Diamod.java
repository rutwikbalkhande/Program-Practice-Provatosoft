package pattern;

public class Miss_Match_Diamod {

        public static void main(String[] args) {

                for (int r = 1; r <= 5; r++) {
                    for (int s = 1; s <= 5 - r; s++) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= r; c++) {
                        System.out.print(c + " ");
                    }
//Reverse
                }
                System.out.println();

                for (int r = 5; r >= 1; r--) {
                    for (int s = 1; s <= (5 * 2) - r; s++) {
                        System.out.print(" ");
                    }
                    for (int c = 1; c <= r; c++) {
                        System.out.print(c + " ");
                    }
                    System.out.println();
                }
            }
        }