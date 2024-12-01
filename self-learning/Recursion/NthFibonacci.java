// fibonacci series - 0 1 1 2 3 5 8 13......

public class NthFibonacci {

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        return f1 + f2;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5)); // 5
    }
}