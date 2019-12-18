package com.chapter4;
class Ani{
public Ani(String name) {
	System.out.println("我是一只"+name);
}
}
class Pig extends Ani{
	public Pig() {
		super("小香猪");
	}
}
	//继承了Animal的所有成员变量和成员方法
public class E02 {
	public static void main(String[] args) {
		Pig pig=new Pig();

	}
}
