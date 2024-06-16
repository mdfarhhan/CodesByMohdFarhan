import java.io.*;

public class EmpolyeeDataRecord {
    public static void main(String[] args) {
        Empolye e1 = new Empolye();
        e1.input(234, "farhan", "+917318039644");
        try {
            FileWriter fw = new FileWriter("Emp.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(e1);
            fw.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
class Empolye{
    int empId;
    String name;
    String PhoneNo;
    void input(int id,String n,String phno){
        empId = id;
        name = n;
        PhoneNo = phno;
    }



}
