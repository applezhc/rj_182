package rj_182;

public class Recursesive {
	public static int getSum(int n) {
		if(n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;		
	}
	//getSum(4)=10 temp=getSum(3)  temp+4
	//getSum(3)=6 temp=getSum(2)  temp+3
	//getSum(2)=3 temp=getSum(1)  temp+2
	//getSum(1)=1
	public static void main(String[] args) {
		System.out.println("1到4的和是:"+getSum(4));
	}

}
