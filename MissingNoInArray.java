package BasicRecursion;

import java.util.ArrayList;
import java.util.List;

public class MissingNoInArray {
	
	public static List<Integer>miss2(int[]arr,int n){
		boolean[]present =new boolean[n+1];// Create a boolean array of size n+1If n = 5, the array present will have 6 elements: present[0], present[1], present[2], present[3], present[4], and present[5]. Index 0 will be ignored, and indices 1 to 5 will be used to track the presence of numbers 1 to 5 in the input array.
		
		// Mark the numbers that are present in the array
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=n) {
				present[arr[i]]=true;
			}
		}
		 // Collect the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }
		return missingNumbers;
	}

	public static void main(String[] args) {

		int [] arr1= {1,2,4,5,6,7};
		int missing1=miss1(arr1);
		System.out.println("Missing 1 value : "+ missing1);
		
		
		int [] arr2= {1,2,4,5,7};
		int n =7;// The range is from 1 to 7
		List<Integer> missing2 = miss2(arr2,n);
		System.out.println("Missing more than 1 number : "+missing2);	
 }
	
	public static int miss1(int []n) {
		
		int sumOfArray=0;
		int length = n.length+1;
     int expectedsum=length*(length+1)/2;	
		for(int i=0;i<n.length;i++) {
			sumOfArray+=n[i];
		}
		
		int result = expectedsum-sumOfArray;
		return result;
	}
}

//OUTPUT
/*Missing 1 value : 3
Missing more than 1 number : [3, 6]*/



/*
 * Suppose the input array is {1, 2, 5} and n = 5:

At the start, the present array will be initialized as:
[false, false, false, false, false, false] (for indices 0 to 5).

First Iteration (i = 0):

The value of arr[0] is 1.
Since 1 <= 5, we mark present[1] = true.
The present array becomes:
[false, true, false, false, false, false].
Second Iteration (i = 1):

The value of arr[1] is 2.
Since 2 <= 5, we mark present[2] = true.
The present array becomes:
[false, true, true, false, false, false].
Third Iteration (i = 2):

The value of arr[2] is 5.
Since 5 <= 5, we mark present[5] = true.
The present array becomes:
[false, true, true, false, false, true].
Final State:
After the loop completes, the present array looks like this:
[false, true, true, false, false, true].

present[1] = true, which means 1 is present.
present[2] = true, which means 2 is present.
present[3] = false, which means 3 is missing.
present[4] = false, which means 4 is missing.
present[5] = true, which means 5 is present.
 */
