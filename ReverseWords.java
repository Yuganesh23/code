package BasicRecursion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

	public static void main(String[] args) {

	       String s = "hello world";

	        // Split the string into words
	        String[] words = s.split("\\s+");

//	        // Reverse the order of the words
//	        Collections.reverse(Arrays.asList(words));
//
//	        // Join the words back into a string
//	        String reversedWords = String.join(" ", words); // Output : world hello

	        // Reverse each word and collect them
	        String reversedWords = Arrays.stream(words)
	            .map(word -> new StringBuilder(word).reverse().toString())
	            .collect(Collectors.joining(" ")); // Output: olleh dlrow
	        System.out.println(reversedWords);
	        
	
	}

}
