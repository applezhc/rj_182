package com.api;

public class E53 {

	public static void main(String[] args) {
		String s="ab2c5a0bc9ba6cd3ba1.jpg";
		if(s.startsWith("a")) {
			System.out.println("字符串s以a开头");
		}
		if(s.endsWith("jpg")) {
			System.out.println("字符串s以jpg结尾");
		}
		if(s.contains("cba")) {
			System.out.println("字符串s包含cba这个字串");
		}
		if(!s.isEmpty()) {
			System.out.println("字符串s不是空的");
		}
		System.out.println("字符串s的每个字符是:");
		//将字符串打碎成字符数组
		char[] zfsz=s.toCharArray();
		for(int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if(i==zfsz.length-1) {
				System.out.print(c);
			}else
				System.out.print(c+",");
		}
	}

}
