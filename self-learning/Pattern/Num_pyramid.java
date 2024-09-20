/* 
e.g - 

    1
   2 2
  3 3 3 
 4 4 4 4
5 5 5 5 5

*/

import java.util.Scanner;

public class Num_pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Digit
      boolean toggle = true;
      for (int j = 1; j <= 2*i-1; j++) {
        System.out.print(toggle ? i : " ");
        toggle = !toggle;
      }
      System.out.println();
    }
  }
}