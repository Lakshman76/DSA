public class Factorial {

    public static int findFactorial(int n){
        if (n == 0) {
            return 1;
        }
        int fact = n * findFactorial(n - 1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }
}