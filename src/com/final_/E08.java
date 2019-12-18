package com.final_;
class Animal{
	//如果一个成员变量被final修饰，那么该变量在本类中不能再次被赋值
	final String name="名字";
	public void shout() {}
	//重写Object类的toString()方法
	@Override
	public String toString() {
		return "这可能是一个人";
	}
}
class pig extends Animal{
	final String name="名字";
	@Override
	public void shout() {}
	//重写Animal类的toString()方法
		@Override
		public String toString() {
			return "这是一个小乳猪";
		}
}
public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		System.out.println(dw);
		pig xz=new pig();
		System.out.println(xz);

	}

}
