import java.util.*;
class FactorsOfNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num/2 ; i++){
            if(num % i == 0){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
}