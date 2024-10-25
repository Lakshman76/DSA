public class ClearIBit {

    public static int clearIBit(int num, int i){
        int bitMask = (~0) << i;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBit(15, 2)); // 12
        System.out.println(clearIBit(15, 3)); // 8
    }
}