// 3121. Count the Number of Special Characters II
public class NumberOfSpecialChars {
    static int numberOfSpecialChars(String word) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        // initialize
        for (int i = 0; i < 26; i++) {
            lower[i] = -1;
            upper[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i;
            } else {

                int idx = ch - 'A';

                // store first uppercase occurrence only
                if (upper[idx] == -1) {
                    upper[idx] = i;
                }
            }
        }
        int count = 0;

        // check special characters
        for (int i = 0; i < 26; i++) {

            if (lower[i] != -1 &&
                    upper[i] != -1 &&
                    lower[i] < upper[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }
}
