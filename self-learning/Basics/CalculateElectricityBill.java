/* 
    1 to 100 units - Rs.10/unit
    100 to 200 units - Rs.15/unit
    200 to 300 units - Rs.20/unit
    above 300 units - Rs.25/unit
*/

import java.util.*;
class CalculateElectricityBill {
    public static int calculateBill(int totalUnit){
        int cost = 10;
        int unit = totalUnit;
        int result = 0;
        while(unit > 0){
            unit = totalUnit - 100;
            if(unit <= 0){
                result += (totalUnit * cost);
            } else {
                result += (100 * cost);
                cost += 5;
                totalUnit -= 100;
            }
            if(cost == 25){
                return result + (totalUnit * cost);
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electricity Bill \t");
        int totalUnit = sc.nextInt();
        System.out.println("Total Bill = " + calculateBill(totalUnit));
    }
}