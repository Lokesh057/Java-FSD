package LongSubsequence;

import java.util.Scanner;

public class LongestIncreasingSubequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input, Get the number of elements
        System.out.print("Enter the number of elements (n < 100): ");
        int n = scanner.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("Invalid input. Please enter a valid value for n.");
            return;
        }

        // Input: Get the list of numbers
        System.out.print("Enter the list of " + n + " numbers separated by spaces: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the longest increasing subsequence
        int[] lis = calculateLIS(numbers);

        // Display the result
        System.out.println("Longest Increasing Subsequence: ");
        for (int i : lis) {
            System.out.print(i + " ");
        }

        scanner.close();
    }

    // Function to calculate the Longest Increasing Subsequence
    private static int[] calculateLIS(int[] numbers) {
        int n = numbers.length;
        int[] lis = new int[n];
        int[] prevIndex = new int[n];

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            prevIndex[i] = -1;

            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    prevIndex[i] = j;
                }
            }
        }

        // Find the maximum value in list of array
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLength) {
                maxLength = lis[i];
                maxIndex = i;
            }
        }

        // Reconstruct the LIS
        int[] result = new int[maxLength];
        int currentIndex = maxIndex;

        for (int i = maxLength - 1; i >= 0; i--) {
            result[i] = numbers[currentIndex];
            currentIndex = prevIndex[currentIndex];
        }

        return result;
    }
}