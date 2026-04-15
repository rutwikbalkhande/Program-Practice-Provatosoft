package pattern;

public class Diamond_num_Star {
/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 * * * *
  * * *
   * *
    *
 */
    public static void main(String[] args) {

        for(int r=1;r<=5;r++)
        {
            for(int s=1;s<=(5-r);s++)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++)
            {
                System.out.print(c+ " ");


            }
            System.out.println();
        }
// reverse Trangle print start from 6th line

        for(int r=4;r>=1;r--)
        {
            for(int s=1;s<=(5-r);s++)
            {
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
