package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		//赋值符号左边的类或接口可以是右边的类的上一代
		Map<String,String> hmap=new HashMap<String,String>();
		hmap.put("1","熊大");
		hmap.put("2","翠花");
		hmap.put("3","雄二");
		System.out.println(hmap);
		if (hmap.containsKey("1")) {
			System.out.println("这个双列集合包含键1");
			System.out.println("这个双列集合包含键1的值是:"+hmap.get("1"));
		}
		//将双列集合Map变成单列的键对象集合使用KeySet()方法
		//将双列集合Map变成单列的值对象集合使用values()方法
		System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
		System.out.println("这个双列集合中所有键的集合是"+hmap.values());
		//将键为1的值改成吉吉
		hmap.replace("1","吉吉");
		System.out.println(hmap);
		//删除键1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合map变成单列的键对象集合使用KeySet()方法
		Set<Entry<String, String>> jianji=hmap.entrySet();
		Iterator<Entry<String, String>> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		
		System.out.println("用键值对集遍历双列集合的所有值");
		//将双列集合map变成单列的键对象集合使用KeySet()方法
		Set<Map.Entry<String, String>> jianzhiduiji=hmap.entrySet();
		Iterator<Map.Entry<String, String>> diedai2=jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Map.Entry<String,String> jianzhidui=(Entry<String, String>) diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach键值对集遍历双列集合的键和值");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection<String> zhiji=hmap.values();
		zhiji.forEach(value->System.out.println(value));
		
		Map<String,String> hmap1=new LinkedHashMap<String,String>();
		hmap1.put("2","熊大");
		hmap1.put("3","翠花");
		hmap1.put("1","雄二");
		System.out.println(hmap1); 
	}

}
