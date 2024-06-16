import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver{
    public static void main(String[] args) throws Exception
    {
     ServerSocket ss = new ServerSocket(7060);
     Socket s = ss.accept();
     InputStream is = s.getInputStream();
     BufferedReader br = new BufferedReader(new InputStreamReader(is));
     String str = br.readLine();
     System.out.println(str);
     ss.close();


    }
}
