public class PrintInDecreasing {

    public static void printInDecreasingOrder(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printInDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        printInDecreasingOrder(10);
        System.out.println(); 
    }
}