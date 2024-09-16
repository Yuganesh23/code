package com.learning;

public class Prime_or_not {
	
	static boolean  b(int number) {
		
		if (number<=2){
			return false;
		}
		for (int i=2;i<=Math.sqrt(number);i++) {
			if (number%i==0) {
				return false;
	    	}
		}
		return true;
	}

	public static void main(String[] args) {

		int num= 45;
		
		
		if(b(num)) {
			System.out.println(num+": Prime Number");
		}

		else {
			System.out.println(num+":Not a Prime Number");
		}
		
	}

}
//OUTPUT:45:Not a Prime Number
