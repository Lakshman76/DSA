public class StrFunction {

    public static void main(String[] args) {
        String name = "Lakshman kr";

        // length
        System.out.println("Length: " + name.length()); // Length: 11

        // concatenation
        String firstName = "Iron";
        String lastName = "man";
        String hero = firstName + lastName;
        System.out.println(hero); // Ironman

        // character at given index
        System.out.println(name.charAt(3)); // s
    }
}