public class IsPowerOfTwo {

    public static boolean isPowerOfTwo(int num){
        return (num & (num - 1)) == 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8)); // true
        System.out.println(isPowerOfTwo(13)); // false
    }
}