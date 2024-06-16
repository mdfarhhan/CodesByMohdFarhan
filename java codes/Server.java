import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(8090);
        Socket s = ss.accept();
        String str ="hello";
        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);
        ps.println(str);


        ps.close();
        os.close();
        s.close();
        ss.close();
    }
}
