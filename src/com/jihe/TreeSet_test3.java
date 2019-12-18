package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{
	public int compare(Object o1,Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int temp=s1.length()-s2.length();
		return temp;
	}
}
public class TreeSet_test3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new MyComparator());
		ts.add("Jack");
		ts.add("Rose");
		ts.add("Tom");
		ts.add("Jerry");
		System.out.println(ts);
		//Lambda表达式
		TreeSet<String> ts1=new TreeSet<String>((o1,o2)->{
			String s1=(String)o1;
			String s2=(String)o2;
			return s1.length()-s2.length();
		});
		ts1.add("Jack");
		ts1.add("Rose");
		ts1.add("Tom");
		ts1.add("Jerry");
		System.out.println(ts1);
	}

}
