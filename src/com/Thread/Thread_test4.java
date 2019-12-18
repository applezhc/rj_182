package com.Thread;
class TicketWindow extends Thread{
	private int tickets=100;
	public void run() {
		while (true) {
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}
		}
	}
	public TicketWindow(String name) {
		super(name);
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindow("窗口1").start();
		new TicketWindow("窗口2").start();
		new TicketWindow("窗口3").start();
		new TicketWindow("窗口4").start();
	}

}
