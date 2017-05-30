package com.ami.codility;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = new int[100_000];
		for (int i = 0; i < arr.length; i++) {
			if(i < 12344)
				arr[i] = i + 1;
			else
				arr[i] = i + 2;
		}
		
		System.out.println(solution2(arr));
	}
	
	private static int solutuion(int[] A) {
		int min, max, length = A.length;
		long sum, expectedSum;
		if(length > 0 && length < 100_001) {
			min = Arrays.stream(A).min().getAsInt();
			max = Arrays.stream(A).max().getAsInt();
			if(min == 1 && max == length) {
				return max + 1;
			} else if(min != 1 && max == length + 1) {
				return 1;
			} else if(min == 1 && max == length + 1) {
				sum = Arrays.stream(A).sum();
				expectedSum = ((length + 1) * (length + 2))/2;
				
				return (int)(expectedSum - sum);
			}
		}
		
		return 1;
	}
	
	private static int solution1(int[] A) {
		int min = 100_001, max = 0, length = A.length;
		long sum = 0, expectedSum;
		for (int number : A) {
			min = min > number ? number : min;
			max = max < number ? number : max;
			sum += number;
		}
		if(min != 1) {
			return 1;
		}
		if(max != length + 1) {
			return length +1;
		} else {
			expectedSum = ((length + 1) * (length + 2))/2;
		}
		
		return (int)(expectedSum - sum);
		
	}	
	
	private static int solution2(int[] A) {
		int length = A.length;
		if(length == 0 || length > 100_000) {
			return 1;
		}
		long sum = Arrays.stream(A).sum(), expectedSum = ((length + 1) * (length + 2))/2;
		
		return (int)(expectedSum - sum);
	}
}
