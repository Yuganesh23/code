package BasicRecursion;

public class EvenOddInArray {

	public static void oe(int []n) {
		
		
		System.out.println("EVEN NUMBERS: ");
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				System.out.print(n[i]+" ");
			}
			
		}
		
		System.out.println("\nODD NUMBERS");
		for(int i=0;i<n.length;i++) {
			if (n[i]%2!=0){
				System.out.print(n[i]+" ");
			}
		}
	}
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		
		oe(arr);
	
	}

}
/*
 EVEN NUMBERS: 
2 4 
ODD NUMBERS
1 3 5 
 */
