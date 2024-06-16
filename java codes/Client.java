import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception
    {
    Socket s = new Socket("localhost",8090);
    InputStream is = s.getInputStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    String st = br.readLine();
    System.out.println(st);
    br.close();
    s.close();

    }
}
