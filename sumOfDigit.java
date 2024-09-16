package BasicRecursion;

public class sumOfDigit {

	static int sum (int n ) {
		
		if (n==0) {
			return 0;
		}
	
		return sum(n/10)+(n%10);   
	}
	
	public static void main(String[] args) {


		int n =555;
		
		int ans =sum(n);
		
	System.out.println(ans);
		
	}

}
//OUTPUT:15	
