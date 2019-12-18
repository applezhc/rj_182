package rj_182;

public class T6 {

	public static void main (String[] args) {
		//在静态方法里，只能调用本类的静态方法，不能调用本类的非静态方法
		Overload o1=new Overload();
		int sum1=o1.add(2,4);
		//类名.方法名
		int sum2=o1.add(2,4,2);
		double sum3=o1.add(2.5,2.3);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);

	}

}


