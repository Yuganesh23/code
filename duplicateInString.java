package tasks;

import java.util.HashMap;
import java.util.Map;

public class duplicateInString {
	
	
	public static String duplicate (String [] s ) {
		
		Map < Character ,Integer>countmap=new HashMap<>();
		StringBuilder  duplicate =new StringBuilder();
		
		StringBuilder  st =new StringBuilder();

		for (String str :s) {
			st.append(str);
		}
			
	for(char c :st.toString().toCharArray()) {
		if (c !='1' && c!=' ') {
			countmap.put(c,countmap.getOrDefault(c,0)+1);
		}
	}
		for(Map.Entry<Character, Integer> entry:countmap.entrySet()) {
		
			if(entry.getValue()>1) {
				duplicate.append(entry.getKey()).append('-').append(entry.getValue());
			}

		}
		
		return duplicate.toString();
	}

	public static void main(String[] args) {

		String []  s= {"java is a good  11"};
		System.out.println(duplicate(s));
		
	}

}
