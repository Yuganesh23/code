package BasicRecursion;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
 
		Random random = new Random();

        int lowerBound = 1; // Lower bound of the range (inclusive)
        int upperBound = 100; // Upper bound of the range (exclusive)

        // Generate a random integer within the specified range
        int randomNumber = random.nextInt(upperBound - lowerBound) + lowerBound;

        System.out.println("Random number between " + lowerBound + " and " + (upperBound - 1) + " is: " + randomNumber);
    
	}

}
//OUTPUT:Random number between 1 and 99 is: 59