package com.Assist;
import java.util.Scanner;
public class RangeSum {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements (n): ");
		        int n = scanner.nextInt();

		        int[] array = new int[n];

		        System.out.println("Enter the elements of the array:");

		        for (int i = 0; i < n; i++) {
		            System.out.print("Element " + (i + 1) + ": ");
		            array[i] = scanner.nextInt();
		        }

		        System.out.print("Enter the range boundaries (L and R) where 0 <= L <= R <= n-1:\n");
		        System.out.print("L: ");
		        int L = scanner.nextInt();
		        System.out.print("R: ");
		        int R = scanner.nextInt();

		        // Check if the range is valid
		        if (L < 0 || R >= n || L > R) {
		            System.out.println("Invalid range!");
		        } else {
		            int sum = findRangeSum(array, L, R);
		            System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);
		        }
		        
		        scanner.close();
		    }

		    private static int findRangeSum(int[] arr, int L, int R) {
		        int sum = 0;

		        for (int i = L; i <= R; i++) {
		            sum += arr[i];
		        }

		        return sum;
		    }
		}



