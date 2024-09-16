package BasicRecursion;

public class MaxMinArray {

	public static void MaxMin(int []arr) {
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
               min=arr[i];
			}
		}
		System.out.println("MAXIMUM :"+max+" \n"+"MINUMUM :"+min);
	}
	public static void main(String[] args) {

		int []arr= {1,2,3,4,5};
		
		MaxMin(arr);
	}

}
