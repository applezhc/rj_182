package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("小赞");
		list.add("大如");
		list.add("小如");
		list.add("中如");
		list.add("小红");
		list.add("小新");
		
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("小"));
		System.out.println("集合里所有姓小的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里所有姓小的人:");
		list.stream().filter(k->k.startsWith("小")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二个和第三个姓小的人用,连接");
		System.out.println(list.stream().filter(k->k.startsWith("小")).skip(1).limit(2).collect(Collectors.joining(",")));
	}

}
