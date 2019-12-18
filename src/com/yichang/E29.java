package com.yichang;

public class E29 {

	public static void main(String[] args) {	
		int result=divide(4,0);
		if (result==-1) {
			System.out.println("程序发生异常");
		} else {
			System.out.println(result);
		}
	}

	private static int divide(int i, int j) {
		try {
			int result=i/j;
			return result;
		} catch (Exception e) {
			System.out.println("捕获到的异常信息为:"+e.getMessage());
		}finally {
			System.out.println("执行finally代码块,无论程序是否异常,都会执行");
		}
			return -1;
		
	}

}