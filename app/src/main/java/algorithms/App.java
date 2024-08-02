
package algorithms;

public class App {

    public static void main(String[] args) {
        int[] array = Tools.generateArray(10);

        Tools.printArray(array);
        
        //MergeSort.mergeSort(array, "center");
        QuickSort.quicksort(array, 0, (array.length - 1));

        Tools.printArray(array);

    }
}
