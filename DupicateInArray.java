package BasicRecursion;

public class DupicateInArray {

	public static void duplicate(int[]a) {
        System.out.println("Duplicate elements in the array: ");

		
        // Outer loop iterates over each element
		for(int i=0;i<a.length;i++) {
			
            // Inner loop checks if the element is duplicated
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
					break;// Exit the inner loop once a duplicate is found
				}
			}
		}
	}
	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,5,6,7,2};
		duplicate(arr);
	}

}
//output:Duplicate elements in the array: 
//2 5 
