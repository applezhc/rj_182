package rj_182;

public class Overload {
	//方法重载
	//第一个加法:两个整数相加
	public static int add(int x,int y) {
		return x+y;
	}
	//第二个加法:三个整数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//第三个加法:两个小数相加
	public static double add(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int sum1=add(2,4);
		int sum2=add(2,4,2);
		double sum3=add(2.5,2.3);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);

	}

}
