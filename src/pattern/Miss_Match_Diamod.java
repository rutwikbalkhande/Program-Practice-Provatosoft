package pattern;

public class Miss_Match_Diamod {

        public static void main(String[] args) {

            int n = 5;

            // Upper part
            for (int i = 1; i <= n; i++) {

                // Spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                // Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }

            // Lower part
            for (int i = n; i >= 1; i--) {

                // Spaces
                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }

                // Numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }

                System.out.println();
            }
        }
}