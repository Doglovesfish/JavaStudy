package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.sql.SQLOutput;

public class UdpReceiver {
    public static void main(String[] args) throws Exception{
        int port = 6666;
        DatagramSocket socket = new DatagramSocket(port);

        while(true) {
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            socket.receive(packet);
            //不停地接收数据
            byte[] data = packet.getData();
            String receiveDatas = new String(data, 0 ,packet.getLength());

            System.out.println(receiveDatas);

            if("bye".equals(receiveDatas))
                break;
        }
        socket.close();
    }

}
