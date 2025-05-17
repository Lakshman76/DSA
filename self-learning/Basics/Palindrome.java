import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        StringBuffer s2 = new StringBuffer("");

        for(int i = s1.length() - 1; i >= 0 ; i--){
            s2.append(s1.charAt(i));
        }
        
        if(s1.compareTo(s2.toString()) == 0){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}