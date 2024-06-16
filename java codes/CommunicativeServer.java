import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CommunicativeServer{
    public static void main(String[] args) throws Exception
    {
     ServerSocket ss = new ServerSocket(7060);
     Socket s = ss.accept();
     InputStream is = s.getInputStream();
     BufferedReader br = new BufferedReader(new InputStreamReader(is));
    
     String str = br.readLine();
     String Rpath = str.split(" ")[1];
     String root = "C:/Users/mohd farhan/Desktop";
     BufferedReader fr = new BufferedReader(new FileReader(root+Rpath));
     String x = fr.readLine();
     String t = "";
     while (x!=null) {
         t = t+x;
         x = fr.readLine();
     }
     OutputStream os = s.getOutputStream();
     os.write(("HTTP/1.1 200 ok \r\n").getBytes());
     os.write(("Content-type:Plain/text \r\n").getBytes());
     os.write(("Content-length:"+t.length()+"\r\n").getBytes());
     os.write(("\r\n").getBytes());
     os.write(t.getBytes());
     os.flush();
     fr.close();
     ss.close();


    }
}
