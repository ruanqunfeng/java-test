package cn.imoc.java.ruanqunfeng.tcp.demo.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 服务端的线程类
 */
public class ServerThread implements Runnable {
    // 定义当前线程所处理的Socket
    private Socket socket;

    // 定义线程所需要操作的输入流
    BufferedReader reader = null;

    public ServerThread(Socket socket) throws IOException {
        this.socket = socket;

        // 初始化该socket对应的输入流
        this.reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String content = null;
            // 采用循环的方式，从 socket 中读取客户端发送过来的数据
            while ((content = getContentFromClient()) != null) {
                // 使用 for 循环编译所有的数据
                // 所有的数据都放在 Socket 中
                // 当获取到Socket数据（比如是A的），接着就需要把数据发送到服务端
                // 将来服务器会把你的数据发送到其他客户端（比如B）
                for (Socket socket1 : Server.sockets) {
                    PrintStream ps = new PrintStream(socket1.getOutputStream());
                    ps.println(content);

                    //ps.close();
                    //socket1.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 定义一个方法来获取客户端的数据
    private String getContentFromClient() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            // 出现异常，移除socket
            Server.sockets.remove(socket);
        }
        return "";
    }
}
