package algorithms;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchR(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Caso base: el elemento no está presente
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }

        return binarySearchRecursive(arr, target, mid + 1, right);
    }



}
