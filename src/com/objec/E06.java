package com.objec;
class Animal extends java.lang.Object{
	void shout() {
		System.out.println("动物叫!");
	}
	@Override
	public String toString() {
		return "这可能不是一只动物";
	}
}
public class E06 {
	public static void main(String[] args) {
		Animal dw=new Animal();
		System.out.println(dw.toString());

	}
}
