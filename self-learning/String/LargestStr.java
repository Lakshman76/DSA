public class LargestStr {

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana", "orange", "dates" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println("Largest : " + largest); // orange
    }
}