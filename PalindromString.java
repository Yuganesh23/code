package BasicRecursion;

public class PalindromString {

	public static void main(String[] args) {

	 	  String s = "madam"; // You can change this to test other strings
          String reverse = "";
          
          // Reverse the string
          for (int i = s.length() - 1; i >= 0; i--) {
              reverse += s.charAt(i);
          }
          
          // Check if the original string is equal to its reverse
          if (s.equals(reverse)) {
              System.out.println(s + " is a palindrome.");
          } else {
              System.out.println(s + " is not a palindrome.");
          }
	}

}
//Output:madam is a palindrome.

