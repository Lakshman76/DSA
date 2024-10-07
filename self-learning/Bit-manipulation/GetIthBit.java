public class GetIthBit {

    public static int getIthBit(int num, int ithBit){
        int bitMask = 1 << ithBit;
        if ((num & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(9, 3)); // 1
        System.out.println(getIthBit(11, 2)); // 0
    }
}