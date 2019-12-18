package com.ljhs;
class Person{
	public void finalize() {
		System.out.println("王楠将被作为垃圾回收...");
	}
}
public class E37 {
	private static void ljhs1() {
		Person p1=new Person();
		p1=null;
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中...");
			i++;
		}
	}
	public static void ljhs2() {
		Person p2=new Person();
		p2=null;
		System.gc();
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中...");
			i++;
		}
	}
	public static void main(String[] args) {
		ljhs1();
		System.out.println("================");
		ljhs2();

	}

}
