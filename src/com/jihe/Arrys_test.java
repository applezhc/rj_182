package com.jihe;

import java.util.Arrays;

public class Arrys_test {

	public static void main(String[] args) {
		int[] arr= {9,8,3,5,2};
		System.out.println("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 5);
		System.out.println("元素5在排序后的数组中的索引是:"+index);
		//拷贝数组元素
		int[] copiedArr=Arrays.copyOfRange(arr, 3, 8);
		System.out.println("被拷贝的数组元素是:");
		printArray(copiedArr);
		//替换数组元素
		Arrays.fill(copiedArr, 8);
		System.out.println("被拷贝的数组元素替换成8以后是");
		printArray(copiedArr); 
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if(x!=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
			
		}
		
	}

}
