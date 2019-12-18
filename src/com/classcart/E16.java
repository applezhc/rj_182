package com.classcart;
interface Animal{
	void shout();
}
class Tom implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵...");
		
	}

	public void jerry() {
		System.out.println("汤姆和杰瑞");

	}
	
}	
class Donkey implements Animal{

	@Override
	public void shout() {
		System.out.println("小苹果是一头驴子");
		
	}
	
}
public class E16 {

	public static void main(String[] args) {
		Animal an1=new Donkey();
		if(an1 instanceof Tom) {
			Tom tom=(Tom) an1;
			tom.shout();
			tom.jerry();
		}
		else {
			System.out.println("这个动物不是Tom");
		}
		

	}

}
