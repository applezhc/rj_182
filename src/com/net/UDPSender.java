package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//创建套接字
		DatagramSocket ds=new DatagramSocket(30000);
		//定义要发送的数据
		String str="来自小仙女马丽如的问候";
		//将数据转换为二进制字节数据
		byte[] zjsz=str.getBytes("UTF-8");
		//创建要发送的数据报
		DatagramPacket dp=new DatagramPacket(zjsz, zjsz.length,InetAddress.getByName("10.2.103.31"),8900);
		//发送前给提示
		System.out.println("开始发送信息.....");
		//通过套接字发送数据报
		ds.send(dp);
		//关闭套接字
		ds.close();
	}

}
