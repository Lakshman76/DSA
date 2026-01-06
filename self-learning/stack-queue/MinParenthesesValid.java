import java.util.Stack;

public class MinParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }

            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        MinParenthesesValid mpv = new MinParenthesesValid();
        System.out.println(mpv.minAddToMakeValid("))("));
        System.out.println(mpv.minAddToMakeValid(")()()("));
        System.out.println(mpv.minAddToMakeValid("(())("));

    }
}
