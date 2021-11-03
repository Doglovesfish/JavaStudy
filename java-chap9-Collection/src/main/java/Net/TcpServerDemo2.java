package Net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) throws Exception{
        final int port = 9000;
        String filePath = "C:\\Users\\I525920\\OneDrive - SAP SE\\java-study\\JavaBasicTest\\java-chap9-Collection\\src\\main\\java\\Net\\receive.txt";
        //创建服务
        ServerSocket serverSocket = new ServerSocket(port);
        //监听客户端连接
        Socket socket = serverSocket.accept();//阻塞式监听，一直在等待
        //获取输入流
        InputStream is = socket.getInputStream();

        //文件输出
        FileOutputStream fos =  new FileOutputStream(new File(filePath));
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1) {
            fos.write(buffer, 0 ,len);
        }

        OutputStream os = socket.getOutputStream();
        os.write("我接受完毕了， 你可以断开了".getBytes());

        //关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
