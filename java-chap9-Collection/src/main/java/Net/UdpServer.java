package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        int port = 9090;
        DatagramSocket socket = new DatagramSocket(port);
        byte[] buffer = new byte[1024];
        DatagramPacket packet =  new DatagramPacket(buffer, 0, buffer.length);

        socket.receive(packet);//阻塞接受

        System.out.println(packet.getAddress().getHostAddress());

        System.out.println(new String(packet.getData(),0,packet.getLength()));

        //关闭链接
        socket.close();
    }
}
