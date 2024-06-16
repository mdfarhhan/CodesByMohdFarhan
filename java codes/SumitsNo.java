import java.util.Scanner;

public class SumitsNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sum(n);
    }
    static void sum(int n)
    {
        int s=0,r;
            while(n>0)
            {
            r=n%10;
            s= s+r;
            n =n/10;
            }
            System.out.println("sum is "+s);
    }
}
