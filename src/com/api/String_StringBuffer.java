package com.api;

public class String_StringBuffer {

	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("abc");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
	}

}
//String类是final的,一旦初始化,不能做任何修改
//StringBuffer可以做增删改操作
//StringBuilder类约等于StringBuffer类
//StringBuffer:线程安全,但是速度慢
//StringBuilder:线程不安全,但是速度快
