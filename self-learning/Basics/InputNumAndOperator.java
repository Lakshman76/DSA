import java.util.*;
class InputNumAndOperator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt(); // it leaves another \n in the buffer

        sc.nextLine();  // this clears the leftover newline
        String operator = sc.nextLine();  // now reads actual user input
        
        switch(operator){
            case "+":
            System.out.println(num1 + num2);
            break;
            case "-":
            System.out.println(num1 - num2);
            break;
            case "*":
            System.out.println(num1 * num2);
            break;
            case "/":
            System.out.println(num1 / num2);
            break;
            case "%":
            System.out.println(num1 % num2);
            break;
            default:
                System.out.println("Welcome");
        }
        
        
    }
}