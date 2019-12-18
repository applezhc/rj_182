package com.inner_class;
class Outer{
	static int m=0;
	static void test1() {
		System.out.println("外部类成员方法");
	}
	//静态成员内部类
	static class Inner{
		int n=1;
		void show1() {
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2() {
			System.out.println("内部类成员方法");
		}
		
	}
	void test2() {
		//局部内部类
		class Inner{
			int n=1;
			void show1() {
				System.out.println("外部类成员变量m="+m);
				test1();
			}
		void show2() {
			System.out.println("内部类成员方法");
		}
	}
		Inner inner=new Inner();
		System.out.println("内部类成员变量n="+inner.n);
		inner.show2();
}
}
public class E18 {

	public static void main(String[] args) {
		Outer outer=new Outer();
		Outer.Inner inner=new Outer.Inner();
		outer.test2();
		inner.show2();

	}

}
