package com.Thread;
class Mythread1 extends Thread{

	public Mythread1(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
		}
	}
}
public class Thread_test1 {
	public static void main(String[] args) {
		 Mythread1 t1=new Mythread1("线程1");
		 t1.start();
		 new Mythread1("线程2").start();
	}
}
