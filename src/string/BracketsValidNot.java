package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsValidNot {
// check opening closing brackets are correct or not use stack bez follow LIFO ?
//        "Push" = add data in stack , "peek()" = get last added element {LIFO based} , "pop()" = delete element

    public static void main(String[] args) {

        String str = "({[]})";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets → must match
            else {
                if (stack.isEmpty()) {
                    System.out.println("not balance");

                }


                // ️Check matching pair
                if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')) {

                    stack.pop();  // matched → remove
                }

            }
        }

        // 3️⃣ If stack empty → balanced
        if (stack.isEmpty()) {
            System.out.println("balance");
        } else {
            System.out.println("not balance");
        }
        System.out.println(stack);           // if not balence then show which not available
    }
}