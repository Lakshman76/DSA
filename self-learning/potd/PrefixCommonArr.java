// 2657. Find the Prefix Common Array of Two Arrays

import java.util.HashMap;

public class PrefixCommonArr {
    static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        HashMap<Integer, Integer> freq = new HashMap<>();
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
            freq.put(B[i], freq.getOrDefault(B[i], 0) + 1);
            if (A[i] == B[i]) {
                if (freq.get(A[i]) == 2) {
                    total++;
                }
            } else {
                if (freq.get(A[i]) == 2) {
                    total++;
                }
                if (freq.get(B[i]) == 2) {
                    total++;
                }
            }

            ans[i] = total;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = { 5, 2, 3, 1 };
        int[] B = { 5, 3, 1, 2 };
        int[] ans = findThePrefixCommonArray(A, B);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
