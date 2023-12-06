package com.search;
import java.util.Scanner;
public class LinearSearch {

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

		        // Perform linear search
		        int index = linearSearch(array, searchElement);

		        // Display the result
		        if (index != -1) {
		            System.out.println("Element " + searchElement + " found at index " + index);
		        } else {
		            System.out.println("Element " + searchElement + " not found in the array");
		        }

		        scanner.close();
		    }

		    // Linear search algorithm
		    private static int linearSearch(int[] array, int key) {
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] == key) {
		                return i; // Return the index if the element is found
		            }
		        }
		        return -1; // Return -1 if the element is not found
		    }
		}

	


