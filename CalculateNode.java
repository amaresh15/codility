package com.ami.codility;

public class CalculateNode {

	public static void main(String[] args) {
		IntList a,b,c,d;
		a = new IntList();
		b = new IntList();
		c = new IntList();
		d = new IntList();
		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(solution(a));
	}
	
	public static int solution(IntList node) {
		
		return nodeCount(node, 0);
	}
	
	public static int nodeCount(IntList node, int count) {
		count++;
		if(node.next != null)
			return nodeCount(node.next, count);
		else
			return count;
		
	}
	
}
class IntList {
	public int value;
	public IntList next;
}
