package rj_182;

public class Changliang {

	public static void main(String[] args) {
		//字面上的整型常量
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		//0123456789abcd
		System.out.println("十六进制以0x开头"+0xc6);
		//字面上的浮点数常量
		System.out.println("单精度浮点数常量以f结尾:"+5.022e+6f);
		System.out.println("双精度浮点数常量以d结尾:"+5.022e+6d);
		System.out.println("双精度浮点数常量d可以省略:"+5.022e+6);
		//Java中的字符使用单引号，采用16位unicode编码，采用\\uXXXX来表示
		System.out.println("我的名字是:"+'\u9a6c'+'\u4e3d'+'\u5982'+'\u771f'+'\u597d'+'\u770b');
		//Java中的字符串常量使用双引号括起来
		System.out.println("Hello \nSeptember!");
		//Java中的布尔常量只有两个，真true或者假false
		System.out.println("布尔型常量"+true+"或者"+false);
		//Java中的null常量，只能是引用数据常量
		System.out.println("null的常量只有一个"+null+",表示空对象");
		//int c=null;
		Changliang changliang=null;
		//同变量类似的常量要使用final关键字，常量赋值后不能再次被修改，常量名一般用大写
		final int A=5;//定义一个整型变量a，如果前面加final修饰，他就变成一个常量
		//A=6;
		
	}

}
