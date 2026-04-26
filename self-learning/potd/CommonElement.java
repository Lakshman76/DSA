
// https://www.geeksforgeeks.org/problems/common-elements1132/1
import java.util.ArrayList;

public class CommonElement {
    static ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        int l = a.length;
        int m = b.length;
        int n = c.length;
        int lastAdded = Integer.MIN_VALUE;

        while (i < l && j < m && k < n) {
            int val1 = a[i];
            int val2 = b[j];
            int val3 = c[k];
            if (val1 == val2 && val2 == val3) {
                if (lastAdded != val1) {
                    result.add(val1);
                    lastAdded = val1;
                }
                i++;
                j++;
                k++;
            } else if (val1 <= val2 && val1 <= val3) {
                i++;
            } else if (val2 <= val1 && val2 <= val3) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 3, 3, 3, 6, 9, 10 };
        int b[] = { 6, 9 };
        int c[] = { 6, 9 };
        System.out.println(commonElements(a, b, c));
    }
}
