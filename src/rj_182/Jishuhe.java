package rj_182;

public class Jishuhe {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<100;i+=2) {
			sum=sum+i;
		}
		System.out.println("100以内奇数的和"+sum);
		
		//while循环
	    sum=0;
		int i=2;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("100以内偶数的和"+sum);

	}

}
