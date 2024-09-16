package BasicRecursion;

public class armstrong {
	    public static void main(String[] args) {
	        int number = 153; 
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrong(int num) {
	        int originalNumber = num;
	        int sum = 0;
	        
	        int numberOfDigits = String.valueOf(num).length();

	        while (num != 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        return sum == originalNumber;
	    }
	}
//OUTPUT:153 is an Armstrong number.