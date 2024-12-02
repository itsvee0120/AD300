public class GenericSortUtility {

    // Generic method to sort an array
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements if they're in the wrong order
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}