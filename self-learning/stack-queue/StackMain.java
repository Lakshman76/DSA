public class StackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        System.out.println(stack.push(7));
        stack.push(9);
        stack.push(3);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
