public class PrintIncreasingOrder {

    public static void printIncreasingOrder(int n){
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        printIncreasingOrder(n - 1);
        System.out.print(n+" ");
    }
    
    public static void main(String[] args) {
        printIncreasingOrder(10);
        System.out.println();
    }
}