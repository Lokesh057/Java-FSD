package com.search;
import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to be searched: ");
        int searchElement = scanner.nextInt();

        // Perform exponential search
        int index = exponentialSearch(array, searchElement);

        // Display the result
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }

        scanner.close();
    }

    // Exponential search algorithm
    private static int exponentialSearch(int[] array, int key) {
        if (array[0] == key) {
            return 0; // Return the index if the element is found at the first position
        }

        int i = 1;
        while (i < array.length && array[i] <= key) {
            i *= 2;
        }

        return Arrays.binarySearch(array, i / 2, Math.min(i, array.length), key);
    }
}
