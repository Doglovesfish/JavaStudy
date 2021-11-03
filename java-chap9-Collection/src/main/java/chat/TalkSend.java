package chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class TalkSend implements Runnable {
    DatagramSocket socket = null;
    BufferedReader reader = null;
    private int toPort;
    private String TOIP;
    private int fromPort;

    public TalkSend(int fromPort, String TOIP, int toPort) {
        this.toPort = toPort;
        this.TOIP = TOIP;
        this.fromPort = fromPort;

        try{
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public TalkSend(){

    }

    @Override
    public void run(){

        //准备数据

        while(true) {
            try{
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(this.TOIP, this.toPort));

                socket.send(packet);
                if("bye".equals(data))
                    break;

            }catch (Exception e){
                e.printStackTrace();
            }
        }
        socket.close();
    }

}
