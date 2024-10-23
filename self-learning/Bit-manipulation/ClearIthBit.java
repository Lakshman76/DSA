public class ClearIthBit {

    public static int clearIthBit(int num, int ithBit){
        int bitMask = ~(1 << ithBit);
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1)); // 8
        System.out.println(clearIthBit(14, 3)); // 6
    }
}