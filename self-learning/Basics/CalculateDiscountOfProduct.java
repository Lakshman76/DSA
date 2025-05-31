import java.util.*;
class CalculateDiscountOfProduct{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Price \t");
        int price = sc.nextInt();
        System.out.print("Enter discount (in %) \t");
        int discount = sc.nextInt();

        double savedPrice = (double) price * (discount / 100.0);
        double totalAmount = price - savedPrice;

        System.out.println("Yay! You saved RS "+ savedPrice);
        System.out.println("You have to Pay RS "+ totalAmount);
    }
}