package BasicRecursion;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {

	   String s = "Hello, World! Welcome to 2024.";
	   
	   // Remove all special characters except alphabets and numbers
	      String cleanedString = s.replaceAll("[^a-zA-Z0-9 ]", "");
       System.out.println(cleanedString);
       
       // Output: Hello World Welcome to 2024
	}

}
