package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型,里面的类型是集合里元素的类型
				//有两个类,前面一个是集合类,后面尖括号里的是集合里元素类型
				//ArrayList集合
				ArrayList<String> list=new ArrayList<String>();
				list.add("stu1");
				list.add("stu2");
				list.add("stu3");
				list.add("stu4");
				System.out.println("集合的长度是"+list.size());
				System.out.println("集合的第二个元素是"+list.get(1));
				
				//Linkedlist集合
				LinkedList<String> linkedlist=new LinkedList<String>();
				linkedlist.add("stu1");
				linkedlist.add("stu2");
				linkedlist.offer("offer");
				linkedlist.push("push");
				
				//list.add(5);
				System.out.println("链表LinkedList的长度是"+linkedlist.size());
				System.out.println("链表LinkedList的最后一个元素是"+linkedlist.getLast());
				System.out.println("链表LinkedList的第一个元素是"+linkedlist.getFirst());
				System.out.println(linkedlist);
				
				String dygys=linkedlist.peek();
				System.out.println("链表LinkedList的第一个元素是"+dygys);
				
				linkedlist.removeFirst();
				linkedlist.pollLast();
				System.out.println(linkedlist);
				
				
			}

		}
