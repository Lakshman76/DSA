public class SumOfNatural {

    public static int calculateSum(int n){
        if (n == 1) {
            return 1;
        }
        int sum = n + calculateSum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }
}