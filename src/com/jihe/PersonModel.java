package com.jihe;

public class PersonModel {
	String name;
	int age;
	String sex;
	public PersonModel() {
		super();
	}
	
	public PersonModel(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

}
