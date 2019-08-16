package cn.imoc.java.ruanqunfeng.tcp.demo.chatRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket socket;

    // socket对应的输入流
    BufferedReader reader = null;

    public ClientThread(Socket socket) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String content = null;

            while ((content = reader.readLine()) != null) {
                System.out.println(content);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
