package com.group.healthycustom.client.server;

import com.group.healthycustom.client.utils.CloseUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        outLisenter(socket);

        InputStream is = socket.getInputStream();

        byte[] b = new byte[1024];
        int len;
        try {
            while (true) {
                len = is.read(b);
                String serverMsg = new String(b, 0, len);
                System.out.println(serverMsg);
                //处理服务器消息
                handlerServerMsg(serverMsg);
                //接收客户端消息并且发送
            }
        } finally {
            CloseUtils.closeAll(null, is, socket);
        }
    }

    private static void outLisenter(Socket socket) throws IOException {
        new Thread() {
            @Override
            public void run() {
                Scanner sc = new Scanner(System.in);
                OutputStream os = null;
                try {
                    os = socket.getOutputStream();
                    while (true){
                        os.write(("客户端:" + sc.nextLine()).getBytes());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private static void handlerServerMsg(String serverMsg) {
        //把消息转换为消息对象
        //进行业务逻辑处理
    }

    public void sendMsg(String msg) {

    }


}
