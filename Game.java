import java.util.Scanner;
import java.util.Random;
public class Game
{ 
 public static void main(String arg[])
 {
  Scanner sc = new Scanner(System.in);
  Random r = new Random();
  int n = r.nextInt(50);
  System.out.println("Guess a no between 0 to 50");
  System.out.println("you have 5 chance to guess right no.");
  for(int i=1;i<=5;i++)
  {
   System.out.println("Enter number "+i);
   int m=sc.nextInt();
   if(m>n)
     System.out.println(" Wrong! \n original no. is less than "+m);
   else if(m<n)
       System.out.println(" Wrong! \n original no. is greater than "+m);
   else {
       System.out.println(" !Congrats! you guessed right no.");
       break;  } 
  }
  System.out.println("\n Answer is "+n);
  System.out.println("\t \tTHANKS FOR TRYING");
 }
}
  
 