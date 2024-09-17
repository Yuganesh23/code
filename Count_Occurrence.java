package com.learning;

public class Count_Occurrence {
	
	static String count(String s) {
		
		StringBuilder result=new StringBuilder();
		
		int[] count = new int[200];
		
		for(char c:s.toCharArray()) {
			count[c]++;
		}
		
		for(char c:s.toCharArray()) {

			if (count[c]!=0) {
				result.append(c).append("-").append(count[c]).append(" ");
				
				count[c]=0;
		}
		
		}
		return result.toString();
		
	}

	public static void main(String[] args) {

		String s = "vishanth";
		
		System.out.println(count(s));
		
	}

}
//OUTPUT:v-1 i-1 s-1 h-2 a-1 n-1 t-1 
