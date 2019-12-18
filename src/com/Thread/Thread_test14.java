package com.Thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	private boolean flag;
	
	public DeadLockThread(boolean flag) {
		super();
		this.flag = flag;
	}
	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
					synchronized (knifeAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
					}
				}
			}
		}else {
			while (true) {
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
					synchronized (chopsticks) {
						System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
					}
				}
			}	
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		new Thread(new DeadLockThread(true),"Chinese").start();
		new Thread(new DeadLockThread(false),"American").start();
	}
}
