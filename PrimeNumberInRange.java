package BasicRecursion;

public class PrimeNumberInRange {

	public static void main(String[] args) {

		  int start = 10; // Start of the range
	        int end = 50;   // End of the range

	        System.out.println("Prime numbers between " + start + " and " + end + " are:");
	        
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    // Method to check if a number is prime
	    static boolean isPrime(int number) {
	        if (number <= 1) return false;
	        if (number == 2) return true; // 2 is the only even prime number
	        if (number % 2 == 0) return false; // Other even numbers are not prime

	        for (int i = 3; i * i <= number; i += 2) { // Check odd factors only
	            if (number % i == 0) return false;
	        }

	        return true;
	}

}
//OUTPUT:Prime numbers between 10 and 50 are:
//11 13 17 19 23 29 31 37 41 43 47 
