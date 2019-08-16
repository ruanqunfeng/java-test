package cn.imoc.java.ruanqunfeng.tcp.demo.chatRoom;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {
    //
    public static List<Socket> sockets = Collections.synchronizedList(new ArrayList<>());


    public static void main(String[] args) throws Exception {
        // 1.使用ServerSocket来创建一个服务器
        ServerSocket ss = new ServerSocket(28888);

        // 2.监听客户端的连接请求
        while (true) {
            Socket socket = ss.accept();
            // 将客户端连接产生的多个Socket放到sockets中，集合进行管理
            sockets.add(socket);
            /*
            // 3. 客户端连接成功就给个回应
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println("这是服务器");

            ps.close();
            socket.close();
            */

            // 打开线程
            // 每当客户端连接成功之后，启动一个线程为当前的客户端提供对应的服务
            new Thread(new ServerThread(socket)).start();
        }
    }
}
