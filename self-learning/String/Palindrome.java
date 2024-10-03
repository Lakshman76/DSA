public class Palindrome {

    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        if (checkPalindrome(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}