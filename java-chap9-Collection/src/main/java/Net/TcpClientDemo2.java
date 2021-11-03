package Net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo2 {
    public static void main(String[] args) throws Exception{
        //1

        String filePath = "C:\\Users\\I525920\\OneDrive - SAP SE\\java-study\\JavaBasicTest\\java-chap9-Collection\\src\\main\\java\\Net\\input.txt";
        final int port = 9000;
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), port);
        //
        OutputStream os = socket.getOutputStream();

        FileInputStream fis =  new FileInputStream(new File(filePath));
        //
        byte[] buffer = new byte[1024];
        int len = 0;
        while((len = fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //通知服务器我已经结束了
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer2 = new byte[2014];
        int len2 = 0;
        while ((len = inputStream.read(buffer2)) !=-1){
            baos.write(buffer2,0,len2);
        }

        System.out.println(baos.toString());

        fis.close();
        os.close();
        socket.close();

    }
}
