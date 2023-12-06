package com.search;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input array size
		        System.out.print("Enter the size of the sorted array: ");
		        int size = scanner.nextInt();

		        int[] array = new int[size];

		        // Input sorted array elements
		        System.out.println("Enter the sorted elements of the array:");
		        for (int i = 0; i < size; i++) {
		            System.out.print("Element " + (i + 1) + ": ");
		            array[i] = scanner.nextInt();
		        }

		        // Input the element to be searched
		        System.out.print("Enter the element to be searched: ");
		        int searchElement = scanner.nextInt();

		        // Perform binary search
		        int index = binarySearch(array, searchElement);

		        // Display the result
		        if (index != -1) {
		            System.out.println("Element " + searchElement + " found at index " + index);
		        } else {
		            System.out.println("Element " + searchElement + " not found in the array");
		        }

		        scanner.close();
		    }

		    // Binary search algorithm (assumes the array is sorted)
		    private static int binarySearch(int[] array, int key) {
		        int low = 0;
		        int high = array.length - 1;

		        while (low <= high) {
		            int mid = low + (high - low) / 2;

		            if (array[mid] == key) {
		                return mid; // Return the index if the element is found
		            } else if (array[mid] < key) {
		                low = mid + 1;
		            } else {
		                high = mid - 1;
		            }
		        }

		        return -1; // Return -1 if the element is not found
		    }
		}



