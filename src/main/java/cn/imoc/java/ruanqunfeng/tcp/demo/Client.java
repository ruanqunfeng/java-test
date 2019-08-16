package cn.imoc.java.ruanqunfeng.tcp.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.先链接服务器，使用ip地址+端口
        Socket s = new Socket("127.0.0.1",28888);
        // 2.读数据，将输入流的数据包装成一个BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 3.使用BufferedReader调用readLine()，可获取出来
        String ss = reader.readLine();
        System.out.println("ss = " + ss);
        // 4.关闭连接
        reader.close();
        s.close();
    }
}
