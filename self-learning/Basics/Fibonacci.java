import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a+" "+b+" ");
    for(int i = 3; i <= n; i++){
        int c = a + b;
        System.out.print(c+" ");
        a = b;
        b = c;
    }
    }
}