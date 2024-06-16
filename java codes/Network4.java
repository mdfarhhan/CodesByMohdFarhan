import java.net.InetAddress;
import java.net.URL;

public class Network4 {
    public static void main(String[] args) throws Exception 
    {
    InetAddress ip = InetAddress.getByName(new URL("https://www.youtube.com").getHost());
    System.out.println("Public IP Address of: " + ip);
    }
}
