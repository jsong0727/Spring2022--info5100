import java.util.Deque;
import java.util.LinkedList;

/*20*/
public class ValidParenthese {
    public static void main(String[] args) {
        String input1 = "()[]{}";
        String input2 = "([)]";
        System.out.println(isValid(input1));
        System.out.println(isValid(input2));
    }

    public static boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                deque.push(')');
            } else if (ch == '[') {
                deque.push(']');
            } else if (ch == '{') {
                deque.push('}');
            } else if (deque.isEmpty() || deque.peek() != ch) {
                return false;
            } else {
                deque.pop();
            }
        }
        return deque.isEmpty();
    }
}
