package com.Thread;
class TicketWindow3 implements Runnable{
	private int tickets=10;
	//定义作为同步
	Object lock = new Object();
	public void run() {
		while (true) {
			//同步代码块
			synchronized (lock) {
				if (tickets>0) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}                          
				}
			}
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
			}else {
				break;
			}
		}
	}
}
public class Thread_test11 {

	public static void main(String[] args) {
		TicketWindow3 tw=new TicketWindow3();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
	}
}

