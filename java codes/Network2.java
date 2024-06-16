import java.net.InetAddress;

public class Network2 {
    public static void main(String[] args) throws Exception
    {
        InetAddress is = InetAddress.getByName("www.google.com");
        System.out.println(is);
    }
}
