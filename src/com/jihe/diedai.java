package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class diedai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度是"+list.size());
		System.out.println("集合的第二个元素是"+list.get(1));
		
		System.out.println("使用迭代输出每个元素:");
		//使用迭代读取集合中的每个元素
		Iterator<String> diedai=list.iterator();
		//hasNext判断是否有下一个元素
		while(diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
		}
		System.out.println("使用foreach输出每个元素:");
		for(Object mgys:list) {
			System.out.println(mgys);
		}
		System.out.println("使用列表集合对象使用JDK8的foreach输出每个元素:");
		list.forEach(obj->System.out.println(obj));
		System.out.println("使用迭代集合对象使用JDK8的foreach输出每个元素:");
		Iterator<String> diedai2=list.iterator();
		diedai2.forEachRemaining(obj->System.out.println(obj));
	}

}

