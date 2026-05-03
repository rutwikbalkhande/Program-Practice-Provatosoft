package recursion;

public class calling_method {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        if(n==0) return;

        System.out.println("n: "+ n);
        print(n-1);
    }
}
