package rj_182;

public class Bubble_sort {

	public static void main(String[] args) {
		int [] array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		//foreach循环
		for(int szys:array) {
			System.out.print(szys+" ");
		}
		/*冒泡排序第一趟 2 9853
		 * 冒泡排序第二趟 23 985
		 * 冒泡排序第三趟23 598
		 * 冒泡排序第四趟23 589
		 */
		 //定义外循环，表示趟数
		System.out.println();
		for(int m=1;m<array.length;m++) {
			//定义内循环，比较第m趟要比较的两个数
			for(int n=0;n<array.length-m;n++) {
				if(array[n]>array[n+1]) {
					//进行元素交换
				int temp=array[n];
				    array[n]=array[n+1];
				    array[n+1]=temp;
				}
			}
		}
		//foreach循环
		for(int szys:array) {
			System.out.print(szys+" ");
		}
}	
}