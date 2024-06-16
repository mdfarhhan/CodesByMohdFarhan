import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n%2==0)
        {
            System.out.println("Entered Number is a Even Number");
        }
        else{
            System.out.println("Entered Number is a Odd Number");
        }
    }
}
