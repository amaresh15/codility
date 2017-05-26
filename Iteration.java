package com.ami.codility;

public class Iteration {
	
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(countZero(n));
	}
	
	private static int countZero(int num) {
		int max = 0, counter= 0;
		String binaryString = Integer.toBinaryString(num);
		System.out.println(binaryString);
		return countMaxSequence(max, counter, binaryString.substring(0, binaryString.lastIndexOf('1')));
	}
	
	
	private static int countMaxSequence(int max, int counter, String binary) {
		
		if(binary.length() > 0) {
			if('0' == binary.charAt(0)) {
				counter++;
			} else {
				max = max > counter ? max : counter;
				counter = 0;
			}
			return countMaxSequence(max, counter, binary.substring(1));
		} else {
			return max > counter ? max : counter;
		}
		
	}

}
