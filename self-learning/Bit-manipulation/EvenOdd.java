public class EvenOdd {

    public static void checkEvenOdd(int num){
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(5); // Number is odd
        checkEvenOdd(14); // Number is even
        checkEvenOdd(17); // Number is odd
    }
}