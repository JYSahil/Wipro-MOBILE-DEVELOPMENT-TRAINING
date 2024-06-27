public class Swapelements {

    // Generic method
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices provided for swapping.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static <T> void printArray(T[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {
    
        Object[] mixedArray = {1, 2, 3, 4, 5, "A", "B", "C", "D"};
        System.out.println("Original Array: ");
        printArray(mixedArray);


        swap(mixedArray, 0, 5); // Swap 1 with A
        swap(mixedArray, 1, 6); // Swap 2 with B

        System.out.println("\nArray after swapping: ");
        printArray(mixedArray);
    }
}
