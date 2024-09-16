package BasicRecursion;
import java.security.SecureRandom;
import java.util.UUID;
public class RandomString {
		
	
		 private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	   private static SecureRandom random = new SecureRandom();

		    public static void main(String[] args) {
		        int length = 7; // Length of the random string
		        String randomString = generateRandomString(length);

		        System.out.println("Random string of length " + length + ": " + randomString);
		    }

		    // Method to generate a random string of a specified length
		    public static String generateRandomString(int length) {
		        StringBuilder sb = new StringBuilder(length);
		        
		        for (int i = 0; i < length; i++) {
		            int index = random.nextInt(ALPHANUMERIC.length());
		            sb.append(ALPHANUMERIC.charAt(index));
		        }
		        return sb.toString();
		
	}

}
//OUTPUT:Random string of length 7: O5hzFMF