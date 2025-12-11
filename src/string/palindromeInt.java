package string;

public class palindromeInt {

    public static void main(String[] args) {
        int num=121;      //123
        int rev;


        StringBuilder sb= new StringBuilder();
        sb.append(num).reverse();

       rev=Integer.parseInt(sb.toString());
       if(num==rev){
           System.out.println("palindrome");
       }
       else{
           System.out.println("not palindrome");
       }
    }
}
