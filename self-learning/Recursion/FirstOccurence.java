public class FirstOccurence {

    public static int firstOccurence(int arr[], int key, int idx){
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == key) {
            return idx;
        }
        return firstOccurence(arr, key, idx + 1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 4, 7, 9};
        int key = 9;
        System.out.println(firstOccurence(arr, key, 0));
    }
}