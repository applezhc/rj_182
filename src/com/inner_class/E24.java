package com.inner_class;

@FunctionalInterface
interface Calcable{
	int clac(int num);
}
class Math{
	public static int abs(int num) {
		if (num>=0) {
			return num;
		}
		else {
			return -num;
		}
	}
}
public class E24 {

	public static void main(String[] args) {
		PrintAbs(-20,n->Math.abs(n));

	}

	private static void PrintAbs(int i, Calcable c) {
		System.out.println(c.clac(i));
		
	}

}
