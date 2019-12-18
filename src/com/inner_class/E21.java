package com.inner_class;

//函数式接口注解,表明注解下面的接口有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Duck implements Animal{

	@Override
	public void shout() {
		System.out.println("嘎嘎嘎..");
		
	}
	
}
public class E21 {

	public static void main(String[] args) {
		//第一种方式:用具体 Duck类的对象调用shout方法
		Duck duck=new Duck();
		duck.shout();
		//第二种方式:用匿名内部类调用shout方法
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("喵喵~");
				
			}
		});
		//第三种方式:用lambda表达式调用
		animalShout(()->System.out.println("小赞~"));
		showSum(28,60,(x,y)->(x+y));

	}

	private static void showSum(int i, int j, Calculate c) {
		System.out.println(i+"+"+j+"的和是:"+c.sum(i,j));
		
	}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

}
