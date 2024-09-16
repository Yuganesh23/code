package tasks;
import java.util.Arrays;
import java.util.Scanner;
public class FindKthMinMax {
	// Method to find the Kth minimum element
	
    public static int findKthMin(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];  // Kth min element is at index k-1
    }

    // Method to find the Kth maximum element
    public static int findKthMax(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k]; // Kth max element is at index length-k
    }


	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of elements in the array:");
	        int n = scanner.nextInt();
	        
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Enter the value of K:");
	        int k = scanner.nextInt();
	        
	        if (k > 0 && k <= n) {
	            int kthMin = findKthMin(arr, k);
	            int kthMax = findKthMax(arr, k);

	            System.out.println("The " + k + "th minimum element is: " + kthMin);
	            System.out.println("The " + k + "th maximum element is: " + kthMax);
	        } else {
	            System.out.println("K is out of the valid range (1 to " + n + ").");
	        }

	        scanner.close();
	}

}



    
  
