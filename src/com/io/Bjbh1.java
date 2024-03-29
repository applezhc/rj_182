package com.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh1 {

	public static void main(String[] args) throws Exception {
		//定义一个目录路径的对象
		Path bjxx=Paths.get("D:\\班级信息.txt");
		Path bjmc=Paths.get("D:\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\班级编号1.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);
		//读取文本中的内容
		List<String> lines=Files.readAllLines(bjxx);
		List<String> names=Files.readAllLines(bjmc);
		Map<String, String> map=new HashMap<>();
		for (String line : lines) {
			String[] zfcsz=line.split("\t");
			map.put(zfcsz[1], zfcsz[0]);
		}
		for (String name : names) {
			neirong.add(map.get(name));
		}
		//把集合里的内容写进文件
		Files.write(bjbh, neirong,StandardOpenOption.APPEND);
	}

}
