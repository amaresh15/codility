package com.ami.codility;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] oddArray = {1,3,3,6,7,6,7,1,9};
		
		System.out.println(findOdd1(oddArray));

	}
	
	private static int findOdd(int[] A) {
		int temp = 0;
		boolean paired = false;

		for(int i = 0; i < A.length; i++) {
			if(A[i] != 0) {
				temp = A[i];
				A[i] = 0;
				paired = false;
				for(int j = i + 1; j < A.length; j++) {
					if(A[j] == temp) {
						A[j] = 0;
						paired = true;
						break;
					}
				}
			}
			if(!paired)
				return temp;
			
		}
		
		return temp;
	}
	
	private static int findOdd1(int[] A) {
		
		Arrays.sort(A);
		for (int i = 0; i < A.length; i+=2) {
			
			if(i == A.length - 1 ) {
				return A[i];
			} else if(A[i] != A[i+1])
				return A[i];
		}
		
		return 0;
	}

}
