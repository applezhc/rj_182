package com.jhart;

public class Course {
	private String course_id;//课程id属性
	private String course_name;//课程名属性
	private String course_book;//参考教材属性
	
	//如果没有任何构造方法,java VM会自动创建一个无参数的构造方法
	//如果创建了带参数的构造方法,java VM不会自动创建一个无参数的构造方法
	//因此在创建类的时候,一定要写一个不带参数的构造方法
	public Course(String course_name, String course_book) {
		super();
		this.course_name = course_name;
		this.course_book = course_book;
	}
	public Course() {}//无参数
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	
}
