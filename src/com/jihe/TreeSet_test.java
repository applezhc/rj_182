package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		//如果往TreeSet里插入整数,由于整数所在的Integer类implements Comparable
		//这个接口,所以TreeSet可以对他们进行排序
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(8);
		ts.add(11);
		ts.add(25);
		ts.add(17);
		ts.add(11);
		ts.add(1);
		ts.add(15);
		System.out.println("创建的TreeSet的集合为:"+ts);
		System.out.println("TreeSet集合的首元素为:"+ts.first());
		System.out.println("TreeSet集合的尾部为:"+ts.last());
		System.out.println("TreeSet集合小于或等于9的最小一个元素为:"+ts.floor(9));
		System.out.println("TreeSet集合大于10的最小一个元素为:"+ts.higher(10));
		//删除
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素是:"+first);
		System.out.println("删除第一个元素后TreeSet变为:"+ts);

	}

}
