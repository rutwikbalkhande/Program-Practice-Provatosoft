package string;

public class MainOverload {

    public static void main(String[] args) {
        System.out.println("original main method");

        main(10);
       // main("hello");
    }

    public static void main(String s) {
        System.out.println("main overload pass String in main: "+ s);

    }

    public static void main(int a) {
        System.out.println("main overload pass int in main: "+ a);
    }
}
