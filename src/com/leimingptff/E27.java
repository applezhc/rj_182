package com.leimingptff;
@FunctionalInterface
interface Printable{
	void print(StringUtils str,String su);
}
class StringUtils{
	public void printUpper(String str) {
	System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void main(String[] args) {
		printUpper(new StringUtils(),"xiao",(object,t)->object.printUpper(t));
		printUpper(new StringUtils(),"zhan",StringUtils::printUpper);

	}

	private static void printUpper(StringUtils su, String str,Printable pb) {
		pb.print(su,str);
		
	}
}