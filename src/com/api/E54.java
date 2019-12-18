package com.api;

public class E54 {

	public static void main(String[] args) {
		String s="ab我2c爱5a0b肖c9b战a6cd3ba1.jpg";
		char[] zfsz=s.toCharArray();
		System.out.println("这个字符串的数组是: ");
		//foreach循环:对于字符数组的每个字符
		//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者单个数组
		for(char zf:zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf);
			}
		}
		System.out.println("\n这个字符串的汉字是: ");
		for(char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
