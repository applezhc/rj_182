package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Test test=new Test();
		ArrayList<Object> arraylist=new ArrayList<Object>();
		long kssj1=System.currentTimeMillis();
		test.listInsert(arraylist);
		long jssj1=System.currentTimeMillis();
		System.out.println("数组列表头部插入15万个元素耗时:"+(jssj1-kssj1)+"毫秒");
		
		
		LinkedList<Object> linkedlist=new LinkedList<>();
		long kssj2=System.currentTimeMillis();
		test.listInsert(linkedlist);
		long jssj2=System.currentTimeMillis();
		System.out.println("链表头部插入15万个元素耗时:"+(jssj2-kssj2)+"毫秒");
		
		long kssj3=System.currentTimeMillis();
		test.listRead(arraylist);
		long jssj3=System.currentTimeMillis();
		System.out.println("数组列表尾部插入15万个元素耗时:"+(jssj3-kssj3)+"毫秒");
		
		long kssj4=System.currentTimeMillis();
		test.listRead(linkedlist);
		long jssj4=System.currentTimeMillis();
		System.out.println("链表尾部插入15万个元素耗时:"+(jssj4-kssj4)+"毫秒");
	}

}
class Test{
	public void listInsert(List<Object> list)
	{
		for (int i = 0; i < 150000; i++)
		{
			list.add(0,i);
		}
	}
	
	public void listRead(List<Object> List)
	{
		for (int i = 150000-1; i >= 0; i--)
		{
			List.get(i);
		}
	}
}
