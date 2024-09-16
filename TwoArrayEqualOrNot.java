package BasicRecursion;

import java.util.Arrays;

public class TwoArrayEqualOrNot {

	public static boolean equal(int[]a,int[]b) {
		
		return Arrays.equals(a, b);
	}
	public static void main(String[] args) {

		int []a = {1,2,3,4,5};
		int []b = {1,2,3,4};
		System.out.println( equal(a,b)); 
	}

}
 