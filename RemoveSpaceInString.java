package BasicRecursion;

public class RemoveSpaceInString {

	public static void main(String[] args) {

		String st1="hello world, with method";
		
		String noSpace=st1.replaceAll("\\s+","");
		System.out.println(noSpace);
		
		
		String st2=" Using ,loop";
		String noSpaceString="";
		
		for(char c:st2.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				noSpaceString+=c;
			}
		}
		System.out.println(noSpaceString);
		
	}

}
