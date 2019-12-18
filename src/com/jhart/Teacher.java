package com.jhart;

public class Teacher extends Person{
	private String id;

	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher() {}

}
//类只支持单继承,不允许多重继承,可以多层继承
class A{};
class B extends A{};
class C extends B{};
