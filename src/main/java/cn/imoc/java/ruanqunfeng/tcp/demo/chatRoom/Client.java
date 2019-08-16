package cn.imoc.java.ruanqunfeng.tcp.demo.chatRoom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.先链接服务器，使用ip地址+端口
        Socket s = new Socket("127.0.0.1", 28888);

        // 2.客户端启动ClientThread线程不断去获取服务端的数据
        new Thread(new ClientThread(s)).start();

        // 获取Socket中的输出流
        PrintStream ps = new PrintStream(s.getOutputStream());

        // 3.非常重要的细节：你在客户端如何聊天的？
        // 一定要捕获系统键盘输入的内容

        String content = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while ((content = reader.readLine()) != null) {
            // 将用户输入的内容写入到Socket中对应的输出流
            ps.println(content);
        }

        /*
        // 2.读数据，将输入流的数据包装成一个BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 3.使用BufferedReader调用readLine()，可获取出来
        String ss = reader.readLine();
        System.out.println("ss = " + ss);
        // 4.关闭连接
        reader.close();
        s.close();
        */
    }
}
