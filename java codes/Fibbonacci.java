import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number of terms in fibonacci series: ");
    int n = in.nextInt();
    
    int nt,a=0,b=1,i;
    for(i=1;i<=n;i++)
    {
        System.out.print(a+"  ");
        nt=a+b;
        a=b;
        b=nt;

    }
    }
}
