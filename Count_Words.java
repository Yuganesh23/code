package com.learning;

public class Count_Words {

	public static void main(String[] args) {

		String w="my name is yuganesh";
	
		String[] words=w.split("\\s+");
		
		int wordCount = words.length;
		
		System.out.println(wordCount);

	}

}
//output:4