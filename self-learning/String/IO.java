import java.util.Scanner;

public class IO {

    public static void main(String[] args) {

        // String declaration.
        String str1 = "Laksh";
        String str2 = new String("kumar");

        // Input output

        Scanner sc = new Scanner(System.in);
        // String firstName;
        // firstName = sc.next(); // It will take only 1st word in a sentence
        // System.out.println(firstName);

        // To take whole sentence as input - use nextLine()
        String fullName;
        fullName = sc.nextLine();
        System.out.println(fullName);

    }
}