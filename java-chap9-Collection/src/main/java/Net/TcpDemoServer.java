package Net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpDemoServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            serverSocket = new ServerSocket(9800);
            while(true){
                //等待连接
                socket = serverSocket.accept();
                //读取消息
                is = socket.getInputStream();

                byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[2014];
                int len;
                while ((len=is.read(buffer)) !=-1){
                    byteArrayOutputStream.write(buffer, 0, len);
                }

                System.out.println(byteArrayOutputStream.toString());
            }

       }

       catch(IOException e){
           e.printStackTrace();
        }
       finally {
           //关闭资源
            if(byteArrayOutputStream != null){
                try{
                    byteArrayOutputStream.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(is != null){
                try{
                    is.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try{
                    socket.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(serverSocket!=null){
                try{
                    serverSocket.close();
                }
                catch(IOException e){
                    e.printStackTrace();;
                }
            }
       }
    }
}
