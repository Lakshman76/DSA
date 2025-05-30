/* 
    1 to 100 units - Rs.10/unit
    100 to 200 units - Rs.15/unit
    200 to 300 units - Rs.20/unit
    above 300 units - Rs.25/unit
*/

import java.util.*;
class CalculateElectricityBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electricity Bill \t");
        int totalUnit = sc.nextInt();
        if(totalUnit > 0 && totalUnit < 100){
            totalUnit *= 10;
        } else if(totalUnit >= 100 && totalUnit < 200){
            int unit = 100 * 10;
            totalUnit -= 100;
            totalUnit *= 15;
            totalUnit += unit;
        } else if(totalUnit >= 200 && totalUnit < 300){
            int unit1 = 100 * 10;
            int unit2 = 100 * 15;
            totalUnit -= 200;
            totalUnit *= 20;
            totalUnit += (unit1 + unit2);
        } else if(totalUnit >= 300){
            int unit1 = 100 * 10;
            int unit2 = 100 * 15;
            int unit3 = 100 * 20;
            totalUnit -= 300;
            totalUnit *= 25;
            totalUnit += (unit1 + unit2 + unit3);
        }
        System.out.println("Total Bill = "+totalUnit);
    }
}