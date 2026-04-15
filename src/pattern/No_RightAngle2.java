package pattern;

public class No_RightAngle2 {
/*
1
23
345
4567
 */
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int num = i;
// Set the starting number for each row


            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++; // Increment number
            }
            System.out.println(); // Move to the next line
        }
    }
}




