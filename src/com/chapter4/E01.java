package com.chapter4;
	class Animal{
		//field:成员变量
		String name;
		//method:成员方法
	void shout() {
		System.out.println("动物发出叫声");
	}
}
	class Dog extends Animal{
		//方法的重写
		@Override
		void shout() {
			System.out.println("哞哞哞");
		}
		//继承了Animal的所有成员变量和成员方法
		public void printName() {
			System.out.println("name="+name);
		}
	}
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="柯基";
		dog.printName();
		dog.shout();

	}

}
