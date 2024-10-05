public class CheckAnagram {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str2.length(); i++) {
            Character ch = str2.charAt(i);
            String strCh = ch.toString();
            if (!str1.contains(strCh)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(checkAnagram(str1, str2));
    }
}