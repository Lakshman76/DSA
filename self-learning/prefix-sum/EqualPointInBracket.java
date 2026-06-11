// https://www.geeksforgeeks.org/problems/find-equal-point-in-string-of-brackets2542/1

public class EqualPointInBracket {
    static int findIndex(String s) {
        int n = s.length();
        int[] prefix = new int[n + 1];
        int[] suffix = new int[n + 1];
        
        prefix[0] = 0;
        suffix[n] = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '(') {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
            
            if(s.charAt(n - i - 1) == ')') {
                suffix[n - i - 1] = suffix[n - i] + 1;
            } else {
                suffix[n - i - 1] = suffix[n - i];
            }
        }
        for(int i = 0; i <= n; i++) {
            if(prefix[i] == suffix[i]) return i;
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = ")";
        System.out.println(findIndex(s));
    }
}
