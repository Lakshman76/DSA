import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                } else {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("({[()]})"));
        System.out.println(vp.isValid("({]})"));
        System.out.println(vp.isValid("({[]})"));
        System.out.println(vp.isValid("{[(]})"));

    }

}
