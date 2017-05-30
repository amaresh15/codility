package com.ami.codility;

public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(10, 11, 1_000_000_000));
	}
	
	private static int solution(int X, int Y, int D) {
		double jump = 0, diff;
		if(X > 0 && Y > X && Y <= 1_000_000_000) {
			diff = Y-X;
			if(D > 0 && D <= 1_000_000_000) {
				jump = diff/D;
				
			}
		}
		return (int)Math.ceil(jump);
	}
}
