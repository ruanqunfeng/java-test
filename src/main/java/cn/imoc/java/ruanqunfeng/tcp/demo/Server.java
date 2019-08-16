package cn.imoc.java.ruanqunfeng.tcp.demo;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        // 1.使用ServerSocket来创建一个服务器
        ServerSocket ss = new ServerSocket(28888);

        // 2.监听客户端的连接请求
        while (true) {
            Socket socket = ss.accept();

            // 3. 客户端连接成功就给个回应
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("这是服务器");

            ps.close();
            socket.close();

        }
    }
}
