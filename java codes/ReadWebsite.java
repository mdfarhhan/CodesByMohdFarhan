import java.net.URL;
import java.io.*;

public class ReadWebsite {
    public static void main(String[] args) throws Exception
    {
        String val;
 
        // Constructing the URL connection
        // by defining the URL constructors
        URL URL = new URL("http://csjmu.ac.in/");

        // Reading the HTML content from the .HTML File
        BufferedReader br = new BufferedReader(
            new InputStreamReader(URL.openStream()));

        /* Catching the string and  if found any null
         character break the String */
         String str = null;
        while ((val = br.readLine()) != null) {
            str = val + str;

        }
        br.close(); 
        FileWriter fw = new FileWriter("csjmu.html");
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();   
    
    }
}
