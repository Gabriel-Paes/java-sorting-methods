public class InsertionSort {
    public static void sort(int[] array) {
        int length = array.length;
        int sentinel;

        int swapps = 0;
        int comparisons = 0;

        for (int i = 1; i < length; i++) {
            sentinel = array[i];

            int j = i - 1;

            while (j >= 0 && sentinel < array[j]) {
                array[j + 1] = array[j];
                j--;
                comparisons++;
                swapps++;
            }

            array[j + 1] = sentinel;
            swapps++;
        }

        System.out.println("\n\nComparaçoes: " + comparisons);
        System.out.println("Trocas: " + swapps);
    }
}
