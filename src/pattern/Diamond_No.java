package pattern;

public class Diamond_No {

    public static void main(String[] args) { for(int i=1;i<=5;i++)
    {
        for(int s=1;s<=(5-i);s++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++) {
            System.out.print(j+ " ");
        }
        System.out.println();

    }
        for(int i=5;i>=1;i--)
        {
            for(int s=1;s<=(5-i);s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
 */