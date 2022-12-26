package com.mytest.tcp;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class TcpServer {

    @Test
    public void tcpTest() throws Exception{
        server();
    }

    @Test
    public void testClient() throws Exception {
        client();
    }

    private static void server() throws IOException {
        System.out.println("TCP服务端启动");

        ServerSocket serverSocket = new ServerSocket(8811);
        while (true) {
            Socket socket = serverSocket.accept();   //等待客户端连接（阻塞）
            InputStream inputstream = socket.getInputStream();   //利用IO流进行传输

            int len;
            byte[] buf = new byte[1024];
            StringBuilder str = new StringBuilder();
            while (true) {
                len = inputstream.read(buf);
                str.append(new String(buf,0 ,len));
                if (len < 1024 ) {
                    break;
                }
            }
            System.out.println("客户端传输内容：" + str);
            socket.getOutputStream().write("hello".getBytes(StandardCharsets.UTF_8));
        }
//        serverSocket.close();   //关闭连接
    }


    private static void client() throws UnknownHostException, IOException {

        System.out.println("TCP客户端启动");

        Socket socket = new Socket("127.0.0.1", 8811);

        OutputStream outputStream = socket.getOutputStream();

        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<2000;i++) {
            stringBuffer.append(i).append(",");
        }
        outputStream.write(stringBuffer.toString().getBytes());

        InputStream in = socket.getInputStream();
        int len;
        byte[] buf = new byte[1024];
        StringBuilder str = new StringBuilder();
        while (true) {
            len = in.read(buf);
            str.append(new String(buf,0 ,len));
            if (len < 1024 ) {
                break;
            }
        }
        System.out.println("客户端传输内容：" + str);
        socket.close();   //关闭连接

    }

}
