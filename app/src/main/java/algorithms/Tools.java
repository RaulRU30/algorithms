package algorithms;

public class Tools {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000); // Números aleatorios entre 0 y 99
        }
        return array;
    }
    
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
