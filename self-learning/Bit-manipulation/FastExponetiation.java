public class FastExponetiation {

    public static int fastExponetiation(int num, int pow){
        int ans = 1;
        while (pow > 0) {
            if((pow & 1) != 0){
                ans = ans * num;
            }
            num = num * num;
            pow = pow >> 1;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(fastExponetiation(3, 5)); // 243
        System.out.println(fastExponetiation(5, 3)); // 125

    }
}