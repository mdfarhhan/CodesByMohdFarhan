import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Input a Decimal Number : ");
        int Bin[] = new int[100];
        int rem,i=1;
        rem = n;
        while(rem !=0)
        {
            Bin[i++] = rem%2;
            rem = rem/2;
        }
        System.out.print("Binary number is: ");
        for(int j=i-1; j>0; j--)
        {
            System.out.print(Bin[j]);
        }
        System.out.print("\n");
    

    }
}
