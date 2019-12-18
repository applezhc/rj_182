package com.Thread;

public class Thread_test8 {

	public static void main(String[] args) {
		//使用lambda表示式
		Thread t1=new Thread(()->{
			for (int i = 0; i < 11; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输入i:"+i);
				
			}
		},"优先级较低的线程");
		Thread t2=new Thread(()->{
			for (int i = 0; i < 11; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输入j:"+i);
			}
		},"优先级较高的线程");
		//使用匿名内部类
		Thread t3=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 11; i++) {
				System.out.println(Thread.currentThread().getName()+"正在输入k:"+i);
			}
		}
	},"优先级普通的线程");
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
	}
}
