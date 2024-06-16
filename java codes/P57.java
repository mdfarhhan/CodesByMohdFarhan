import java.util.Scanner;

public class P57
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number: ");
    int a =in.nextInt();
    int j=0;
    for(int i=1;i<=a;i++)
    {
        if(a%i==0)
        {
            System.out.println("factor of number is "+i);
            j++;
        }
    }
    System.out.println("Number of Factor is: "+j);
}    
}
