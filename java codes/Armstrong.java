import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check is armstrong or not: ");
        int n = in.nextInt();
        Checkarmstrong(n);

    }
    static void Checkarmstrong(int n)
    {
        int temp =n;
        int s=0,r;
        while(n>0)
        {
        r =n%10;
        s =s+r*r*r;
        n = n/10;
        }
        if(temp==s)
        {
            System.out.println("entered number is armstrong");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}
