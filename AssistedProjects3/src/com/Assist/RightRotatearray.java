package com.Assist;
import java.util.Arrays;
public class RightRotatearray {

	public static void main(String[] args) {

		        int[] array = {1, 2, 3, 4, 5};
		        int steps = 2;

		        System.out.println("Original Array: " + Arrays.toString(array));

		        rightRotateArray(array, steps);

		        System.out.println("Array after right rotation by " + steps + " steps: " + Arrays.toString(array));
		    }

		    private static void rightRotateArray(int[] arr, int steps) {
		        int length = arr.length;
		        steps = steps % length; // Ensure steps is within the array length

		        reverseArray(arr, 0, length - 1);
		        reverseArray(arr, 0, steps - 1);
		        reverseArray(arr, steps, length - 1);
		    }

		    private static void reverseArray(int[] arr, int start, int end) {
		        while (start < end) {
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            start++;
		            end--;
		        }
		    }
		}

	


