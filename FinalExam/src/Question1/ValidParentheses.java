package Question1;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public static void main(String[] args) {
        String input1 = "()[]{}";
        System.out.println(isValid(input1));
        String input2 = "(]";
        System.out.println(isValid(input2));

    }

    public static boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char parenthese;
        for (int i = 0; i < s.length(); i++) {
            parenthese = s.charAt(i);
            if (parenthese == '(') {
                deque.push(')');
            } else if (parenthese == '[') {
                deque.push(']');
            } else if (parenthese == '{') {
                deque.push('}');
            } else if (deque.isEmpty() || deque.peek() != parenthese) {
                return false;
            } else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
