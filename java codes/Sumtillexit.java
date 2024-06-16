import java.util.Scanner;

public class Sumtillexit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=0;
        int n = in.nextInt();
        while(n !=0)
        {
            s = s+n;
            n = in.nextInt();
        }
        System.out.println("sum of numbers is " +s);
    }
}
