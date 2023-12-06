package com.search;
import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(array));

        insertionSort(array);

        System.out.println("Array after Insertion Sort: " + Arrays.toString(array));
    }

    // Insertion sort algorithm
    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place key in its correct position
            arr[j + 1] = key;
        }
    }
}
