package com.io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_test {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("c://poem1.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		char[] buff=new char[1024];
		fw.write("轻轻的我走了,\r\n");
		fw.write("正如我轻轻的来了;\r\n");
		fw.write("我轻轻的招手,\r\n");
		fw.write("作别西天的云彩.\r\n");
		int b=fr.read(buff);
		while (b!=-1) {
			fw.write(buff,0,b);
			b=fr.read(buff);
		}
		fr.close();
		fw.close();
	}

}
