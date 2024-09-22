/*
e.g-
1
2  3
4  5  6
7  8  9  10
11 12 13 14
*/

import java.util.Scanner;

public class Floyd_triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int row = sc.nextInt();
    int k = 1;
    for (int i = 1; i < row; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print((k++) + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}