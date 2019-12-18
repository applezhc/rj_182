package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}
	@Override
	public String toString() {
		return name + ":"+age;
	}
	
}
public class P_1 {
	
	public static void main(String[] args) {
		Person p1=new Person("图图",23);
		Person p2=new Person("小新",12);
		Person p3=new Person("开心超人",5);
		Person p4=new Person("嘟嘟",2);
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(p4);
		System.out.println(h1);

	}

}
