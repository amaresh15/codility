package com.ami.codility;

import java.util.Arrays;

public class CalculateDepth {

	public static void main(String[] args) {
		int[] A = { 0, 1, 3, -2, 0, 4, 0, -3, 0, 3 };
		System.out.println(solution(A));
	}

	public static int solution(int[] sequence) {

		String order = "Accending";
		int start = 0, depth1 = 0, depth2, minDepth;
		boolean startDetected = false;
		for (int i = 0; i < sequence.length - 1; i++) {
			switch (order) {
			case "Accending":
				if (sequence[i] > sequence[i + 1] ) {
					if(!startDetected){
						start = sequence[i];
						startDetected = true;
					}
				} else if(startDetected) {
					depth1 = start - sequence[i];
					start = sequence[i];
					order = "Decesnding";
				}
				break;
			case "Decesnding":
				if (sequence[i] > sequence[i + 1]) {
					depth2 = sequence[i] - start;
					minDepth = Math.min(depth1, depth2);
					return Math.max(minDepth, solution(Arrays.copyOfRange(sequence, i, sequence.length + 1)));
				}

				break;
			}
		}

		return -1;
	}

}
