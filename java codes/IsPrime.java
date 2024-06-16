import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check is prime or not: ");
        int n= in.nextInt();
        System.out.println(isPrime(n)); 
        
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int s=2;
        while(s*s<=n){
            if(n%s==0)
            {
                return false;
            }
            s++;
        }
        return s*s>n;
    }
}
