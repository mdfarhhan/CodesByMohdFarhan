import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter value of a: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("enter value of b: ");
        b = in.nextInt();
        in.close();
        try {
            c= a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("denominator can never be zero");
        }
        finally{
            System.out.println("unknown error found!");
        }
        

    }
}
