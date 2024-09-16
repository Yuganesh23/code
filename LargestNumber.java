package BasicRecursion;

public class LargestNumber {

	public static void main(String[] args) {

		int n =12345;
		int largest =0;
		while(n>0) {
			
			int rem = n%10;
			
			if (rem>largest){
				
				largest=rem;
			}
			n/=10;
		}
		System.out.println(largest);//OUTPUT:5
	}
	
}


//return String.valueOf(Math.abs(number)).length();