public class BubbleSort {
    public static void sort(int[] array) {
        int length = array.length;
        int aux;
        boolean isChanged = true;

        int swapps = 0;
        int comparisons = 0;

        for (int i = 0; i < length - 1 & isChanged == true; i++) {
            isChanged = false;
            for (int j = 0; j < length - i - 1; j++) {
                comparisons++;
                if (array[j] > array[j + 1]) {
                    isChanged = true;
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    swapps++;
                }
            }
        }

        System.out.println("\n\nComparaçoes: " + comparisons);
        System.out.println("Trocas: " + swapps);
    }
}
