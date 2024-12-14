public class LastOccurence {

    public static int lastOccurence(int arr[], int key, int idx){
        if (idx == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, idx + 1);
        if (isFound == -1 && arr[idx] == key) {
            return idx;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 4, 7, 9};
        int key = 6;
        System.out.println(lastOccurence(arr, key, 0));
    }
}