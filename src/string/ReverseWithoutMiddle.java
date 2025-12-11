package string;

public class ReverseWithoutMiddle {

    public static void main(String[] args) {

        String str="Rutwikl";

        String rev="";

        int len= str.length();
        int mid=len/2;

        for(int i=mid-1;i>=0;i--)
        {
            rev= rev +str.charAt(i);
        }

            rev=rev+str.charAt(mid);
         for(int i=mid+1; i<len ; i++)
         {
             rev= rev+ str.charAt(i);
         }
        System.out.println(rev);
    }
}
