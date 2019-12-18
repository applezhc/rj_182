package com.duotai;
interface Animal{
	void shout();
}
class Cow implements Animal{

	@Override
	public void shout() {
		System.out.println("宝强在哞哞哞叫...");
		
	}
	
}
public class E15 {

	public static void main(String[] args) {
		Animal cow=new Cow();
		cow.shout();

	}

}
