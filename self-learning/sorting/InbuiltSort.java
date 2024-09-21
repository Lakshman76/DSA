import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void displayArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void displayIntegerArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ASCENDING ORDER
        int arr1[] = { 4, 1, 5, 3, 2 };
        Arrays.sort(arr1);
        displayArr(arr1);  // 1 2 3 4 5

        // parse sorting 
        int arr2[] = { 4, 1, 5, 3, 2 };
        Arrays.sort(arr2, 0, 3);
        displayArr(arr2); // 1 4 5 3 2 

        // DESCENDING ORDER
        Integer arr3[] = { 4, 1, 5, 3, 2 };
        Arrays.sort(arr3, Collections.reverseOrder());
        displayIntegerArr(arr3); // 5 4 3 2 1

        // parse sorting 
        Integer arr4[] = { 4, 1, 5, 3, 2 };
        Arrays.sort(arr4, 0, 3, Collections.reverseOrder());
        displayIntegerArr(arr4); // 5 4 1 3 2 
    }
}