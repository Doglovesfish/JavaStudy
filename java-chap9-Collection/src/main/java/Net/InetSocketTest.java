package Net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class InetSocketTest {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8080);
        System.out.println(inetSocketAddress);
    }
}
