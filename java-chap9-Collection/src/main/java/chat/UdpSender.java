package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSender {
    public static void main(String[] args) throws Exception{
        int port = 8888;
        DatagramSocket socket = new DatagramSocket(port);

        //准备数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress("localhost", 6666));

            socket.send(packet);

            if("bye".equals(data))
                break;
        }
        socket.close();
    }
}
