import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem;
            rem = n%10;
            sum = sum*10 + rem;
            n = n/10;

            
        }
        System.out.println("reverse number is "+ sum);
    }
}
