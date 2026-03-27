package string;

public class PalindromeInt_Without_Builder {

    public static void main(String[] args) {

        int num=121;
        int original=num;

        int rev=0;

        while(num > 0){
            int dig= num %10;                  // get last digit
            System.out.println(dig);
            rev =  rev * 10 + dig;

            num= num/10;                       //remove last digit
        }
        if(original == rev){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not");
        }
    }
}
