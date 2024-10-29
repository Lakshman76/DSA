public class SwapTwoNum {

    public static void swapTwoNum(int num1, int num2){
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Num1 = "+num1+" Num2 = "+num2);
    }
    public static void main(String[] args) {
        int num1 = 3, num2 = 5;
        System.out.println("Num1 = "+num1+" Num2 = "+num2);
        swapTwoNum(num1, num2);
    }
}