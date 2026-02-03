package string;
import java.util.HashSet;
import java.util.Set;

public class SubString_Set {

    public static void main(String[] args) {

        String str = "abcabcdeabbbvmjklhd";
        String longest = "";
        int start=0;
        int end=0;

        for (int i = 0; i < str.length(); i++) {

            Set<Character> set = new HashSet<>();
            String current = "";

            for (int j = i; j < str.length(); j++) {

                char c = str.charAt(j);

                // duplicate found
                if (set.contains(c)) {
                    break;
                }

                set.add(c);
                current += c;
            }

            if (current.length() > longest.length()) {
                longest = current;

                start = i;          // index starting and ending
                end = i + current.length() - 1;
            }
        }

        System.out.println("Longest Substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}