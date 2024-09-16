package com.learning;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {

	//	int n= 2;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter The Number To Find Even Or Odd:");
		int n = s.nextInt();		
		if(n%2==0) {
			System.out.println("EVEN NUMBER");
		}
		else {
			System.out.println("ODD NUMBER");
		}
	}

}
