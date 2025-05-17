import java.util.*;
class DiffBtwTwoArmstrongNum{
    public static int countDigit(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static int findArmstrong(int num, int count){
        int ans = 0;
        for(int i = 1; i <= count; i++){
            int rem = num % 10;
            num /= 10;
            ans += Math.pow(rem, count);
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int digit1 = countDigit(num1);
        int digit2 = countDigit(num2);

        int result1 = findArmstrong(num1, digit1);
        int result2 = findArmstrong(num2, digit2);

        System.out.println(Math.abs(result1 - result2));
    }
}