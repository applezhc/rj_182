package com.api;

public class SttingBuffer_test {

	public static void main(String[] args) {
		String s="我爱你肖战";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		//添加
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(3,',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2,4);
		System.out.println(zfchc);
		//修改
		zfchc.replace(2, 4,"GD");
		System.out.println(zfchc);
		//反转
		zfchc.reverse();
		System.out.println(zfchc);

	}

}
