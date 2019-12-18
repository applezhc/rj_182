package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("-16的绝对值为:"+Math.abs(-16));
		System.out.println("16的正弦值为:"+Math.sin(16));
		System.out.println("16的平方根值为:"+Math.sqrt(16));
		System.out.println("27的立方根值为:"+Math.cbrt(27));
		System.out.println("乘方的结果为:"+Math.pow(3,8));
		//ceil:天花板  floor:地板
		System.out.println("求大于参数的最小整数:"+Math.ceil(4.6));
		System.out.println("求小于参数的最大整数:"+Math.floor(4.6));
		System.out.println("对小数进行四舍五入的结果为:"+Math.round(-6.4));
		System.out.println("对小数进行四舍五入的结果为:"+Math.round(4.6));
	}

}
