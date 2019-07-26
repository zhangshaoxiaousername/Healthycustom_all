package com.group.healthycustom.client.server;

import com.group.healthycustom.client.utils.CloseUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {

    static List<OutputStream> outputStreamList;

    public static void main(String[] args) throws IOException {
        //创建服务端，设置端口号
        ServerSocket server = new ServerSocket(8888);
        Scanner sc = new Scanner(System.in);
        Socket socket;
        int i = 0;
        while (true) {
            socket = server.accept();
            createConnect(socket, i);
            outLisenter(socket, sc);
            System.out.println(String.format("连接到客户端ID：%d", i));
            i++;
        }
    }

    private static void outLisenter(Socket socket, Scanner sc) {
        try {
            if (null == outputStreamList) {
                outputStreamList = new ArrayList<>();
            }
            OutputStream os = socket.getOutputStream();
            outputStreamList.add(os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread() {
            @Override
            public void run() {
                try {
                    String msg;
                    while (true) {
                        Thread.sleep(5000);

                        msg = "雷猴啊";
                        for (OutputStream os : outputStreamList) {
                            os.write(("服务端:" + sc.next()).getBytes());
                        }
                    }
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private static void createConnect(Socket socket, int clientId) {
        new ConnectThread(socket, clientId).start();
    }

    private static class ConnectThread extends Thread {
        Socket socket;
        int clientId;

        public ConnectThread(Socket socket, int clientId) {
            this.socket = socket;
            this.clientId = clientId;
        }

        @Override
        public void run() {
            InputStream is = null;
            try {
                //创建扫描器
                Scanner sc = new Scanner(System.in);
                //创建输入流
                is = socket.getInputStream();
                //创建缓冲集合
                byte[] b = new byte[1024];
                //扫描长度
                int len;
                //通信一直开启
                while (true) {
                    //扫描发送过来的信息
                    len = is.read(b);
                    String clientMsg = new String(b, 0, len);
                    String printMsg = String.format("接收到客户端【%d】消息:%s", clientId, clientMsg);
                    //在控制台输出发送过来的信息
                    System.out.println(printMsg);
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                CloseUtils.closeAll(is, null, socket);
            }
        }
    }
}
