package BasicRecursion;

public class PalindromeNumber {

	public static void main(String[] args) {
		   int number = 12321; 
	        int originalNumber = number;
	        int reversedNumber = 0;

	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10; // Get the last digit
	            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
	            number /= 10; // Remove the last digit
	        }

	        // Check if the original number is equal to the reversed number
	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }
	    }
	}
//OUTPUT:12321 is a palindrome.