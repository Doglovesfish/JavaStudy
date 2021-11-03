package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public static void main(String[] args) throws Exception{
        //1 建立socket
        DatagramSocket socket = new DatagramSocket();
        //2 建立 包
        String message = "hello server";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;

        DatagramPacket packet = new DatagramPacket(message.getBytes(),0,message.getBytes().length,localhost, port);
        //3 发送 包
        socket.send(packet);

        //4 关闭流
        socket.close();
    }
}
