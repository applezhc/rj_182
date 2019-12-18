package com.jihe;

import java.util.HashSet;

class Student{
	String id;
	String name;
	public Student(String id,String name) {
		this.id=id;
		this.name=name;
}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other=(Student) obj;
		return this.id.equals(other.id);
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
}
public class Haset_test {

	public static void main(String[] args) {
		Student s1=new Student("1", "Mike");
		Student s2=new Student("1", "Mike");
		Student s3=new Student("3", "Mary");
		HashSet<Student> hset=new HashSet<Student>();
		hset.add(s1);
		hset.add(s2);
		hset.add(s3);
		System.out.println(hset);
		
	}	
}
