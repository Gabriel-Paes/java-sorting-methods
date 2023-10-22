public class App {
    public static void main(String[] args) throws Exception {
        int[] array = { 1, 3, 2, 4, 6, 5, 8, 7 };

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        BubbleSort.sort(array);

        System.out.println("\n\nsort:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
