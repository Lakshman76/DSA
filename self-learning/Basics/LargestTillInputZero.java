import java.util.*;
class LargestTillInputZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest = 0;
        while(num != 0){
            if(num > largest){
                largest = num;
            }
            num = sc.nextInt();
        }
        System.out.println("Largest number is "+ largest);
    }
}