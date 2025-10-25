public class RemoveChar {

    static String removeChar(String str, String ans) {
        if (str.isEmpty()) {
            return ans;
        }
        if (str.charAt(0) != 'a') {
            ans += str.charAt(0);
        }
        return removeChar(str.substring(1), ans);
    }

    static String removeChar2(String str) {
        if (str.isEmpty()) {
            return "";
        }
        String ch = "";
        if (str.charAt(0) != 'a') {
            ch += str.charAt(0);
        }
        return ch.concat(removeChar2(str.substring(1)));
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "bcapplecad";
        System.out.println(skipApple(str));
    }
}
