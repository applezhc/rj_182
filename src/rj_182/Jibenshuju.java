package rj_182;  //package:包
/*
紫色的代码是关键字
褐色的代码是参数或者局部变量
蓝色的代码是成员变量,他的变量比局部变量高,地位同成员方法一样
黑色的代码是标识符:包名(com、rj182)、类名(zhengxingshuju、String、System)
                                    方法名(main、println)
*/
public class Jibenshuju {  //class:类   public:修饰符，表示公有的

	public static void main(String[] args) { 
		//static修饰符,表示静态的   void:空的,表明该方法没有返回值
		byte b=1;
		short s=1;
		int i=1;
		long l=1;
		
		float f=1.0f;  //1.0是双精度浮点数长度是64位，而float是32位
					  //1.0f是单精度浮点数长度是32位
		double d=1.0;
		
		char c='a';
		char ci=97;
		char cc=97;
		System.out.println(c);
		System.out.println(ci);
		System.out.println((int)cc);
		
		boolean flag1=true;
		boolean flag2=false;
		
		System.out.println("zhengxingshuju.main(字节型整数数据的长度)"+Byte.SIZE);
		System.out.println("zhengxingshuju.main(短整型整数数据的长度)"+Short.SIZE);
		System.out.println("zhengxingshuju.main(整型整数数据的长度)"+Integer.SIZE);
		System.out.println("zhengxingshuju.main(长整型整数数据的长度)"+Long.SIZE);
		
		System.out.println("单精度浮点数据的长度"+Float.SIZE);
		System.out.println("双精度浮点数据的长度"+Double.SIZE);
		
		System.out.println("zhengxingshuju.main(字节型整数数据的范围)"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("zhengxingshuju.main(短整型整数数据的范围)"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("zhengxingshuju.main(整型整数数据的范围)"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("zhengxingshuju.main(长整型整数数据的范围)"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		
		System.out.println("单精度浮点数据的范围"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度浮点数据的范围"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		
		System.out.println("字符型数据的长度"+Character.SIZE);
		System.out.println("字符型数据的范围"+(short)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		
		System.out.println("布尔型数据的范围"+Boolean.TRUE+"	至"+Boolean.FALSE);
	}

}
