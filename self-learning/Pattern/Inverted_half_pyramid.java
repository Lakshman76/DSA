/*
e.g-
12345
1234
123
12
1
*/

import java.util.Scanner;

public class Inverted_half_pyramid {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
          for(int j = 1; j <= row-i+1; j++){
              System.out.print(j);
          }
          System.out.println();
        }
        sc.close();
      }
}