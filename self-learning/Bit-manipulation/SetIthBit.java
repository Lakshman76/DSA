public class SetIthBit {

    public static int setIthBit(int num, int ithBit){
        int bitMask = 1 << ithBit;
        return num | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2)); // 14
    }
}