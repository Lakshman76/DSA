public class ClearBitsInRange {

    public static int clearBitsInRange(int num, int i, int j){
        int A = (~0) << (j + 1);
        int B = (1 << i) - 1;
        int bitMask = A | B;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10, 2, 4)); // 2
        System.out.println(clearBitsInRange(23, 3, 5)); // 7
    }
}