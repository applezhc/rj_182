package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"马","肖","张","王","魏");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("自然排序后:"+list);
		
		Collections.shuffle(list);
		System.out.println("随机排序后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后:"+list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		Collections.addAll(list1,10,-8,5,2,0);
		System.out.println("集合中的元素:"+list1);
		System.out.println("集合中的最大值元素:"+Collections.max(list1));
		System.out.println("集合中的最小值元素:"+Collections.min(list1));
		Collections.replaceAll(list1, -8, 3);
		System.out.println("替换后集合中的元素:"+list1);
		Collections.sort(list1);
		System.out.println("自然排序后:"+list1);
		
		//先排序,后二分查找
		System.out.println("自然排序后,通过二分查找元素5的下标是:"+Collections.binarySearch(list1, 5));
		
		
	}

}
