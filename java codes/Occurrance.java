import java.util.Scanner;

public class Occurrance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("enter the number to check occurance : ");
        int a = in.nextInt();
        int i=0;
        while(n>0)
        {
            int b;
            b=n%10;
            if (b==a)
            {
                i++;
            }
            n=n/10;

        }
        System.out.println(i);
    }
}
