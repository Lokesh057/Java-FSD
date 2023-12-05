package com.Assist;
import java.util.Arrays;
public class FourthSmallestElement {

	public static void main(String[] args) {

		        int[] unsortedList = {10, 5, 8, 3, 7, 1, 9, 4, 2, 6};

		        int fourthSmallest = findFourthSmallest(unsortedList);

		        System.out.println("Original List: " + Arrays.toString(unsortedList));
		        System.out.println("Fourth Smallest Element: " + fourthSmallest);
		    }

		    private static int findFourthSmallest(int[] arr) {
		        if (arr.length < 4) {
		            throw new IllegalArgumentException("List must have at least four elements");
		        }

		        // Sorting the array
		        Arrays.sort(arr);

		        // Accessing the element at index 3 (4th smallest)
		        return arr[3];
		    }


}
