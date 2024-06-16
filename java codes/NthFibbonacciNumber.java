import java.util.Scanner;

public class NthFibbonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        int i=2;
        while(i<=n)
        {
            temp = b;
            b =a+b;
            a=temp;
            i++;
        }
        System.out.println(b);

    }
}
