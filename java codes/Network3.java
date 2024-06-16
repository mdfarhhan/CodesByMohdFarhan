import java.net.InetAddress;

public class Network3 {
    public static void main(String[] args) throws Exception
    {
        InetAddress ia[] = InetAddress.getAllByName("www.google.com");
        for (int i=0;i<ia.length;i++) {
            System.out.println(ia[i]);
        
        }
    }
}
