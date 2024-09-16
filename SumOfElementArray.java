package BasicRecursion;

public class SumOfElementArray {

	public static void sum (int [] n ) {
		
		int sum=0;
		
		for(int i=0;i<n.length;i++) {
			sum+=n[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5};
		sum(arr);
	}

}
//OUTPUT:15