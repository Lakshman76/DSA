public class StackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        System.out.println(stack.push(7));
        stack.push(9);
        stack.push(3);
        stack.push(10);
        stack.push(20);
        // stack.push(20);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        DynamicStack dstack = new DynamicStack(3);
        System.out.println(dstack.push(5));
        dstack.push(9);
        dstack.push(3);
        dstack.push(10);
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
    }

}
