package pattern;

public class Trangle {
    /*
                    *
                   * *
                  * * *
                 * * * *
*/
    public static void main(String[] args) {

        for(int r=1;r<=4;r++)
        {
            for(int s=1;s<=5-r;s++) {
                System.out.print(" ");

            }
            for(int c=1;c<=r;c++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

