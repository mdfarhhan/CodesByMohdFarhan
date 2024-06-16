import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("enter a number to count factorial of it: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factorial of the number is  "+fact(n));

    }
    static int fact (int a){
        int ans=1;
        for(int i=1;i<=a;i++){
            ans = ans *i;

        }
        return ans;
    }
}
