import java.util.Stack;

public class valideParentheses {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        if (isValidParentheses(input)) {
            System.out.println("The parentheses are valid.");
        } else {
            System.out.println("The parentheses are not valid.");
        }
    }
}

