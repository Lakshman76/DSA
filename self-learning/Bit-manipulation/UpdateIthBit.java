public class UpdateIthBit {

    public static int clearIthBit(int num, int ithBit){
        int bitMask = ~(1 << ithBit);
        return num & bitMask;
    }

    public static int setIthBit(int num, int ithBit){
        int bitMask = 1 << ithBit;
        return num | bitMask;
    }

    public static int updateIthBit(int num, int ithBit, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(num, ithBit);
        // }
        // else{
        //     return setIthBit(num, ithBit);
        // }

        // or

        num = clearIthBit(num, ithBit);
        int bitMask = newBit << ithBit;
        return num | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}