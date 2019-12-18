package com.abstract_;
abstract class Animal {
	abstract void shout();
}
class Dog extends Animal{
	@Override
	public void shout() {
		System.out.println("恶龙咆哮..啊呜");		
	}	
}
public class E12 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
	}
}
