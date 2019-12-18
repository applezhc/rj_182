package com.yichang;
class BlcException extends Exception{

	public BlcException() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public BlcException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}
	
}
public class E31 {

	public static void main(String[] args) {
		int result;
		try {
			result = devide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获到的信息为:"+e.getMessage());
		}
	}  
	//throw用在方法声明的最后
	//throw用在方法体内部
	private static int devide(int i, int j) throws BlcException{
		if (j==0) {
			throw new BlcException("除数不能为0");
		}
		int result=i/j;
		return result;
	}
}
