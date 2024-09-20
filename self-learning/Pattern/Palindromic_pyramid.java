/* 
e.g - 

    1
   212
  32123 
 4321234
543212345

*/

import java.util.Scanner;

public class Palindromic_pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // left half
      for (int j = i; j > 1; j--) {
        System.out.print(j);
      }
      // right half
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
}

      System.out.println();
    }
  }
}