/* 
e.g - 

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

*/

import java.util.Scanner;

public class Rhombus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      // star
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}