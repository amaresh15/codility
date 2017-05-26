package com.ami.codility;

import java.util.Arrays;

public class MultiplicativePairs {

	public static void main(String[] args) {
		int A[] = { 0, 1, 2, 2, 3, 5 };
		int B[] = { 500_000, 500_000, 0, 0, 0, 20_000 };
		System.out.println(solution(A, B));
	}

	public static int solution(int[] A, int[] B) {
		int count = 0, N = A.length;
		int countG2 = 0, combination;
		double C[] = new double[N];
		for (int i = 0; i < N; i++) {
			C[i] = A[i] + new Double(B[i]) / 10_00_000;
		}
		Arrays.sort(C);

		for (int i = 0; i < N; i++) {
			if(C[i] <= 1)
				break;
			if (count >= 1_000_000_000)
				return 1_000_000_000;

			if (C[i] < 2) {
				for (int j = i + 1; j < N; j++) {
					if (C[i] * C[j] >= C[i] + C[j]) {
						count += (N - j);
						break;
					}
				}

			} else {
				countG2 = N - i;
				combination = (countG2 * (countG2 - 1)) / 2;
				count += combination;
				break;
			}
		}
		return (count >= 1_000_000_000 ? 1_000_000_000 : count);
	}

}
