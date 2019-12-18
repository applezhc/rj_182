package com.inner_class;
//声明一个函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpper(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {

	public static void main(String[] args) {
		StringUtils su=new StringUtils();
		printUpper("xiao",t->su.printUpper(t));
		printUpper("zhan",su::printUpper);

	}

	private static void printUpper(String str, Printable pt) {
		pt.print(str);
		
	}

}
