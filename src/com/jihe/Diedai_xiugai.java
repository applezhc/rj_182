package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Tom");
		list.add("And");
		list.add("stu3");
		list.add("stu4");
		Iterator<String> diedai=list.iterator();
		while (diedai.hasNext()) {
			Object obj=diedai.next();
			if("stu3".equals(obj)){
				diedai.remove();
			}
			
		}
		System.out.println(list);
	}

}
