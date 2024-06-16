import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("DSLab.txt");
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        BufferedReader br = new BufferedReader(fr);
        String fst = "";
        try {
            String str = br.readLine();
            while (str!=null) {
                fst = fst + str +"\n";
                str = br.readLine();
            }
            fr.close();
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
        try {
            FileWriter fw = new FileWriter("Ques.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(fst);
            fw.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        


        
    }    
}
