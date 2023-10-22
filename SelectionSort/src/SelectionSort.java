public class SelectionSort {
    public static void sort(int[] array) {
        int length = array.length;
        int aux;
        int minIndex;

        int swapps = 0;
        int comparisons = 0;

        for (int i = 0; i < length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < length - 1; j++) {
                comparisons++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            aux = array[i];
            array[i] = array[minIndex];
            array[minIndex] = aux;
            swapps++;
        }

        System.out.println("\n\nComparaçoes: " + comparisons);
        System.out.println("Trocas: " + swapps);
    }
}
