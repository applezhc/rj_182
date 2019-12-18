package com.api;

public class E52 {

	public static void main(String[] args) {
		String s1="abcabcbacdba";
		//字符串可以看成是多个字符组成的字符组
		System.out.println("字符串的长度为:"+s1.length());
		System.out.println("字符串s1的第一个字符为:"+s1.charAt(0));
		System.out.println("字符串s1的第二个字符为:"+s1.charAt(1));
		System.out.println("字符串s1中字符c第一次出现的值为:"+s1.indexOf('c'));
		//java方法命名一般采用驼峰式原则,第一个英语单词首字母小写
		//后面每个英语单词首字母都是大写
		System.out.println("字符串s1中字符c最后一次出现的值为:"+s1.lastIndexOf('c'));
	}

}
