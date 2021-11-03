package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDesign {
    public static void main(String[] args) {
        try{
            InetAddress inetAddress  = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);
//            inetAddress = InetAddress.getLocalHost();
//            System.out.println(inetAddress);

            System.out.println(inetAddress.getCanonicalHostName());
            System.out.println(inetAddress.getAddress());
            System.out.println(inetAddress.getHostAddress());

        }catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}
