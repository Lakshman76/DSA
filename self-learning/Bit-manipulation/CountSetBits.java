public class CountSetBits {

    public static int countSetBits(int num){
        int count = 0;
        while (num > 0) {
            if((num & 1) != 0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(9)); // 2
        System.out.println(countSetBits(15)); // 4
    }
}