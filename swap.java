package tasks;

public class swap {

	public static void main(String[] args) {

		int a =10;
		int b=20;
		
		swaps(a,b);
			
	}
	static void swaps (int a,int b) {
		
		  // Swap without third variable
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b; // b becomes 10 (30 - 20)
        a = a - b; // a becomes 20 (30 - 10)
        
        // with third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a = " + a + ", b = " + b);	}

}
//Output: a = 20, b = 10