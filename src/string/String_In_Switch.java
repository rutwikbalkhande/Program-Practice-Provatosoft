package string;

public class String_In_Switch {

    public static void main(String[] args) {

        String day= "abc";

        switch(day.toLowerCase()){

            case "monday":
                System.out.println("monday in switch");
                break;

            case "thusday":
                System.out.println("thusday in case");
                break;

            case "friday":
                System.out.println("friday in case");
                break;

            default:
                System.out.println("day not present");
        }
    }
}
