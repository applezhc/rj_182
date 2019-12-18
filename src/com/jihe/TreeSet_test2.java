package com.jihe;

import java.util.TreeSet;
class Teacher implements Comparable<Object>{
		String name;
		int age;
		public Teacher(String name,int age){
			this.name=name;
			this.age=age;
	}
		@Override
		public String toString() {
			return name + ":" + age;
		}
		@Override
		public int compareTo(Object obj) {
			Teacher t=(Teacher)obj;
			return this.age-t.age;
		}
		
}

public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher>	ts=new TreeSet<Teacher>();
		ts.add(new Teacher("宝儿子",213));
		ts.add(new Teacher("C字楠",38));
		ts.add(new Teacher("魏大脸",250));
		System.out.println(ts);
	}

}
