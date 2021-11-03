package Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpDemoClient {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress serverIP = InetAddress.getByName("127.10.0.1");
            int port = 9800;
            //创建连接
            socket = new Socket(serverIP, port);
            //发送消息 IO流
            os = socket.getOutputStream();
            os.write("hello , I am yide".getBytes());


        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(os != null){
                try{
                    os.close();
                }
                catch (IOException e){
                    e.printStackTrace();;
                }
            }
            if(socket!=null){
                try{
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
