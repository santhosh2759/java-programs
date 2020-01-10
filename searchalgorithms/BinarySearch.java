package searchalgorithms;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = { 4, 10, 2, 3, 40 };
        int n = arr.length;
        int x = 10;
        bubbleSort(arr);
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    private static int binarySearch(int[] arr, int l, int r, int n) {
        if (l < r) {
            int m = l + (r - l) / 2;
            if (n == arr[m]) {
                return m;
            } else if (n < arr[m]) {
                return binarySearch(arr, l, m - 1, n);
            } else {
                return binarySearch(arr, m + 1, r, n);
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}