package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TalkRecive implements Runnable{
    DatagramSocket socket = null;
    private String msgFrom;
    private int port;

    public TalkRecive(int port, String msgFrom) {
        this.port = port;
        this.msgFrom = msgFrom;
        try{
            socket = new DatagramSocket(this.port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {


        while(true) {
            try{
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                socket.receive(packet);
                //不停地接收数据
                byte[] data = packet.getData();
                String receiveDatas = new String(data, 0 ,packet.getLength());

                System.out.println(msgFrom+":"+receiveDatas);

                if("bye".equals(receiveDatas))
                    break;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
