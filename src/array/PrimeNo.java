package array;

public class PrimeNo {

    public static void main(String[] args) {

        int start=0;
        int end=30;

        System.out.println("prime No 0 to 30");
        for(int i=start;  i<end;i++)
        {
            int temp=0;
            for(int j=2; j< i;j++)
            {
                if(i %j ==0)
                {
                    temp++;
                }
            }
            if(temp==0 && i>1)
            {
                System.out.println(i);
            }
        }
    }
}
