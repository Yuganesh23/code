package BasicRecursion;

public class ReverseString {

	public static void main(String[] args) {

		String s="Hello World";
		String reverse="";
		
		//for(int i=s.length()-1;i>=0;i--) {
		for(int i =0;i<s.length();i++) {

			reverse=s.charAt(i)+reverse;
		}
		System.out.println(reverse);
	}

}
//Output:dlroW olleH