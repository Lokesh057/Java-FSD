package com.search;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Array after Quick Sort: " + Arrays.toString(array));
    }

    // Quick sort algorithm
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array, arr[p..q-1] <= arr[q] <= arr[q+1..r]
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Partition the array into two halves
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the rightmost element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (put the pivot in its correct place)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }
}
