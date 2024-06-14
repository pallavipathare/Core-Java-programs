import java.net.InetAddress;
import java.net.UnknownHostException;

public class networking {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.seed.com");
        System.out.println(address);
        InetAddress IP[] = InetAddress.getAllByName("www.google.com");
        for(int i = 0; i < IP.length; i++){
            System.out.println(IP[i]);
        }
    }
}
