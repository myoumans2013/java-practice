package arrays;

// checking if array is sorted in an ascending order

public class CheckifSorted {
    public static boolean isSorted(int[] array) {
        boolean isAscending = true; // initialize boolean variable

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
                break; // end the loop if array is descending
            }
        }
        return isAscending;
    }

    public static void main(String[] args) {
        int[] array = { 1, 5, 10, 10, 15, 16, 17 };
        System.out.println(isSorted(array));
    }
}